package com.example.FriendGift.gift;

import java.util.List;

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
