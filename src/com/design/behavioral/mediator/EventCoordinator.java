package com.design.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class EventCoordinator implements IMediator{

    List<Attendee> attendeeList;
    List<Vendor> vendorList;
    List<Organizer> organizerList;

    List<Participant> participantList;

    List<String > attendees = new ArrayList<>();

    @Override
    public void postUpdates(String update) {

    }

    @Override
    public void receiveUpdates(String update) {

    }

    @Override
    public void register(Participant participant) {
        attendeeList.add((Attendee) participant);
        String msg = "Added user "+ participant.name + " from event";
        attendees.add(participant.name);
        broadCastMessage(msg);
    }

    @Override
    public void cancelRegistration(Participant participant) {
        String msg = "Removed user "+ participant.name + " from event";
        attendees.stream().filter(curName -> !curName.equals(participant.name)).toList();
        broadCastMessage(msg);
    }

    @Override
    public void advertise(String advertisement) {
        String msg = "Item is being sold "+advertisement;
        broadCastMessage(msg);
    }

    void broadCastMessage(String msg){
        for(Participant participant : participantList){
            participant.readMessage(msg);
        }
    }
}
