package com.techprimers.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.aws.Student;

@RestController
public class HelloController {

     @RequestMapping("/")
     public String getMessage(){
	return "Hello World";
	}
     @RequestMapping("/student")
     public Student getStudent(){
	return new Student("mark",30,"pakistan");
	}

    }

