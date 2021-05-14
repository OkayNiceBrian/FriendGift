package com.example.FriendGift.Friend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(path = "api/friends")
public class FriendController {

	private FriendService friendService;
	
	public FriendController(FriendService friendService) {
		this.friendService = friendService;
	}
	
	public List<Friend> getFriends() {
		return friendService.getFriends();
	}
}
