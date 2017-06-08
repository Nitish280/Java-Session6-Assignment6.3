
public class Student {
	int id=10;
	String name="Nitish";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();//creating an object of Student  
		System.out.println("print the value of id: " +s1.id); //here print the value of id with the refrence of object 
		System.out.println("print the value of name: " + s1.name); //here print the value of name with the refrence of object 
		
		s1.id=20;//here we are changing the value of id
		s1.name="Singh";//here we are changing the value of id
		
		System.out.println("print the value of id: " +s1.id); //here print the changing value of id with the refrence of object 
		System.out.println("print the value of name: " + s1.name); //here print the value of id with the refrence of object

	}

}
