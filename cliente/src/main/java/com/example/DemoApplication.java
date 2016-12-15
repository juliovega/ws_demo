package com.example;

import com.example.stubs.HelloWorld;
import com.example.stubs.HelloWorldImplService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        HelloWorldImplService service = new HelloWorldImplService();
        HelloWorld servicePort = service.getHelloWorldImplPort();
        System.out.println(servicePort.getHelloWorldAsString("julio"));
    }

    @Bean
    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        @SuppressWarnings("UnnecessaryLocalVariable")
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        return factory;
    }
}
