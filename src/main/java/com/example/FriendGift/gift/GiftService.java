package com.example.FriendGift.gift;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GiftService {

	public List<Gift> getGifts() {
		return List.of(
				new Gift(
						1L,
						"Fender Jaguar",
						"fender.com",
						"A single coil Fender guitar."
				)
		);
	}
}
