package com.codebind;

public class APP
{
	public static void main (String[] args)
	{
		Greeting g = new Greeting();
	
		System.out.println(g.getGreeting(args[0]));
	}
}
