import java.lang.*;
import java.util.*;
public class Game{
	private int Players;
	private double PlayerHeight;
	
	public Game(){System.out.println("Empty cons");}
	public Game(int Players,double PlayerHeight)
	{
		this.Players=Players;
		this.PlayerHeight=PlayerHeight;
		
	}
	public void setPlayers(int Players){
		this.Players=Players;
	}
	public void setPlayerHeight(double PlayerHeight){
		this.PlayerHeight=PlayerHeight;
	}
	public int getPlayers()
	{return Players;}
	public double getPlayerHeight()
	{return PlayerHeight;}
	
	public void details()
	{
		System.out.println("Players:"+Players+"\n"+"Player's Height:"+PlayerHeight);
	}
}