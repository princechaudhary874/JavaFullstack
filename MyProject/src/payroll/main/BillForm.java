package payroll.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillForm extends JFrame {
    private JTextField dateField;
    private JTextField nameField;
    private JTextField amountWordsField;
    private JTextField amountNumberField;
    private JTextField purposeField;
    private JTextField receivedByField;

    public BillForm() {
        setTitle("Bill Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Create the input panel
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));

        JLabel dateLabel = new JLabel("Date:");
        dateField = new JTextField();

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel amountWordsLabel = new JLabel("Amount in Words:");
        amountWordsField = new JTextField();

        JLabel amountNumberLabel = new JLabel("Amount in Number:");
        amountNumberField = new JTextField();

        JLabel purposeLabel = new JLabel("Purpose:");
        purposeField = new JTextField();

        JLabel receivedByLabel = new JLabel("Received By:");
        receivedByField = new JTextField();

        inputPanel.add(dateLabel);
        inputPanel.add(dateField);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(amountWordsLabel);
        inputPanel.add(amountWordsField);
        inputPanel.add(amountNumberLabel);
        inputPanel.add(amountNumberField);
        inputPanel.add(purposeLabel);
        inputPanel.add(purposeField);
        inputPanel.add(receivedByLabel);
        inputPanel.add(receivedByField);

        // Create the button panel
        JPanel buttonPanel = new JPanel();

        JButton printButton = new JButton("Print");
        printButton.addActionListener(new PrintButtonListener());

        buttonPanel.add(printButton);

        // Add components to the main frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class PrintButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String date = dateField.getText();
            String name = nameField.getText();
            String amountWords = amountWordsField.getText();
            String amountNumber = amountNumberField.getText();
            String purpose = purposeField.getText();
            String receivedBy = receivedByField.getText();

            StringBuilder billContent = new StringBuilder();
            billContent.append("Date: ").append(date).append("\n");
            billContent.append("Name: ").append(name).append("\n");
            billContent.append("Amount in Words: ").append(amountWords).append("\n");
            billContent.append("Amount in Number: ").append(amountNumber).append("\n");
            billContent.append("Purpose: ").append(purpose).append("\n");
            billContent.append("Received By: ").append(receivedBy).append("\n");

            // Perform the printing operation here
            JOptionPane.showMessageDialog(null, "Printing the bill:\n\n" + billContent.toString(), "Print Bill", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BillForm().setVisible(true);
            }
        });
    }
}

