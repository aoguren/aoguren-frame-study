package com.glxt.study.spring.springinaction.chapter2.writingbean;

import org.springframework.stereotype.Component;

public class SgtPeppers implements CompactDisc
{
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play()
	{
		System.out.println("Playing " + title + " by " + artist);
	}

}
