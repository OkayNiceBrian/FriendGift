package com.example.FriendGift.friend;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long>{

	@Query("SELECT f FROM Friend f WHERE f.email = ?1")
	Optional<Friend> findFriendByEmail(String email);
}
