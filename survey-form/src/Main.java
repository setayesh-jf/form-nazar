import javax.swing.*;
import java.awt.Font;
import packages.informationPage;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("Survey Form");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setBackground(Color.yellow);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.yellow);

        Font font = new Font("font's name", Font.BOLD, 14);

        // Create title label

        JLabel title = new JLabel("Survey Form");
        title.setFont(font);
        title.setBounds(10, 10, 100, 20);

       // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(font);
        startButton.setBounds(10, 40, 100, 20);
        startButton.setHorizontalAlignment(JButton.CENTER);

        // Add components to the panel
        panel.add(title);
        panel.add(startButton);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);
            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
