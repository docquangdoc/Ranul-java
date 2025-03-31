/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author zzhan
 */
import javax.swing.*;
import java.awt.*;

public class BotControlPanel {
    private static JLabel botStatusLabel;
    
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Bot Control Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Left Panel (Status + Terminal)
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setPreferredSize(new Dimension(500, 600));

        // Status Panel
        JPanel statusPanel = new JPanel();
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.Y_AXIS));
        statusPanel.setBorder(BorderFactory.createTitledBorder("Status"));
        
        JLabel cpuLabel = new JLabel("CPU: 0%");
        JLabel ramLabel = new JLabel("RAM: 0 MB");
        botStatusLabel = new JLabel("Bot Status: Offline");
        JLabel serverCountLabel = new JLabel("Servers: 0");
        
        DefaultListModel<String> serverListModel = new DefaultListModel<>();
        JList<String> serverList = new JList<>(serverListModel);
        JScrollPane serverScrollPane = new JScrollPane(serverList);
        serverScrollPane.setPreferredSize(new Dimension(200, 100));

        statusPanel.add(cpuLabel);
        statusPanel.add(ramLabel);
        statusPanel.add(botStatusLabel);
        statusPanel.add(serverCountLabel);
        statusPanel.add(serverScrollPane);

        // Terminal Panel
        JTextArea terminalArea = new JTextArea();
        terminalArea.setEditable(false);
        JScrollPane terminalScrollPane = new JScrollPane(terminalArea);
        terminalScrollPane.setBorder(BorderFactory.createTitledBorder("Terminal"));
        
        leftPanel.add(statusPanel, BorderLayout.NORTH);
        leftPanel.add(terminalScrollPane, BorderLayout.CENTER);

        // Right Panel (Controls)
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createTitledBorder("Controls"));
        
        JButton restartButton = new JButton("Restart");
        JButton closeButton = new JButton("Close");
        JButton reloadButton = new JButton("Reload Commands");
        
        rightPanel.add(restartButton);
        rightPanel.add(closeButton);
        rightPanel.add(reloadButton);
        
        frame.add(leftPanel, BorderLayout.CENTER);
        frame.add(rightPanel, BorderLayout.EAST);
        
        frame.setVisible(true);
    }
    
    public static void updateBotStatus(String status) {
        if (botStatusLabel != null) {
            botStatusLabel.setText("Bot Status: " + status);
        }
    }
}


