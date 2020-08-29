package crawler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler extends JFrame {

    public JLabel urlLabel;

    public WebCrawler() {
        setTitle("Web Crawler");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(670, 600);

        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JTextArea textArea = textArea();
        JTextField textField = textField();

        JLabel urlLabel = jLabel("Url");
        urlLabel.setText("URL:");

        this.urlLabel = jLabel("TitleLabel");

        JLabel titleLabel = jLabel("urlLabel");
        titleLabel.setText("Title: ");


        contents.add(urlLabel);
        contents.add(textField);
        contents.add(button(textArea, textField));
        contents.add(titleLabel);
        contents.add(this.urlLabel);
        contents.add(new JScrollPane(textArea));

        setContentPane(contents);

        setVisible(true);
    }

    public JTextField textField() {
        JTextField textField = new JTextField(47);
        textField.setName("UrlTextField");
        textField.setVisible(true);
        return textField;
    }

    public JButton button(JTextArea textArea, JTextField textField) {
        JButton button = new JButton("Parse");
        button.setName("RunButton");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String content = getSource(textField.getText());
                urlLabel.setText(getTitle(content));
                textArea.setText(content);
            }
        });
        return button;
    }

    public JLabel jLabel(String name) {
        JLabel jLabel = new JLabel();
        jLabel.setName(name);
        return jLabel;
    }

    public JTextArea textArea() {
        JTextArea TextArea = new JTextArea(30, 58);

        TextArea.setLineWrap(true);
        TextArea.setWrapStyleWord(true);
        TextArea.setName("HtmlTextArea");
        TextArea.disable();
        return TextArea;
    }

    public String getTitle(String content) {
        Pattern p = Pattern.compile("<title>(.*?)</title>", Pattern.DOTALL);
        Matcher m = p.matcher(content);
        while (m.find()) {
            return m.group(1);
        }
        return "OK";
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