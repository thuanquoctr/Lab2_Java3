/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.YearMonth;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author DELL
 */
public class BTLAMTHEM extends JFrame implements ActionListener {

    private JLabel dki;
    private JLabel first;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;
    private JPanel p8;
    private JPanel p9;
    private JPanel p10;
    private JPanel p11;
    private JPanel p12;
    private JPanel p13;
    private JPanel p14;
    private JPanel p15;
    private JLabel last;
    private JTextField firsttext;
    private JTextField lasttext;
    private JLabel year;
    private JLabel month;
    private JLabel day;
    private JLabel birth;
    private JLabel sinhnhat;
    private ButtonGroup gr1;
    private ButtonGroup gr2;
    private JComboBox yearComboBox;
    private JComboBox monthComboBox;
    private JComboBox dayComboBox;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton other;
    private JCheckBox cb1;
    private JCheckBox cb2;
    private JCheckBox cb3;
    private JCheckBox cb4;
    private JCheckBox cb5;
    private JCheckBox cb6;
    private JCheckBox cb7;
    private JCheckBox cb8;
    private JButton reset;
    private JButton save;
    private JButton close;
    private JTable tb;
    private DefaultTableModel model;
    private int index = 2;

    public BTLAMTHEM() {
        GUI();
    }

    public void GUI() {

        this.setTitle("Bai Tap Them");
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        dki = new JLabel("ĐĂNG KÝ");
        dki.setForeground(Color.BLUE);
        dki.setFont(new Font("Serif", Font.BOLD, 37));
        p11 = new JPanel();
        p11.setBounds(220, 18, 200, 50);
        p11.add(dki);

        first = new JLabel("First Name: ");
        first.setForeground(Color.RED);
        first.setFont(new Font("Serif", Font.BOLD, 17));
        p1 = new JPanel();
        p1.setBounds(40, 85, 100, 30);
        p1.add(first);

        firsttext = new JTextField();
        firsttext.setPreferredSize(new Dimension(220, 45));
        firsttext.setFont(new Font("Serif", Font.BOLD, 17));
        p2 = new JPanel();
        p2.setBounds(40, 123, 220, 50);
        p2.add(firsttext);

        last = new JLabel("Last Name: ");
        last.setForeground(Color.RED);
        last.setFont(new Font("Serif", Font.BOLD, 17));
        p3 = new JPanel();
        p3.setBounds(400, 85, 100, 30);
        p3.add(last);

        lasttext = new JTextField();
        lasttext.setPreferredSize(new Dimension(220, 45));
        lasttext.setFont(new Font("Serif", Font.BOLD, 17));
        p4 = new JPanel();
        p4.setBounds(400, 123, 220, 50);
        p4.add(lasttext);

        year = new JLabel("Year: ");
        year.setForeground(Color.RED);
        year.setFont(new Font("Serif", Font.BOLD, 17));
        p5 = new JPanel();
        p5.setBounds(20, 180, 100, 30);
        p5.add(year);

        month = new JLabel("Month: ");
        month.setForeground(Color.RED);
        month.setFont(new Font("Serif", Font.BOLD, 17));
        p6 = new JPanel();
        p6.setBounds(120, 180, 100, 30);
        p6.add(month);

        day = new JLabel("Day: ");
        day.setForeground(Color.RED);
        day.setFont(new Font("Serif", Font.BOLD, 17));
        p7 = new JPanel();
        p7.setBounds(220, 180, 100, 30);
        p7.add(day);

        birth = new JLabel("Birthday: ");
        birth.setForeground(Color.RED);
        birth.setFont(new Font("Serif", Font.BOLD, 17));
        p8 = new JPanel();
        p8.setBounds(390, 180, 100, 30);
        p8.add(birth);

        Integer[] years = new Integer[100];
        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + i;
        }
        yearComboBox = new JComboBox<>(years);
        yearComboBox.setFont(new Font("Serif", Font.BOLD, 17));

        String[] months = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        monthComboBox = new JComboBox<>(months);
        monthComboBox.setFont(new Font("Serif", Font.BOLD, 17));

        dayComboBox = new JComboBox<>();
        dayComboBox.setFont(new Font("Serif", Font.BOLD, 17));

