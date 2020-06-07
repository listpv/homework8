package ru.geekbrains.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class MySecondWindow extends JFrame
{
    public MySecondWindow()
    {
        setTitle("Second window");
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setBounds(500,500,500,300);
        JLabel label = new JLabel("Second Window");
        setLayout(null);
        label.setBounds(200, 100, 200, 20);
        add(label);
        setVisible(true);
    }

}
