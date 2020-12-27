package com.cetin.cvbackend.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import com.cetin.cvbackend.Profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileService {

    private final UserProfileDataAccessService userProfileDataAccessService;

    @Autowired
    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    List<UserProfile> getUserProfiles(){
        return userProfileDataAccessService.getUserProfiles();
    }

}
