package com.company.behavioral_patterns.mediator;

import com.company.behavioral_patterns.mediator.component.Component;

public interface Mediator {

    void notify (Component sender, String event);
}
