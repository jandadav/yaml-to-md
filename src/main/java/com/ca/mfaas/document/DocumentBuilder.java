package com.ca.mfaas.document;

import com.ca.mfaas.data.Message;
import com.ca.mfaas.data.MessageLoader;

import java.util.ArrayList;
import java.util.List;

public class DocumentBuilder {

    private final List<MessageLoader> messageLoaderList = new ArrayList<>();
    private final StringBuilder builder = new StringBuilder();
    private static final String LINE_BREAK = "\n";

    public void add(MessageLoader loader) {
        messageLoaderList.add(loader);
    }

    public String createDocument() {


        for(MessageLoader loader : messageLoaderList) {

            addLine("## "+loader.getName());
            addLine();

            for(Message message : loader.getMessages()) {

                addLine("### "+message.getNumber()+message.getType().toString().charAt(0));
                addLine();

                addLine("  "+message.getText());
                addLine();

                addLine("  **Reason:**");
                addLine();

                addText(message.getReason());

                addLine("  **Action:**");
                addLine();

                addText(message.getAction());

            }
        }

        return builder.toString();
    }

    private void addText(String text) {
        if(text!=null) {
            addLine(text
                    // two spaces on first line
                    .replaceAll("^","  ")
                    // replace every \n in text to have two spaces on new line
                    .replaceAll("\\\n", "\\\n ")
            );
            addLine();
        }
    }

    private void addLine(String line) {
        builder.append(line).append(LINE_BREAK);
    }

    private void addLine() {
        addLine("");
    }
}
