package java.project.basic.example;

class PrintValue{
	static int val= 10;
	
	public void dispaly(){
		System.out.println(val);
		val++; 
	}
	
	public static void main(String[] args){
		PrintValue p1 = new PrintValue();
		p1.dispaly();
		PrintValue p2 = new PrintValue();
		p1.dispaly();
		
	}
}