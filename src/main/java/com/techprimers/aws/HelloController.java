package com.techprimers.aws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<HelloMessage>  hello() {
    	HelloMessage helloMessage = new HelloMessage();
    	helloMessage.setName("hello world");
    	helloMessage.setTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.OK).body(helloMessage);

    }

}
