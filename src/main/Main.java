package main;
import java.util.Random; 
import model.DiceRoller;
public class Main {
	
	public static Random r = new Random(); 
	public static DiceRoller d = new DiceRoller(); 
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated constructor stub
		int n[] = d.getStats(r); 
		
		for(int i = 0; i < 7; i++) {
			System.out.println(n[i]);
		}
	}

}
