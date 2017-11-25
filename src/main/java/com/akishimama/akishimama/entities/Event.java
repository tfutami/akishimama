package com.akishimama.akishimama.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Event {
    @Id
    private long id;
    private String event_name;

    public Event(long id, String event_name) {
        this.id = id;
        this.event_name = event_name;
    }

    public Event() {
    }
}
