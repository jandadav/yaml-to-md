package com.ca.mfaas.data;

import java.util.ArrayList;
import java.util.List;

public class MessageLoader {
    
    private final List<Message> messages = new ArrayList<>();

    public MessageLoader(String messageYaml) {
        
    }

    public List<Message> getMessages() {
        return this.messages;
    }

}