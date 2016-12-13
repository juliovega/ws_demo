package restSoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import restSoap.stubs.UserImplService;
import restSoap.stubs.UserP;

@SpringBootApplication
public class RestSoapApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestSoapApplication.class, args);
        UserImplService uService = new UserImplService();
        UserP userP = uService.getUserImplPort();
        System.out.println("tu id es"+userP.validateUserAndPass("1","1"));
    }

    @Bean
    public EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        @SuppressWarnings("UnnecessaryLocalVariable")
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        return factory;
    }
}
