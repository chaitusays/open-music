package com.openmusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class })
@ComponentScan("com.openmusic")
public class OpenMusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenMusicApplication.class, args);
	}

}
