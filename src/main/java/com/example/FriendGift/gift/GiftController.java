package com.example.FriendGift.gift;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/gifts")
public class GiftController {
	
	private GiftService giftService;
	
	public GiftController(GiftService giftService) {
		this.giftService = giftService;
	}
	
	public List<Gift> getGifts() {
		return giftService.getGifts();
	}
}
