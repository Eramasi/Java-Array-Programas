package com.corejava.practice;

public class ActorQualities implements Actor {

	@Override
	public void Dance() {
	System.out.println("Actor knows Dance");
	}

	@Override
	public void Dubbing() {
		System.out.println("Actor Knows Dubbing");
		
	}
	
	public static void main(String[] args)
	{
		Actor act=new ActorQualities();
		act.Dance();
		act.Dubbing();
		act.Singining();
	}

}
