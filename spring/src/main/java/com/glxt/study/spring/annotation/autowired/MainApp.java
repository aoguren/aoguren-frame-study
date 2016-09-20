package com.glxt.study.spring.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/glxt/study/spring/annotation/autowired/beans.xml");
      TextEditor te = (TextEditor) context.getBean("textEditor");
      System.out.println("--------");
      te.spellCheck();
   }
}