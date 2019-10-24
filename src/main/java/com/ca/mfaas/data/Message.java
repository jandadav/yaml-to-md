package com.ca.mfaas.data;

import lombok.Data;
@SuppressWarnings("unused")
@Data
public class Message{

    public enum MessageType {
        INFO,
        WARNING,
        ERROR
    }

    private String key;
    private String number;
    private MessageType type;
    private String text;
    private String reason;
    private String action;
}