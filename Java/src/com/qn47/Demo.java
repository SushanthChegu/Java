package com.qn47;

class Movie{
	
	Movie(){
		
		System.out.println("This is Parent Class");
		
	}

}


class Actor extends Movie{
	
	Actor(){
		
		System.out.println("Actor is added, Single inheritence");
	}

}

class Srk extends Actor{
	
	Srk(){
		
		System.out.println("Srk is added as the Actor, Multilevel Inheritence");
	}

}

class Actress extends Movie {
	
	Actress(){
		
		System.out.println("Actress is added in the movie, Hierarchical Inheritence");
	}

}

public class Demo {
	
	public static void main(String[] args) {
		
		Srk srk = new Srk();
		Actress a = new Actress();
		
	}

}