        sinhnhat = new JLabel();
        sinhnhat.setFont(new Font("Serif", Font.BOLD, 17));
        ActionListener updateDateLabelListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = (int) yearComboBox.getSelectedItem();
                String month = (String) monthComboBox.getSelectedItem();
                int day = (int) dayComboBox.getSelectedItem();
                sinhnhat.setText(day + " / " + month + " / " + year);
            }
        };
        yearComboBox.addActionListener(updateDateLabelListener);
        monthComboBox.addActionListener(updateDateLabelListener);
        dayComboBox.addActionListener(updateDateLabelListener);

        monthComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = (int) yearComboBox.getSelectedItem();
                int month = monthComboBox.getSelectedIndex() + 1;
                YearMonth yearMonth = YearMonth.of(year, month);
                int daysInMonth = yearMonth.lengthOfMonth();
                Integer[] days = new Integer[daysInMonth];
                for (int i = 0; i < days.length; i++) {
                    days[i] = i + 1;
                }
                dayComboBox.setModel(new DefaultComboBoxModel<>(days));
            }
        });
        monthComboBox.setSelectedIndex(0);
        p9 = new JPanel();
        p9.setLayout(new GridLayout(1, 3, 20, 0));
        p9.setBounds(40, 225, 300, 30);
        p9.add(yearComboBox);
        p9.add(monthComboBox);
        p9.add(dayComboBox);

        p10 = new JPanel();
        p10.setBounds(390, 220, 100, 30);
        p10.add(sinhnhat);

        male = new JRadioButton("Male");
        male.setFont(new Font("Serif", Font.BOLD, 17));
        female = new JRadioButton("Female");
        female.setFont(new Font("Serif", Font.BOLD, 17));
        other = new JRadioButton("Other");
        other.setFont(new Font("Serif", Font.BOLD, 17));
        gr1 = new ButtonGroup();
        gr1.add(male);
        gr1.add(female);
        gr1.add(other);
        p12 = new JPanel();
        TitledBorder title = new TitledBorder(new LineBorder(Color.BLACK), "Gender");
        title.setTitleFont(new Font("Serif", Font.BOLD, 20));
        title.setTitleColor(Color.RED);
        p12.setBorder(title);
        p12.setLayout(new GridLayout(3, 1));
        p12.add(male);
        p12.add(female);
        p12.add(other);
        p12.setBounds(40, 275, 200, 150);

        cb1 = new JCheckBox("Football");
        cb1.setFont(new Font("Serif", Font.BOLD, 17));
        cb2 = new JCheckBox("Shopping");
        cb2.setFont(new Font("Serif", Font.BOLD, 17));
        cb3 = new JCheckBox("Music");
        cb3.setFont(new Font("Serif", Font.BOLD, 17));
        cb4 = new JCheckBox("Dancing");
        cb4.setFont(new Font("Serif", Font.BOLD, 17));
        cb5 = new JCheckBox("Travelli");
        cb5.setFont(new Font("Serif", Font.BOLD, 17));
        cb6 = new JCheckBox("Gymnas");
        cb6.setFont(new Font("Serif", Font.BOLD, 17));
        cb7 = new JCheckBox("Photogr");
        cb7.setFont(new Font("Serif", Font.BOLD, 17));
        cb8 = new JCheckBox("Wachin");
        cb8.setFont(new Font("Serif", Font.BOLD, 17));
        p13 = new JPanel();
        TitledBorder title1 = new TitledBorder(new LineBorder(Color.BLACK), "Hobbies");
        title1.setTitleFont(new Font("Serif", Font.BOLD, 20));
        title1.setTitleColor(Color.RED);
        p13.setBorder(title1);
        p13.setLayout(new GridLayout(4, 4));
        p13.add(cb1);
        p13.add(cb2);
        p13.add(cb3);
        p13.add(cb4);
        p13.add(cb5);
        p13.add(cb6);
        p13.add(cb7);
        p13.add(cb8);
        p13.setBounds(300, 275, 350, 150);

        reset = new JButton("Reset");
        reset.setFont(new Font("Serif", Font.BOLD, 17));
        save = new JButton("Save");
        save.setFont(new Font("Serif", Font.BOLD, 17));
        close = new JButton("Close");
        close.setFont(new Font("Serif", Font.BOLD, 17));
        p14 = new JPanel();
        p14.setLayout(new GridLayout(1, 3, 30, 0));
        p14.setBounds(170, 430, 300, 40);
        p14.add(reset);
        p14.add(save);
        p14.add(close);

        String[] cot = {"STT", "FullName", "Birthday", "Gender", "Hobbies"};
        Object[][] data = {
            {"1", "thuan1", "17/03/2004", "Male", "Football"}};
        model = new DefaultTableModel(data, cot);
        tb = new JTable(model);
        tb.setFont(new Font("Serif", Font.BOLD, 17));
        JTableHeader header = tb.getTableHeader();
        Font font = new Font("Serif", Font.BOLD, 20);
        header.setFont(font);
        header.setForeground(Color.red);
        tb.setPreferredScrollableViewportSize(new Dimension(600, 120));
        JScrollPane scrollPane = new JScrollPane(tb);
        p15 = new JPanel();
        p15.setBounds(20, 480, 650, 200);
        p15.add(scrollPane);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gtinh = "";
                String sthich = "";
                if (male.isSelected()) {
                    gtinh += "Male";
                }
                if (female.isSelected()) {
                    gtinh += "Female";
                }
                if (other.isSelected()) {
                    gtinh += "Other";
                }

                if (cb1.isSelected()) {
                    sthich += "Football";
                }
                if (cb2.isSelected()) {
                    sthich += "Shopping";
                }
                if (cb3.isSelected()) {
                    sthich += "Mussic";
                }
                if (cb4.isSelected()) {
                    sthich += "Dancing";
                }
                if (cb5.isSelected()) {
                    sthich += "Travelli";
                }
                if (cb6.isSelected()) {
                    sthich += "Gymnas";
                }
                if (cb7.isSelected()) {
                    sthich += "Photogr";
                }
                if (cb8.isSelected()) {
                    sthich += "Wachin";
                }
                Object[] newRow = {index++, firsttext.getText() + lasttext.getText(), sinhnhat.getText(), gtinh, sthich};
                model.addRow(newRow);

            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firsttext.setText("");
                lasttext.setText("");
                male.setSelected(true);
                cb1.setSelected(true);
                yearComboBox.setSelectedIndex(0);
                monthComboBox.setSelectedIndex(0);
                dayComboBox.setSelectedIndex(0);
            }
        });
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát", "Thoát", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

            }
        });

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
        this.add(p12);
        this.add(p13);
        this.add(p14);
        this.add(p15);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
