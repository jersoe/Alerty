package com.jersoe.alerty;

public class Controller {
	private View v;
	private Model m;
	
	public Controller() {
		this.v = new View(this);
		this.m=new Model(this);
	}

	public static void main(String[] args) {
		new Controller();
	}

}
