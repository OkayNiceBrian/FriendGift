package com.example.FriendGift.friend;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {

	private final FriendRepository friendRepository;
	
	@Autowired
	public FriendService(FriendRepository friendRepository) {
		this.friendRepository = friendRepository;
	}
	
	public List<Friend> getFriends() {
		return friendRepository.findAll();
	}
}
