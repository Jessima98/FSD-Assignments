
 class Kid {

	public int id;
	public String name;
	public int age;
	public String profession;
	
	public Kid(int id, String name, int age, String profession)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.profession=profession;
		System.out.print(id+" "+name+" "+age+" "+profession);
	}
	
 }	
	
 class Student extends Kid
	{
		 int mark;
		public Student(int id, String name, int age, String profession, int mark)
		{
			super(id,name,age,profession);
			this.mark=mark;
			System.out.println(" "+mark);
		}
	}
 class Teacher extends Kid
	{
		 int salary;
		public Teacher(int id, String name, int age, String profession, int salary)
		{
			super(id,name,age,profession);
			this.salary=salary;
			System.out.print(" "+salary);
		}
	}
 
	public class Inherit
	{
		public static void main(String[] args)
		{
		Student stu=new Student(1,"Jessi",23,"Engineer",100);
		Teacher tec=new Teacher(2,"Chirag",22,"Engineer",10000);
		
		}
	}

