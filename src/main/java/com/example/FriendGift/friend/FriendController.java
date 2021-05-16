package com.example.FriendGift.friend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(path = "api/friend")
public class FriendController {

	private FriendService friendService;
	
	@Autowired
	public FriendController(FriendService friendService) {
		this.friendService = friendService;
	}
	
	@GetMapping
	public List<Friend> getFriends() {
		return friendService.getFriends();
	}
}
