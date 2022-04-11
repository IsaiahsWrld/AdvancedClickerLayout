package tester;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class pls {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pls window = new pls();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.ORANGE);
		frame.setSize(1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.BLUE);
		panel_1.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(33, 11, 126, 64);
		panel_9.add(lblNewLabel_11);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(194, 11, 134, 64);
		panel_9.add(lblNewLabel_14);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.BLUE);
		panel_1.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(156, 98, 46, 14);
		panel_10.add(lblNewLabel_12);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(78, 123, 204, 36);
		panel_10.add(progressBar);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.BLUE);
		panel_1.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(230, 11, 114, 35);
		panel_11.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setBounds(230, 57, 114, 35);
		panel_11.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setBounds(134, 11, 86, 35);
		panel_11.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setBounds(139, 57, 95, 35);
		panel_11.add(lblNewLabel_17);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_8);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_3.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Health: ");
		lblNewLabel_4.setBounds(7, 31, 46, 14);
		panel_7.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(58, 31, 46, 14);
		panel_7.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Mana: ");
		lblNewLabel_5.setBounds(7, 56, 46, 14);
		panel_7.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(58, 56, 46, 14);
		panel_7.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DPS:  ");
		lblNewLabel_7.setBounds(7, 81, 46, 14);
		panel_7.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(58, 81, 46, 14);
		panel_7.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("Gold: ");
		lblNewLabel_8.setBounds(7, 106, 46, 14);
		panel_7.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(58, 106, 46, 14);
		panel_7.add(lblNewLabel_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		panel.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_4.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_4.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_7);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(4, 5, 0, 0));
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_10);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_11);
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_12);
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_13);
		
		JCheckBox chckbxNewCheckBox_14 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_14);
		
		JCheckBox chckbxNewCheckBox_15 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_15);
		
		JCheckBox chckbxNewCheckBox_16 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_16);
		
		JCheckBox chckbxNewCheckBox_18 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_18);
		
		JCheckBox chckbxNewCheckBox_17 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_17);
		
		JCheckBox chckbxNewCheckBox_19 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_19);
		
		JCheckBox chckbxNewCheckBox_20 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_20);
		
		JCheckBox chckbxNewCheckBox_21 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_21);
		
		JCheckBox chckbxNewCheckBox_22 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_22);
		
		JCheckBox chckbxNewCheckBox_23 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_23);
		
		JCheckBox chckbxNewCheckBox_24 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_24);
		
		JCheckBox chckbxNewCheckBox_25 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_25);
		
		JCheckBox chckbxNewCheckBox_26 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_26);
		
		JCheckBox chckbxNewCheckBox_27 = new JCheckBox("New check box");
		panel_5.add(chckbxNewCheckBox_27);
	}
}
