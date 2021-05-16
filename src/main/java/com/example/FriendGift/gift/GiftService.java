package com.example.FriendGift.gift;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftService {

	private final GiftRepository giftRepository;
	
	@Autowired
	public GiftService(GiftRepository giftRepository) {
		this.giftRepository = giftRepository;
	}
	
	public List<Gift> getGifts() {
		return giftRepository.findAll();
	}
}
