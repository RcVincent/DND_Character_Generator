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


	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

}
