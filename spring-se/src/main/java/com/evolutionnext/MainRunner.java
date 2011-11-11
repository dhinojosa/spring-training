package com.evolutionnext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        MemberFilter memberFilter = context.getBean("memberFilter", MemberFilter.class);
        memberFilter.getMembersFilteredByFirstName("Ray");
    }
}
