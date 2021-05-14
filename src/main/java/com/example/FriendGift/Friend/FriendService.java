package com.example.FriendGift.friend;

import java.util.List;

public class FriendService {

	public List<Friend> getFriends() {
		return List.of(
				new Friend(
						1L,
						"Brian",
						"Jackson",
						"1998-09-08"
				)
		);
	}
}
