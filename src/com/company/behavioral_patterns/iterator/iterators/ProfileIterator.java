package com.company.behavioral_patterns.iterator.iterators;

import com.company.behavioral_patterns.iterator.Profile;

public interface ProfileIterator {

    boolean hasNext();
    Profile getNext();
    void reset();
}
