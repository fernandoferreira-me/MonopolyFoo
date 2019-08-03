package br.edu.infnet.fernandogferreira;

public class Dice {
	
	private int faceNumber;
	
	public Dice(){
		
	}
	
	public void roll(){
		this.faceNumber = 3;
	
	}
	
	public int getFaceNumber(){
		return this.faceNumber;
	}
}
