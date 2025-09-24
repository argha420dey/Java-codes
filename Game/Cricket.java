import java.lang.*;
import java.util.*;
public class Cricket extends Game{
	private String Equipment;
	public Cricket(){
		System.out.println("Empty cons");
	}
	public Cricket(int Players,double PlayerHeight,String Equipment){
		super(Players,PlayerHeight);
		this.Equipment=Equipment;
	}
	public void setEquipment(String Equipment){
		this.Equipment=Equipment;
	}
	public String getEquipment()
	{return Equipment;}
	public void details(){
		super.details();
		System.out.println("Equipment for cricket:"+Equipment);
	}
}