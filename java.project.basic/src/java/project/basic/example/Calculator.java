package java.project.basic.example;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	
	public void add(){
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	public void subtract(){
		int sub = num1 - num2;
		System.out.println(sub);
	}
	
	public void div(){
		int div = num1/num2;
		System.out.println(div);
	}
	
	public void multiply(){
		int mul = num1 * num2;
		System.out.println(mul);
	}
	
	public void printSum(){
		int total = (num1 + num2) + (num1 - num2) + (num1 * num2) + (num1/num2);
		System.out.println("Total sum of All arithmatic operations:" + total);
	}
	
		
	public static void main(String [] args){
		Calculator c1 = new Calculator();
		c1.add();
		c1.subtract();
		c1.div();
		c1.multiply();
		c1.printSum();
		
	}
}