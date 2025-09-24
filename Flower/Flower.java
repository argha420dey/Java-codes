import java.lang.*;
public class Flower
{
	int id;
    String name;
    String color;
	int price;
	
	public Flower()
	{
		System.out.println("Nothing");
	}
	
	public Flower(int id,String name,String color,int price)
	{
		this.id=id;
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void details()
	{
		System.out.println("Flower id:"+id);
		System.out.println("Flower name:"+name);
		System.out.println("Flower color:"+color);
		System.out.println("Flower Price:"+price);
	}
	
	public static void main(String[] args)
	{
	Flower f1=new Flower();
	f1.setName("Rose");
	f1.setId(12123);
	f1.setColor("Red");
	f1.setPrice(100);
	System.out.println(f1.getName());
	System.out.println(f1.getId());
	System.out.println(f1.getColor());
	System.out.println(f1.getPrice());
	Flower f2=new Flower(1232,"Lily","Red",1000);
	f2.details();
	}
}