package com.bridgelabz.demo;

import com.bridgelabz.demo.component.DemoBean;
import com.bridgelabz.demo.component.EmployeeBean;
import com.bridgelabz.demo.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {
    public static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

    public static void main(String[] args) {
        logger.debug("Hello from Bridgelabz");
        logger.debug("hello");
        logger.info("demo");
        logger.error("error");
        logger.warn("warning");
        System.out.println("Hello From Bridgelabz");
        ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
        logger.debug("Checking Context:{}", context.getBean(DemoBean.class));
        logger.debug("\n*** Example using @Autowire annotation on property***");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.seteId(101);
        employeeBean.seteName("Prashanth");
        employeeBean.showEmployeeDetails();

    }

}
