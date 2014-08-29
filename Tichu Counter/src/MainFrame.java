import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JFormattedTextField;


public class MainFrame extends JFrame {
	private JToggleButton TichuButton1A,GTichuButton2A,TichuButton0A,GTichuButton0A,A12,TichuButton1B,GTichuButton2B,TichuButton0B,GTichuButton0B,B12;
	private JLabel TeamALabel,TeamBLabel;
	private JButton GoButton;
	private JLabel TeamBScore;
	private JFormattedTextField TeamBText,TeamAText;

	public MainFrame() {

		JLabel mainLabel = new JLabel("TICHU COUNTER");
		mainLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);

		TichuButton1A = new JToggleButton("Tichu");

		GTichuButton2A = new JToggleButton("Grand Tichu");

		TichuButton0A = new JToggleButton("Lost Tichu");

		GTichuButton0A = new JToggleButton("Lost Grand Tichu");

		A12 = new JToggleButton("1-2");

		TichuButton1B = new JToggleButton("Tichu");

		GTichuButton2B = new JToggleButton("Grand Tichu");

		TichuButton0B = new JToggleButton("Lost Tichu");

		GTichuButton0B = new JToggleButton("Lost Grand Tichu");

		B12 = new JToggleButton("1-2");

		TeamALabel = new JLabel("TEAM A");
		TeamALabel.setHorizontalAlignment(SwingConstants.CENTER);
		TeamALabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		TeamBLabel = new JLabel("TEAM B");
		TeamBLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TeamBLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		GoButton = new JButton("Calculate");
		
		JLabel TeamAScore = new JLabel("0");
		TeamAScore.setFont(new Font("Tahoma", Font.BOLD, 16));
		TeamAScore.setHorizontalAlignment(SwingConstants.CENTER);
		
		TeamBScore = new JLabel("0");
		TeamBScore.setHorizontalAlignment(SwingConstants.CENTER);
		TeamBScore.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		TeamAText = new JFormattedTextField();
		
		TeamBText = new JFormattedTextField();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addContainerGap(72, Short.MAX_VALUE)
											.addComponent(TeamAText, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addGap(67)
											.addComponent(GoButton)
											.addGap(3))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(79)
											.addComponent(TeamAScore, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(61)
									.addComponent(TeamALabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(TeamBScore, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addGap(41))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(TeamBLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
										.addGap(32)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(20)
									.addComponent(TeamBText, 45, 45, 45))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(38)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(A12)
										.addComponent(GTichuButton0A)
										.addComponent(TichuButton0A)
										.addComponent(GTichuButton2A))
									.addPreferredGap(ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(GTichuButton2B, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
										.addComponent(TichuButton0B, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
										.addComponent(GTichuButton0B, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
										.addComponent(B12, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(TichuButton1A)
									.addPreferredGap(ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
									.addComponent(TichuButton1B, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))))
					.addGap(38))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(131)
					.addComponent(mainLabel, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(131, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(mainLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(TeamAScore)
						.addComponent(TeamBScore, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(TeamAText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(GoButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(TeamBLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(TeamALabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addComponent(TeamBText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(TichuButton1A)
						.addComponent(TichuButton1B))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(GTichuButton2B)
						.addComponent(GTichuButton2A))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(TichuButton0A)
						.addComponent(TichuButton0B))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(GTichuButton0A)
						.addComponent(GTichuButton0B))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(A12)
						.addComponent(B12))
					.addGap(44))
		);
		groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] {TeamAText, TeamBText});
		groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] {TeamAScore, TeamBScore});
		groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] {TichuButton1A, GTichuButton2A, TichuButton0A, GTichuButton0A, A12});
		groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] {TeamALabel, TeamBLabel});
		groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {TeamAText, TeamBText});
		groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {TeamAScore, TeamBScore});
		groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {TichuButton1A, GTichuButton2A, TichuButton0A, GTichuButton0A, A12});
		groupLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {TeamALabel, TeamBLabel});
		getContentPane().setLayout(groupLayout);

		MyDocumentListener mdl = new MyDocumentListener();
		TeamAText.getDocument().addDocumentListener(mdl);
		TeamBText.getDocument().addDocumentListener(mdl);


		ButtonListener listener = new ButtonListener();
		ButtonListener2 listener2 = new ButtonListener2();
		TichuButton0A.addActionListener(listener);
		TichuButton0B.addActionListener(listener);
		TichuButton1A.addActionListener(listener);
		TichuButton1B.addActionListener(listener);
		GTichuButton0A.addActionListener(listener);
		GTichuButton0B.addActionListener(listener);
		GTichuButton2A.addActionListener(listener);
		GTichuButton2B.addActionListener(listener);
		A12.addActionListener(listener);
		B12.addActionListener(listener);
		GoButton.addActionListener(listener2);
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(A12)){
				if(!A12.isSelected()){
					B12.setEnabled(true);
				}
				else{
					B12.setEnabled(false);
				}
			}
			else if(e.getSource().equals(B12)){
				if(!B12.isSelected()){
					A12.setEnabled(true);
				}
				else{
					A12.setEnabled(false);
				}
			}

			else if(e.getSource().equals(TichuButton1A)){
				if(!TichuButton1A.isSelected() ){
					TichuButton1B.setEnabled(true);
					GTichuButton2A.setEnabled(true);
					GTichuButton2B.setEnabled(true);
				}
				else{
					TichuButton1B.setEnabled(false);
					GTichuButton2A.setEnabled(false);
					GTichuButton2B.setEnabled(false);
				}

			}


			else if(e.getSource().equals(TichuButton1B)){
				if(!TichuButton1B.isSelected() ){
					TichuButton1A.setEnabled(true);
					GTichuButton2A.setEnabled(true);
					GTichuButton2B.setEnabled(true);
				}
				else{
					TichuButton1A.setEnabled(false);
					GTichuButton2A.setEnabled(false);
					GTichuButton2B.setEnabled(false);
				}

			}

			else if(e.getSource().equals(GTichuButton2A)){
				if(!GTichuButton2A.isSelected() ){
					TichuButton1B.setEnabled(true);
					TichuButton1A.setEnabled(true);
					GTichuButton2B.setEnabled(true);
				}
				else{
					TichuButton1B.setEnabled(false);
					TichuButton1A.setEnabled(false);
					GTichuButton2B.setEnabled(false);
				}

			}

			else if(e.getSource().equals(GTichuButton2B)){
				if(!GTichuButton2B.isSelected() ){
					TichuButton1B.setEnabled(true);
					TichuButton1A.setEnabled(true);
					GTichuButton2A.setEnabled(true);
				}
				else{
					TichuButton1B.setEnabled(false);
					TichuButton1A.setEnabled(false);
					GTichuButton2A.setEnabled(false);
				}

			}
		}

	}


	class ButtonListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(GoButton)){
				
			}
		}

	}


	class MyDocumentListener implements DocumentListener {
		@Override
		public void changedUpdate(DocumentEvent e) {

		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			score();
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			remove();
			score();
		}

		public void score(){
			if(!TeamAText.getText().equals("")){
				int x = Integer.parseInt(TeamAText.getText());
				if(x % 5 == 0 ){
					String bString = Integer.toString(100-x);
					TeamBText.setText(bString);
				}
				else{
					remove();
				}
			}
		}

		public void remove(){
			TeamAText.setText("");

		}

	}
}
