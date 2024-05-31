package org.example.it355dz09.jms;

import org.springframework.stereotype.Service;

@Service
public class JmsListener {
    @org.springframework.jms.annotation.JmsListener(destination = "ak5000")
    public void listener(String message){
        System.out.println("Pristigla poruka je " + message);
    }
}
