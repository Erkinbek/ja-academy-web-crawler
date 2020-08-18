package crawler;

import javax.swing.*;
import java.io.IOException;

public class WebCrawler extends JFrame {
    public WebCrawler() {
        setTitle("Simple Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        showTextArea();
    }

    public void showTextArea()
    {
        JTextArea TextArea = new JTextArea("HTML code?", 12, 18);
        JPanel contents = new JPanel();
        contents.add(new JScrollPane(TextArea));
        setContentPane(contents);

        TextArea.setLineWrap(true);
        TextArea.setWrapStyleWord(true);
        TextArea.setName("TextArea");
        TextArea.disable();
    }
}