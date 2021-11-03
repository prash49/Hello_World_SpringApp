package com.bridgelabz.demo;

import com.bridgelabz.demo.component.DemoBean;
import com.bridgelabz.demo.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {
  //  public static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

    public static void main(String[] args) {
//        logger.debug("Hello from Bridgelabz");
//        logger.debug("hello");
//        logger.info("demo");
//        logger.error("error");
//        logger.warn("warning");
        System.out.println("Hello From Bridgelabz");
        ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
//        DemoBean demoBean = context.getBean(DemoBean.class);
//        logger.debug("Demo Bean = " + demoBean.toString());
//        System.out.println(context.getBean(HelloRestController.class));
    }

}
