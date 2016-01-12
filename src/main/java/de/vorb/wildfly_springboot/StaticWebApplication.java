package de.vorb.wildfly_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StaticWebApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StaticWebApplication.class, args);
    }

}
