
public class Student
{
	int id;
	String name;
	float cgpa;
	
	public void setId(int i)
	{
		id = i;
	}

	public void setName(String n)
	{
		name = n;
	}

    public void setCgpa(float c)
	{
		cgpa = c;
	}
	
	public String getName()
	{
		return name;
	}

    public int getId()
	{
		return id;
	}
	
	public float getCgpa()
	{
		return cgpa ;
	}
	
	public void details()
	{
		System.out.println("\nID: " + id + "\nName: " + name + "\nCGPA: " + cgpa);
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		
		s1.setId(675);
		System.out.println("\nID: " + s1.getId());
		
		s1.setName("John"); 
		System.out.println("Name: " + s1.getName());
		
		s1.setCgpa(3.5F);
		System.out.println("CGPA: " + s1.getCgpa());
				
		Student s2 = new Student();
		
		s2.details();
	}
}