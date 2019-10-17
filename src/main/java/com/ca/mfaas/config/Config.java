package com.ca.mfaas.config;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Config {

    private Yaml yaml = new Yaml();
    private Object obj;
    private Model modelInstance;

    public Config(String configYaml) {

        try(InputStream is = new FileInputStream(configYaml)) {
            modelInstance = (Model) yaml.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };

    }

    public List<String> getMessageFiles() {
        return modelInstance.getProcessedFiles();
    }
}
