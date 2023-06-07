package com.calculator.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		
         System.out.println("Merhaba Dünya");
		
         Calculator calcu = new Calculator(1, 2);
              
                  
		System.out.println("toplam--> "+calcu.sub());
	}

	
	@RestController
	@RequestMapping("/test")
	class HelloWorldController {

	    @GetMapping
	    public String hello() {
	        return "Hello, World!";
	    }
	}
	
}
