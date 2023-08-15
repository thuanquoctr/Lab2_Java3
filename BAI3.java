/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class BAI3 extends JFrame implements ActionListener{
    
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    
    public BAI3() {
        this.setTitle("BAI3");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        btn1 = new JButton("Message Dialog");
        btn1.setFont(new Font("Serif", Font.BOLD, 17));
        btn2 = new JButton("Input Dialog");
        btn2.setFont(new Font("Serif", Font.BOLD, 17));
        btn3 = new JButton("Confirm Dialog");
        btn3.setFont(new Font("Serif", Font.BOLD, 17));
        btn4 = new JButton("Option Dialog");
        btn4.setFont(new Font("Serif", Font.BOLD, 17));
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
        this.setLayout(new GridLayout(2, 2, 15, 15));
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();
        if (event.equals("Message Dialog")) {
            JOptionPane.showMessageDialog(this, "Please input your name");
            
        }
        
        if (event.equals("Input Dialog")) {
            String name = JOptionPane.showInputDialog("Your name is ");
            if (name != null) {
                JOptionPane.showMessageDialog(this, "Your name is " + name);
            }
        }
        
        if (event.equals("Confirm Dialog")) {
            int ret = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (ret == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Bạn chọn yes");
            } else {
                JOptionPane.showMessageDialog(this, "Bạn chọn no");
            }
            
        }
        
        if (event.equals("Option Dialog")) {
            int messaType = JOptionPane.QUESTION_MESSAGE;
            String[] options = {"Java", "C++", "VB", "PHP", "Perl"};
            int code = JOptionPane.showOptionDialog(this, "What language do you prefer?", "Options Dialog Box", 0, messaType, null, options, "PHP");
            JOptionPane.showMessageDialog(this, "Answer: " + code);
        }
        
    }
    
}
