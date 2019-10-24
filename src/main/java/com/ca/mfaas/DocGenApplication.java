package com.ca.mfaas;

import com.ca.mfaas.config.Config;
import com.ca.mfaas.data.MessageLoader;
import com.ca.mfaas.document.DocumentBuilder;

import java.io.*;

public class DocGenApplication {

    public static void main(String[] args) {

        if(args.length != 1) {
            System.out.println("Incorrect argument count. Usage: java -jar Docgen-1.0.jar <PATH_TO_CONFIG_YAML>");
            System.exit(-1);
        }

        Config config = Config.fromFile(args[0]);

        DocumentBuilder builder = new DocumentBuilder();
        config.getMessageFiles().forEach(s -> builder.add(new MessageLoader(s)));
        String doc = builder.createDocument();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(config.getOutputFile()))) {
            writer.write(doc);
        } catch (IOException e) {
            System.out.println("Exception while writing output file: "+config.getOutputFile());
        }

        System.out.println("Documentation has been created in output file: "+config.getOutputFile());
        System.out.println("Have a nice day");
    }
}
