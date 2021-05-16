package com.example.FriendGift.gift;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GiftConfig {

	@Bean
	CommandLineRunner commandLineRunnerGift(GiftRepository repository) {
		return args -> {
			Gift fenderJaguar = new Gift(
					"Fender Jaguar",
					"Fender.com",
					"A cool, offbeat Fender guitar."
			);
		
			Gift hondaCivic = new Gift(
					"Honda Civic",
					"Honda.com",
					"A nice, reliable car to drive around in."
			);
			
			repository.saveAll(List.of(fenderJaguar, hondaCivic));
		};
	}
}
