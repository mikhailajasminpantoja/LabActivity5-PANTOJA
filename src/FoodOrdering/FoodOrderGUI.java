package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI() {
        setTitle("Food Ordering System");
        btnOrder.addActionListener((event) -> {
        try {
            double result = 0;
            if (cBurger.isSelected()) result = result + 80;
            if (cPizza.isSelected()) result = result + 100;
            if (cFries.isSelected()) result = result + 65;
            if (cTea.isSelected()) result = result + 50;
            if (cSoftDrinks.isSelected()) result = result + 55;
            if (cSundae.isSelected()) result = result + 40;

            if (rb5.isSelected()) result -= result * 0.5;
            else if (rb10.isSelected()) result -= result * 0.1;
            else if (rb15.isSelected()) result -= result * 0.15;

                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", result));
            } catch (Exception exc){
                JOptionPane.showMessageDialog(null,"Error! Try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderGUI food = new FoodOrderGUI();
        food.setContentPane(new FoodOrderGUI().panel1);
        food.setSize(600, 600);
        food.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
