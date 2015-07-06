import java.util.*;
public class Main1 {
 
    public static void main(String[] args){
        Integer i;
		Double d; 
 
		System.out.println("How many entries you have to count? Enter this number: ");
        while((i = tryGetInteger()) == null) {
            System.out.println("Enter an integer value,please: ");
        }
 
        for(int j = 0; j < i; j++){
            System.out.println();
            System.out.print("Enter of base: ");       
			while((d = tryGetDouble()) == null) {
				System.out.println("Enter a double value,please: ");
			}
			double base = d;
            System.out.println("You entered a base = " + base);
            System.out.print("Enter of power: ");
			while((d = tryGetDouble()) == null) {
				System.out.println("Enter a double value,please: ");
			}
            double pow = d;
            System.out.println("You entered a power = " + pow); 
 
            Power power;
			
			double eps = 0.0001;
			//if((pow%1 < (1 - eps)) && (pow%1 > eps)){
			if(pow%1 > eps){
				System.out.println("FrP");
				power = new FractionPower();
			}
			else{
				if(pow < 0) power = new NegativePower();
				else power = new PositivePower();
			}
			
            TestPower(power, base, pow); 
        }
    }
 
    private static void TestPower(Power power, double base, double exponent){
        double result = power.pow(base, exponent);
        System.out.println("The number " + base + " in the same degree " + exponent + " = " + result); 
    }
 
    public static Double tryGetDouble(){
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        try{
            return new Double(line);
        }
        catch (NumberFormatException ex){
            return null;
        }
    }
	
	public static Integer tryGetInteger(){
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        try{
            return new Integer(line);
        }
        catch (NumberFormatException ex){
            return null;
        }
    }
 
}