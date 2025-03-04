package com.prokopchuk.mypall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.prokopchuk.mypall")
public class MyPallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyPallApplication.class, args);
    }
}
