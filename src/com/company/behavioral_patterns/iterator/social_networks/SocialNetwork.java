package com.company.behavioral_patterns.iterator.social_networks;

import com.company.behavioral_patterns.iterator.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator (String profileEmail);
    ProfileIterator createCoworkersIterator (String profileEmail);
}
