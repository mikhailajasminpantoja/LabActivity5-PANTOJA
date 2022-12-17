package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        setTitle("Leap Year Checker");
        btnCheckYear.addActionListener((event) -> {

        // Check if the input year is a leap year
        try {
            boolean isLeapYear = false;
            int year = Integer.parseInt(tfYear.getText());
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }

            // Display a message in a JOptionPane indicating whether the input year is a leap year or not
            String message = isLeapYear ? "Leap year" : "Not a leap year";
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException e) {
            // Display an error message if the input is not a valid year
            JOptionPane.showMessageDialog(null, "Please enter a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    });
}
        public static void main(String[] args) {
            LeapYearGUI frame = new LeapYearGUI();
            frame.setContentPane(new LeapYearGUI().panel1);
            frame.setLocationRelativeTo(null);
            frame.setSize(250,250);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}