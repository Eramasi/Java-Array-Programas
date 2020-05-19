package com.corejava.practice;

public interface Actor {
	
	void Dance();
	void Dubbing();
	default void Singining()
	{
		System.out.println("Actor knows Singining:");
	}
	

}
