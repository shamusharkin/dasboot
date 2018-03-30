package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
//Tell this application it will be a spring boot applicaiton
@SpringBootApplication
public class App {
    public static void main( String[] args ) {

        System.out.println( "Hello World! + $args" );
        //fire up spring boot!
        SpringApplication.run(App.class, args);
    }
}
