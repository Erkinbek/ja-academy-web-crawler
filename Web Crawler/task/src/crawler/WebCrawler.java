package crawler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class WebCrawler extends JFrame {

    public String source;

    public WebCrawler() {
        setTitle("Web Crawler");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 600);

        JPanel contents = new JPanel();

        JTextArea textArea = textArea();
        JTextField textField = textField();

        contents.add(textField);
        contents.add(button(textArea, textField));
        contents.add(new JScrollPane(textArea));

        setContentPane(contents);

        setVisible(true);
    }

    public JTextField textField() {
        JTextField textField = new JTextField(45);
        textField.setName("UrlTextField");
        textField.setVisible(true);
        return textField;
    }

    public JButton button(JTextArea textArea, JTextField textField) {
        JButton button = new JButton("Get text!");
        button.setName("RunButton");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textArea.setText(getSource(textField.getText()));
            }
        });
        return button;
    }


    public JTextArea textArea() {
        JTextArea TextArea = new JTextArea(30, 52);

        TextArea.setLineWrap(true);
        TextArea.setWrapStyleWord(true);
        TextArea.setName("HtmlTextArea");
        TextArea.disable();
        return TextArea;
    }

    public String getSource(String url) {
        try (InputStream inputStream = new BufferedInputStream(new URL(url).openStream())) {
            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Failed";
    }
}