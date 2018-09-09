package model;

import model.classes;
import model.race;


public class character {
	
	private race Race;
	private classes Clas;
	
	private int level;
	private int hit_die;
	private int hpTotal;
	
	private int str, dex, con, cha, intel, wis; 
	
	public character() {
		// TODO Auto-generated constructor stub
		character c = new character();
	}
	
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHit_die() {
		return hit_die;
	}

	public void setHit_die(int hit_die) {
		this.hit_die = hit_die;
	}

	public int getHpTotal() {
		return hpTotal;
	}

	public void setHpTotal(int hpTotal) {
		this.hpTotal = hpTotal;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}
	

	
	public int getModifier(int stat) { 
		int mod = 0;
		if(stat == 8 || stat == 9) {
			mod = -1; 
		}
		
		if (stat == 10 || stat == 11) {
			mod = 0;
		}
		
		if(stat == 12 || stat == 13) {
			mod = 1;
		}
		else if(stat == 14 || stat == 15) {
			mod = 2; 
		}
		else if(stat == 16 || stat == 17) {
			mod = 3; 
		}
		else if(stat == 18 || stat == 19) {
			mod = 4; 
		}
		else if(stat == 20) {
			mod = 5; 
		}
		
		return mod; 
	}


	public race getRace() {
		return Race;
	}


	public void setRace(race race) {
		Race = race;
	}


	public classes getClas() {
		return Clas;
	}


	public void setClas(classes clas) {
		Clas = clas;
	}

}
