package java.project.basic.example;

class Employee{
	String name = "Shrikrushna";
	int rollNo = 141097;
	
	void display(){
		System.out.println(name);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.display();
	}
}