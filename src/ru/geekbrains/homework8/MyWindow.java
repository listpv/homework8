package ru.geekbrains.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class MyWindow extends JFrame
{

//    Доработать проект, который разрабатывали на уроке. Приветствуется творческий подход.
//    Ничего интересного не приходит на ум.
    public MyWindow()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Window");
        setLocation(500,100);
        setSize(500, 300);
        JButton actionButton = new JButton("Action");
        FlowLayout layout = new FlowLayout();
        JPanel panel = new JPanel(layout);
        JLabel label = new JLabel("Hello!");
        JButton exampleButton = new JButton("Example button");
        panel.add(exampleButton);
        panel.add(label);
        actionButton.addActionListener(new ActionListener()      // Появление второго окна.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new MySecondWindow();
            }
        });
        exampleButton.addActionListener(new ActionListener()      // Появляется-исчезвет текст.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(label.isVisible())
                {
                    label.setVisible(false);
                }
                else
                {
                    panel.add(label);
                    label.setVisible(true);
                }
            }
        });
        add(actionButton, BorderLayout.SOUTH);
        add(panel, BorderLayout.NORTH);
        setVisible(true);


/*        setTitle("First Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,600,400);*/

/*        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout());   // выбор компоновщика элементов
        add(jbs[0], BorderLayout.EAST); // добавление кнопки на форму
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);
        add(jbs[3], BorderLayout.NORTH);
        add(jbs[4], BorderLayout.CENTER);
        JButton btn1 = new JButton("btn1");
        add(btn1,BorderLayout.CENTER);*/


/*        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");
        JButton btn4 = new JButton("btn4");
        JButton btn5 = new JButton("btn5");
        JButton btn6 = new JButton("btn6");
        JButton btn7 = new JButton("btn7");
        JButton btn8 = new JButton("btn8");
        JButton btn9 = new JButton("btn9");
        JButton btn10 = new JButton("btn10");
        GridLayout layout = new GridLayout(5,2);
        JPanel btnPanel = new JPanel(layout);
//        setLayout(layout);
//        layout.addLayoutComponent("", btn1);
//        layout.addLayoutComponent("", btn2);
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btnPanel.add(btn3);
        btnPanel.add(btn4);
        btnPanel.add(btn5);
        btnPanel.add(btn6);
        btnPanel.add(btn7);
        btnPanel.add(btn8);
        btnPanel.add(btn9);
        btnPanel.add(btn10);

        add(btnPanel, BorderLayout.SOUTH);
        setVisible(true);*/

/*        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JButton button = new JButton("Button 1 (PAGE_START)");
        add(button, BorderLayout.PAGE_START);
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
        add(button, BorderLayout.CENTER);
        button = new JButton("Button 3 (LINE_START)");
        add(button, BorderLayout.LINE_START);
        button = new JButton("Long-Named Button 4 (PAGE_END)");
        add(button, BorderLayout.PAGE_END);add(button, BorderLayout.SOUTH);
        button = new JButton("5 (LINE_END)");
        add(button, BorderLayout.LINE_END);
        setVisible(true);*/

/*        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Window");
        setLocation(500,100);
        setSize(500, 300);
        JButton actionButton = new JButton("Action");
        FlowLayout layout = new FlowLayout();
        JPanel panel = new JPanel(layout);
        JLabel label = new JLabel("Hello!");
        JButton exampleButton = new JButton("Example button");
        JLabel textField = new JLabel("How are you?");
//        JTextField textfField = new JTextField(null, 10);
//        JTextArea textArea = new JTextArea(3, 4);
//        JRadioButton radioButton = new JRadioButton();
//        JCheckBox checkBox = new JCheckBox();
        panel.add(exampleButton);
        panel.add(label);
//        panel.add(textField);
//        panel.add(textArea);
//        panel.add(radioButton);
//        panel.add(checkBox);
        actionButton.addActionListener(new ActionListener()      // Появление второго окна.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new MySecondWindow();
            }
        });
        exampleButton.addActionListener(new ActionListener()      // Появляется-исчезвет текст.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(label.isVisible())
                {
                    label.setVisible(false);
                }
                else
                    {
                        panel.add(label);
                        label.setVisible(true);
                    }
            }
        });
        add(actionButton, BorderLayout.SOUTH);
        add(panel, BorderLayout.NORTH);
        setVisible(true);*/

/*        setBounds(500,500,500,300);
        setTitle("BoxLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // одну из строк надо закомментировать
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS)); // одну из строк надо закомментировать
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
            add(jbs[i]);
        }
        setVisible(true);*/

/*        setBounds(500,500,500,300);
        setTitle("FlowLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] jbs = new JButton[10];
        setLayout(new FlowLayout());
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("#" + i);
            add(jbs[i]);
        }
        setVisible(true);*/

//        JFrame – окно; JButton – кнопка; JLabel – надпись; JTextField – однострочное текстовое поле;
//        JTextArea – многострочное текстовое поле; JScrollPane – контейнер для пролистывания контента;
//        JMenuBar – верхнее меню программы; JTabel – таблица; JRadioButton – RadioButton; JCheckBox – CheckBox.


/*            setBounds(500,500,500,300);
        setTitle("FlowLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello!");
        JButton jbs = new JButton(" Jbt 1");
        JTextField textfField = new JTextField(null, 10);
        JTextArea textArea = new JTextArea(3, 4);
        JRadioButton radioButton = new JRadioButton();
        JCheckBox checkBox = new JCheckBox();
        add(jbs);
        add(label);
        add(textfField);
        add(textArea);
        add(radioButton);
        add(checkBox);
        setVisible(true);*/




    }

}
