import java.lang.*;
import java.util.*;
public class Football extends Game{
	private int Footballsize;
	public Football(){
		System.out.println("Empty cons");
	}
	public Football(int Players,double PlayerHeight,int Footballsize){
		super(Players,PlayerHeight);
		this.Footballsize=Footballsize;
	}
	public void setFootballsize(int Footballsize){
		this.Footballsize=Footballsize;
	}
	public int getFootballsize()
	{return Footballsize;}
	public void details(){
		super.details();
		System.out.println("Football Size:"+Footballsize);
	}
}