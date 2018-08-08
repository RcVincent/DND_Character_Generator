package model;

import java.util.Random;

public class DiceRoller {
	private Random r;

	public DiceRoller() {
		// TODO Auto-generated constructor stub
	}

	public int getRoll(Random r) {
		return r.nextInt(6) + 1; 
	}

	public int[] getStats(Random r) {
		int[] total = new int[7]; 
		//int d1, d2, d3;
		int[] dice = new int[3]; 

		for(int k = 0; k < 7; k++) {
			for(int i = 0; i < 3; i++) {
				dice[i]= getRoll(r);

				if(dice[i] == 1) {
					dice[i] = getRoll(r); 
				}
				total[i] += dice[i];

			}
		}
		return total;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

}
