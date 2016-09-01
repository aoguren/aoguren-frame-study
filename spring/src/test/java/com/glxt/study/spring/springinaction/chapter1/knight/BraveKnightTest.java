package com.glxt.study.spring.springinaction.chapter1.knight;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testEmbarkOnQuest()
	{
		Quest mockQuest = mock(RescueDamselQuest.class);
	    BraveKnight knight = new BraveKnight(mockQuest);
	    knight.embarkOnQuest();
	    verify(mockQuest, times(1)).embark();
	    
	   
	}

}
