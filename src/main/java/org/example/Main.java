package org.example;

import org.example.bean.SpringBean1;
import org.example.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        SpringBean1 springBean1=context.getBean(SpringBean1.class);
        SpringBean1 springBean2=context.getBean(SpringBean1.class);
        SpringBean1 springBean3=context.getBean(SpringBean1.class);
//        boolean test= SpringBean1 == SpringBean2;
//        System.out.println("SpringBean1 and SpringBean2 are the same?" + test);
    }
}