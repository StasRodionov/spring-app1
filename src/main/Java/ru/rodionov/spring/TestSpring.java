package ru.rodionov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        TestBean test = context.getBean("testBean", TestBean.class);
        TestBean test1 = context.getBean("testBean1", TestBean.class);
        System.out.println(test.getName());
        System.out.println(test1.getName());
        context.close();
    }

}
