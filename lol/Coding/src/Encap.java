class Girl
{
	private int id;
	private String name;
	
	
public void setId(int id)
{
	this.id=id;
}
public int getId() throws Exception
{
	if(id<0)
	{
		throw new Exception("Id canot be negative");
	}
	return id;
}
public void setName(String name)
{
	
	this.name=name;
}
public String getName()throws Exception
{
	if(name.isEmpty())
	{
		throw new Exception("Name cannot be null");
	}
	
	return name;
}
}
public class Encap {
	public static void main(String[] args)throws Exception
	{
		Girl s =new Girl();
		s.setId(-5);
		s.setName("");
		System.out.println(s.getId()+" "+s.getName());
	}

}
