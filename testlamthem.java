/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;

import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class testlamthem {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            BTLAMTHEM bt = new BTLAMTHEM();
            bt.setVisible(true);
        } catch (Exception e) {
        }
    }
}
