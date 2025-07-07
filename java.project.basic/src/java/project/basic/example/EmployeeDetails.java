package java.project.basic.example;

class EmployeeDetails{
	static String fName = "Aniket";
	static String lName = "Milkhe";
	static int empId = 2402;
	static String address = "Sai Nagar";
	static int managerId = 1410;
	static String phoneNo = "+919632968574";
	
	public void updatePrimaryInfo(){
		fName = "Shrikrushna";
		lName = "Shinde";
		empId = 1410;
		managerId = 5689;
	}
	
	public void updateSecondaryInfo(){
		address = "Amravati, 444606";
		phoneNo = "+918806476449";
	}
	
	public void displayPrimaryInfo(){
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(empId);
		System.out.println(managerId);
	}
	
	public void displayOtherInfo(){
		System.out.println(address);
		System.out.println(phoneNo);
		
	}
	
	public static void displayAllInfo(){
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(empId);
		System.out.println(managerId);
		System.out.println(address);
		System.out.println(phoneNo);
	}
	
	public static void main(String[] args){
		displayAllInfo();
		
		EmployeeDetails e1 = new EmployeeDetails();
		
   
    e1.updatePrimaryInfo();       // Updates primary info
    e1.updateSecondaryInfo();     // Updates secondary info
	  e1.displayAllInfo();   

  	}
}