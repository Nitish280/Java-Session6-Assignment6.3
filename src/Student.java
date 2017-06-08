
public class Student {
	int id=10;
	String name="Nitish";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println("print the value of id: " +s1.id);  
		System.out.println("print the value of name: " + s1.name); 
		
		s1.id=20;
		s1.name="Singh";
		
		System.out.println("print the value of id: " +s1.id);  
		System.out.println("print the value of name: " + s1.name); 

	}

}
