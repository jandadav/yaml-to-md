package com.ca.mfaas.data;

import lombok.Data;
@SuppressWarnings("unused")
public class Message{
    private String key;
    private String number;
    private String type;
    private String text;
    private String reason;
    private String action;
}