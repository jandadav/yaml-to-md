package com.ca.mfaas.config;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Config {

    private Yaml yaml = new Yaml();
    private ConfigModel modelInstance;
    private static Config configInstance;

    public static Config fromFile(String configYaml) {
        if (configInstance==null) {
            configInstance = new Config(configYaml);
        }
        return configInstance;
    }

    private Config(String configYaml) {

        try(InputStream is = new FileInputStream(configYaml)) {
            modelInstance = (ConfigModel) yaml.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getMessageFiles() {
        return modelInstance.getProcessedFiles();
    }

    public String getOutputFile() {
        return modelInstance.getOutputFile();
    }
}
