class ArithmeticOperation{
	
	public static void main(String args[]){
		
		System.out.println("Welcome to ArithmeticOperation");
		
		addition();
		substraction();
	}
	
	public static void addition(){
		
		int value1 = 10; //int is DataType - 
		int value2 = 20;
		
		int result = value1 + value2;
		
		System.out.println("Addition of two value is-"+result);
		
		//System.out.println("Addition of two value is-"+ (value1 + value2));
		
	}
	
	public static void substraction(){
		
		int value3 = 30;
		int value4 = 10;
		
		int res = value3 - value4;
		
		System.out.println("Substraction of 2 number is-" +res);
		
	}
public static void multiplication(){
		
		int value5 = 30;
		int value6 = 10;
		
		int multi = value5 - value6;
		
		System.out.println("Multiplication of 2 number is-" +multi);
		
	}
public static void division(){
		
		int value7 = 30;
		int value8 = 10;
		
		int divi = value7 - value8;
		
		System.out.println("Division of 2 number is-" +divi);
		
	}
	
}