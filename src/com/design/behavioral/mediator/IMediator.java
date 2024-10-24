package com.design.behavioral.mediator;

public interface IMediator {
    void postUpdates(String update);
    void receiveUpdates(String update);
    void register(Participant participant);
    void cancelRegistration(Participant participant);
    void advertise(String advertisement);
}


//Organizer -> Can post updates about timings, venue.
//Attendees -> Can register to come to the event. Can cancel the registration.
//Vendors -> Can advertise about the kind of stalls they are keeping.
//Event Coordinator -> Is the central point of contact. Any communication between any two parties is made through event coordinator.