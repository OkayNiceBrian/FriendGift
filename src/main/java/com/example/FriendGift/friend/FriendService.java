package com.example.FriendGift.friend;

import java.util.List;
import java.util.Optional;

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

	public void addNewFriend(Friend friend) {
		// Check if email already exists
		Optional<Friend> friendOptional = friendRepository.findFriendByEmail(friend.getEmail());
		if (friendOptional.isPresent()) {
			throw new IllegalStateException("email taken");
		}
		friendRepository.save(friend);
	}
}
