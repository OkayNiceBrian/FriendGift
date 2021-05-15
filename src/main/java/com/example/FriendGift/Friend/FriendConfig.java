package com.example.FriendGift.friend;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FriendConfig {

	@Bean
	CommandLineRunner commandLineRunner(FriendRepository repository) {
		return args -> {
			Friend brian = new Friend(
					"Brian",
					"Jackson",
					LocalDate.of(1998, 9, 8)
			);
		
			Friend vince = new Friend(
					"Vince",
					"Mejia",
					LocalDate.of(1999, 6, 10)
			);
			
			repository.saveAll(List.of(brian, vince));
		};
	}
}
