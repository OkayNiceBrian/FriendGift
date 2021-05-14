package com.example.FriendGift.gift;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/gift")
public class GiftController {
	
	private GiftService giftService;
	
	@Autowired
	public GiftController(GiftService giftService) {
		this.giftService = giftService;
	}
	
	@GetMapping
	public List<Gift> getGifts() {
		return giftService.getGifts();
	}
}
