package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeChecker extends JFrame {
    private JTextField numberField;
    private JLabel resultLabel;

    public PalindromeChecker() {
        // Set up the frame
        setTitle("Palindrome Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Create components
        JLabel promptLabel = new JLabel("Enter a number:");
        promptLabel.setBounds(10, 10, 100, 25);
        add(promptLabel);

        numberField = new JTextField();
        numberField.setBounds(120, 10, 150, 25);
        add(numberField);

        JButton checkButton = new JButton("Check");
        checkButton.setBounds(10, 50, 260, 25);
        add(checkButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(10, 90, 260, 25);
        add(resultLabel);

        // Add action listener to the button
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkPalindrome();
            }
        });
    }

    private void checkPalindrome() {
        String numberText = numberField.getText();
        try {
            int number = Integer.parseInt(numberText);
            if (isPalindrome(number)) {
                resultLabel.setText(number + " is a palindrome.");
            } else {
                resultLabel.setText(number + " is not a palindrome.");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number.");
        }
    }

    private boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PalindromeChecker().setVisible(true);
            }
        });
    }
}
