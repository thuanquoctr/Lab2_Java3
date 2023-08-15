/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author DELL
 */
public class BAI1 extends JFrame implements ActionListener {

    private JLabel name;
    private JTextField txtname;
    private JLabel Address;
    private JTextArea txtAddress;
    private JLabel sex;
    private JRadioButton male;
    private JRadioButton female;
    private JLabel Qualification;
    private JComboBox cbx;
    private JLabel Hobby;
    private JCheckBox Reading;
    private JCheckBox Singing;
    private JCheckBox Dancing;
    private JButton validate;
    private JButton reset;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private ButtonGroup grsex;
    private JPanel p7;
    private JPanel p8;
    private JPanel p9;
    private JPanel p10;
    private ButtonGroup grhobby;
    private JPanel p11;

    public BAI1() {
        this.setTitle("BAI1");
        this.setSize(650, 430);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        name = new JLabel("Name: ");
        name.setFont(new Font("Serif", Font.BOLD, 17));
        p1 = new JPanel();
        p1.setBounds(20, 15, 50, 30);
        p1.add(name);

        txtname = new JTextField();
        txtname.setPreferredSize(new Dimension(220, 45));
        txtname.setFont(new Font("Serif", Font.BOLD, 17));
        p2 = new JPanel();
        p2.setBounds(90, 13, 220, 50);
        p2.add(txtname);

        Address = new JLabel("Address: ");
        Address.setFont(new Font("Serif", Font.BOLD, 17));
        p3 = new JPanel();
        p3.setBounds(20, 95, 65, 30);
        p3.add(Address);

        txtAddress = new JTextArea();
        txtAddress.setPreferredSize(new Dimension(280, 100));
        txtAddress.setFont(new Font("Serif", Font.BOLD, 17));
        p4 = new JPanel();
        p4.setBounds(90, 93, 280, 120);
        p4.add(txtAddress);

        sex = new JLabel("Sex: ");
        sex.setFont(new Font("Serif", Font.BOLD, 17));
        p5 = new JPanel();
        p5.setBounds(10, 225, 60, 30);
        p5.add(sex);

        male = new JRadioButton("Male");
        male.setFont(new Font("Serif", Font.BOLD, 17));
        female = new JRadioButton("Female");
        female.setFont(new Font("Serif", Font.BOLD, 17));
        p6 = new JPanel();
        p6.setLayout(new GridLayout(2, 1));
        p6.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        p6.setBounds(90, 223, 100, 80);
        p6.add(male);
        p6.add(female);
        grsex = new ButtonGroup();
        grsex.add(male);;
        grsex.add(female);

        Qualification = new JLabel("Qualification: ");
        Qualification.setFont(new Font("Serif", Font.BOLD, 17));
        p7 = new JPanel();
        p7.setBounds(380, 15, 100, 30);
        p7.add(Qualification);

        Object[] ob = new Object[]{"Graduate", "Student"};
        cbx = new JComboBox(ob);
        cbx.setFont(new Font("Serif", Font.BOLD, 17));
        cbx.setPreferredSize(new Dimension(120, 40));
        p8 = new JPanel();
        p8.setBounds(480, 15, 150, 45);
        p8.add(cbx);

        Hobby = new JLabel("Hobby: ");
        Hobby.setFont(new Font("Serif", Font.BOLD, 17));
        p9 = new JPanel();
        p9.setBounds(380, 95, 65, 30);
        p9.add(Hobby);

        Reading = new JCheckBox("Reading");
        Reading.setFont(new Font("Serif", Font.BOLD, 17));
        Singing = new JCheckBox("Singing");
        Singing.setFont(new Font("Serif", Font.BOLD, 17));
        Dancing = new JCheckBox("Dancing");
        Dancing.setFont(new Font("Serif", Font.BOLD, 17));
        p10 = new JPanel();
        p10.setLayout(new GridLayout(3, 1));
        p10.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        p10.add(Reading);
        p10.add(Singing);
        p10.add(Dancing);
        p10.setBounds(495, 95, 100, 110);
        grhobby = new ButtonGroup();
        grhobby.add(Reading);
        grhobby.add(Singing);
        grhobby.add(Dancing);

        p11 = new JPanel();
        validate = new JButton("Validate");
        validate.setFont(new Font("Serif", Font.BOLD, 17));
        reset = new JButton("Reset");
        reset.setFont(new Font("Serif", Font.BOLD, 17));
        p11.setLayout(new GridLayout(1, 2, 30, 5));
        p11.add(validate);
        p11.add(reset);
        p11.setBounds(170, 320, 300, 50);
        
        
        validate.addActionListener(this);
        reset.addActionListener(this);
        
        
        
        this.getRootPane().setDefaultButton(validate);
        this.setLayout(null);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        this.add(p7);
        this.add(p8);
        this.add(p9);
        this.add(p10);
        this.add(p11);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();
        if (event.equals("Validate")) {
            if (txtname.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Name null !");
                return;
            }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Address null !");
                return;
            }
            if (!male.isSelected() && !female.isSelected()) {
                JOptionPane.showMessageDialog(this, "Sex not check !");
                return;
            }
            if (!Reading.isSelected() && !Singing.isSelected() && !Dancing.isSelected()) {
                JOptionPane.showMessageDialog(this, "Hobby not check !");
                return;
            }
            String hobby = "";
            if (Reading.isSelected()) {
                hobby = "Reading";
            }
            if (Singing.isSelected()) {
                hobby = "Singing";
            }
            if (Dancing.isSelected()) {
                hobby = "Dancing";
            }
            JOptionPane.showMessageDialog(this, "Name: " + txtname.getText() + "\nAddress: " + txtAddress.getText() + "\nSex: " + ((male.isSelected()) ? "Male" : "Female") + "\nQualification: " + cbx.getSelectedItem() + "\nHobby: " + hobby);

        }
        if (event.equals("Reset")) {
            txtname.setText("");
            txtAddress.setText("");
            cbx.setSelectedIndex(0);
            male.setSelected(true);
            Reading.setSelected(true);
            return;
        }
    }

}
