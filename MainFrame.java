package com.chrisstubbs;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JButton button;
    private JTextArea textArea;

    public MainFrame() {
        super("Get Booted");
        JLabel label = new JLabel();
        setLayout(null);

        textArea = new JTextArea("Type in host address");
        add(textArea);
        textArea.setBounds(100, 100, 200, 20);

        button = new JButton("Click to get Website's IP");
        button.setBounds(100, 250, 200, 20);
        add(button);
        button.addActionListener(e -> {
            try {
                String address = textArea.getText();

                String iP = java.net.InetAddress.getByName(address).getHostAddress();
                 label.setText("IP of " + address + " is " + iP);

                add(label);
                label.setBounds(100, 175, 300, 20);
                textArea.setText(null);
            } catch (Exception e1) {
                String error = "Re-enter address. " + "Ex: www.facebook.com";
                textArea.setText(error);
            }
        });

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
