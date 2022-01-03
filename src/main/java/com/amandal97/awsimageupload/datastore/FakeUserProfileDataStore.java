package com.amandal97.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.amandal97.awsimageupload.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore {
	
	private static final List<UserProfile> USER_PROFILES = new ArrayList<UserProfile>();
	
	static {
		USER_PROFILES.add(new UserProfile(UUID.fromString("62f4653d-07c7-43bd-bc90-9c4e2ca9f6c6"), "lewishamilton", null));
		USER_PROFILES.add(new UserProfile(UUID.fromString("798605f6-b474-4245-afaa-8503cf4c032d"), "maxverstappen", null));
	}
	
	public List<UserProfile> getUserProfiles() {
		return USER_PROFILES;
	}
	
}
