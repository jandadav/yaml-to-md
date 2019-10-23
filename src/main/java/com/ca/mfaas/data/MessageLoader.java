package com.ca.mfaas.data;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MessageLoader {
    
    private Messages messages;
    private static final Yaml yaml = new Yaml(new Constructor(Messages.class));
    private String name;

    public MessageLoader(String messageYaml) {

        if(messageYaml ==null || messageYaml.isEmpty()) {
            throw new IllegalArgumentException("Constructor argument must be non-null and not empty");
        }

        this.name = messageYaml;
        try(InputStream is = new FileInputStream(messageYaml)) {


            messages = (Messages) yaml.load(is);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Message> getMessages() {
        return messages.getMessages();
    }

    public String getName() {return this.name;}

}