package com.example.FriendGift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("module-service")
public class FriendGiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendGiftApplication.class, args);
	}
}
