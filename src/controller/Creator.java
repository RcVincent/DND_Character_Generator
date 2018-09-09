package controller;

import model.*; 
import java.util.Random;

public class Creator {
	character c = new character(); 
	DiceRoller d = new DiceRoller(); 
	
	public Creator() {}
	
	
	public int[] getStats(Random r) {
		int[] total = new int[7]; 
		//int d1, d2, d3;
		int[] dice = new int[3]; 

		for(int k = 0; k < 7; k++) {
			for(int i = 0; i < 3; i++) {
				dice[i]= d.getRoll(r);

				if(dice[i] == 1) {
					dice[i] = d.getRoll(r); 
				}
				total[i] += dice[i];

			}
		}
		return total;
	}
	
	public int getConMod(character ch) {
		int cmod = 0;
		cmod = ch.getModifier(ch.getCon());
		return cmod; 
	}
	
	public int getHitDie(character ch) {
		int die = 0; 
		//if(ch.getClas().equals(BARD) )
		return 0;
	}
	public int rollHP(character ch) {
		int dice = ch.getLevel();
		int range = ch.getHit_die();
		int n = 0;
		for(int i = 0; i < dice; i++) {
			 n += d.getR().nextInt(range + 1);
		}
		return 0;
	}
}
