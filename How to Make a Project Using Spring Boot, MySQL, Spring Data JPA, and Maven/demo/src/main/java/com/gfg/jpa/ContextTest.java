package com.gfg.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.gfg.jpa");
        appContext.refresh();

        ContextService contextService = (ContextService) appContext.getBean("contextService");
        contextService.test();

        appContext.close();

    }

}
