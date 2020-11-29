package com.cetin.cvbackend.datastore;
import com.cetin.cvbackend.profile.UserProfile;
import org.springframework.stereotype.Repository;


import java.util.UUID;
import java.util.List;
import java.util.ArrayList;


@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "maxMustermann", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "juliaMustermann", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}