package main;
import java.util.Random; 
import model.DiceRoller;
import controller.Creator;
public class Main {
	
	public static Random r = new Random(); 
	public static DiceRoller d = new DiceRoller(); 
	public static Creator c = new Creator(); 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated constructor stub
		int n[] = c.getStats(r); 
		
		for(int i = 0; i < 7; i++) {
			System.out.println(n[i]);
		}
	}

}
