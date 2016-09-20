package com.glxt.study.spring.annotation.qualifier;

public class SpellChecker {
	private String name;
   public SpellChecker(){
      System.out.println("Inside SpellChecker constructor." );
   }
   
   public SpellChecker(String name){
	   this.name = name;
	      System.out.println("SpellChecker: " + this.name);
   }
   public void checkSpelling(){
      System.out.println(this.name + ": Inside checkSpelling." );
   }
   
}