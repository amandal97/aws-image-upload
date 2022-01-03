package com.amandal97.awsimageupload.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amandal97.awsimageupload.datastore.FakeUserProfileDataStore;

@Repository
public class UserProfileDataAccessService {

	private final FakeUserProfileDataStore fakeUserProfileDataStore;
	
	@Autowired
	public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
		this.fakeUserProfileDataStore = fakeUserProfileDataStore;
	}
	
	List<UserProfile> getUserProfiles() {
		return fakeUserProfileDataStore.getUserProfiles();
	}
	
}