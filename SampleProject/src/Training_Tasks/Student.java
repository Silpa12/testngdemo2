package Training_Tasks;

public class Student {
	
	int id;
	String name;
	
	public void records(int id,String name) {
		
		id=id;
		name=name;
		System.out.println("id = " + id);
		System.out.println("name = "+ name);
		
	}
	
	public static void main(String args[]) {
		
		Student s1=new Student();
		s1.records(12,"anu");
		
		
	}

}
