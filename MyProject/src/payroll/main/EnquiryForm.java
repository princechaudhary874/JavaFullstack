package payroll.main;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class EnquiryForm extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JTextArea addressArea;
    private JRadioButton billRadioButton;
    private JRadioButton interviewRadioButton;
    private JRadioButton otherRadioButton;

    public EnquiryForm() {
        setTitle("Enquiry Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel nameLabel = new JLabel("Name:");
        formPanel.add(nameLabel, constraints);

        nameField = new JTextField(20);
        constraints.gridx = 1;
        formPanel.add(nameField, constraints);

        JLabel emailLabel = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        formPanel.add(emailLabel, constraints);

        emailField = new JTextField(20);
        constraints.gridx = 1;
        formPanel.add(emailField, constraints);

        JLabel addressLabel = new JLabel("Address:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        formPanel.add(addressLabel, constraints);

        addressArea = new JTextArea(1,20 );
        JScrollPane scrollPane = new JScrollPane(addressArea);
        constraints.gridx = 1;
        formPanel.add(scrollPane, constraints);

        JLabel purposeLabel = new JLabel("Purpose of Visiting:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        formPanel.add(purposeLabel, constraints);

        billRadioButton = new JRadioButton("Bill");
        interviewRadioButton = new JRadioButton("Interview");
        otherRadioButton = new JRadioButton("Other");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(billRadioButton);
        buttonGroup.add(interviewRadioButton);
        buttonGroup.add(otherRadioButton);

        JPanel purposePanel = new JPanel();
        purposePanel.add(billRadioButton);
        purposePanel.add(interviewRadioButton);
        purposePanel.add(otherRadioButton);

        constraints.gridx = 1;
        constraints.gridy = 3;
        formPanel.add(purposePanel, constraints);

        JButton submitButton = new JButton("Submit");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        formPanel.add(submitButton, constraints);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String address = addressArea.getText();
                String purpose = "";

                if (billRadioButton.isSelected()) {
                    purpose = "Bill";
                } else if (interviewRadioButton.isSelected()) {
                    purpose = "Interview";
                } else if (otherRadioButton.isSelected()) {
                    purpose = "Other";
                }

                // Perform further processing with the captured data, e.g., sending it via email

                // Display a dialog box to indicate successful submission
                String message = "Name: " + name + "\nEmail: " + email + "\nAddress: " + address + "\nPurpose: " + purpose;
                JOptionPane.showMessageDialog(EnquiryForm.this, message, "Form Submission", JOptionPane.INFORMATION_MESSAGE);

                // Clear the form fields
                nameField.setText("");
                emailField.setText("");
                addressArea.setText("");
                buttonGroup.clearSelection();
            }
        });

        add(formPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null); // Center the form on the screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EnquiryForm().setVisible(true);
            }
        });
    }
}
