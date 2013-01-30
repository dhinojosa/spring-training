package com.evolutionnext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Running");
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        MemberFilter memberFilter = context.getBean("memberFilter", MemberFilter.class);
        System.out.println(">>>" + memberFilter.getMembersFilteredByFirstName("Ray"));
    }
}
