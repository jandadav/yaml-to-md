package com.ca.mfaas.config;

import lombok.Data;

import java.util.List;

@Data
public class ConfigModel {
    public List<MessageFile> messageFiles;
    public String outputFile;

}
