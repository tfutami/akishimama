package com.akishimama.akishimama.Controller;

import com.akishimama.akishimama.entities.Event;
import com.akishimama.akishimama.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToppageController {

    @Autowired
    EventRepository eventRepository;

    @RequestMapping("/top")
    public String showEvents(Model model){
        this.eventRepository.save(new Event(1L, "event-1"));
        model.addAttribute("events", this.eventRepository.findOne(1L));
        return "showEvents";
    }
}
