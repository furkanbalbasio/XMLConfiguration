package com.balbasio.XMLComfiguration.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        GameRunner gameRunner=context.getBean("gamerunner", GameRunner.class);
        gameRunner.run();
    }
}
