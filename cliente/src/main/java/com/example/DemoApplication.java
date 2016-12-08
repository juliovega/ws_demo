package com.example;

import com.example.stubs.HelloWorld;
import com.example.stubs.HelloWorldImplService;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
                HelloWorldImplService service=new HelloWorldImplService();
                HelloWorld servicePort = service.getHelloWorldImplPort();
                System.out.println(servicePort.getHelloWorldAsString("julio"));
	}
}
