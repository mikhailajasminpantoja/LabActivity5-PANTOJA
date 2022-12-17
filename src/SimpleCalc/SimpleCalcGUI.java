package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel label;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        setTitle("Simple Calculator");
        btnCompute.addActionListener((event) -> {

                    try {
                        // Parse the numbers from the text fields
                        double number1 = Double.parseDouble(tfNumber1.getText());
                        double number2 = Double.parseDouble(tfNumber2.getText());

                        // Get the selected operation from the combo box
                        String operation = (String) cbOperations.getSelectedItem();

                        // Compute the result based on the chosen operation
                        double result = 0;
                        if (operation.equals("+")) {
                            result = number1 + number2;
                        } else if (operation.equals("-")) {
                            result = number1 - number2;
                        } else if (operation.equals("*")) {
                            result = number1 * number2;
                        } else if (operation.equals("/")) {
                            result = number1 / number2;
                        }

                        if (number2 == 0) {
                            throw new ArithmeticException("Arithmetic Error!");
                        }

                // Set the result in the label
                lblResult.setText(Double.toString(result));
            } catch (NumberFormatException nfe) {
                // Display an error message if the input is not a valid number
                JOptionPane.showMessageDialog(null, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException ae) {
                JOptionPane.showMessageDialog(null,"Arithmetic Error!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
        public static void main(String[] args) {
            SimpleCalcGUI calc = new SimpleCalcGUI();
            calc.setContentPane(new SimpleCalcGUI().panel1);
            calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calc.setSize(550,400);
            calc.setVisible(true);

        }
    }
