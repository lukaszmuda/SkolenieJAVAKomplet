package edu.GUISwing.LayoutManagers;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class CardLayoutDemo {

	
	public static void main(String[] args) {
		ColorFrame frame = new ColorFrame("Card Layout Demo");
		frame.setSize(500, 300);
		frame.setVisible(true);

	}
	
}

class ColorFrame extends JFrame implements ActionListener, ListSelectionListener{

	private JButton cmdNext = new JButton("Next");
	private JButton cmdPrevious = new JButton("Previous");
	private JPanel displayPanel = new JPanel();
	private CardLayout cards = new CardLayout();
	private String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
	private JList colorList = new JList(colors);
	private static int selectedColorIndex = 0;
	
	
	
	public ColorFrame(String title) {
		super(title);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cmdNext.addActionListener(this);
		cmdPrevious.addActionListener(this);
		colorList.addListSelectionListener(this);
		displayPanel.setLayout(cards);
		displayPanel.add(colors[0], new ColorPanel(Color.RED));
		displayPanel.add(colors[1], new ColorPanel(Color.ORANGE));
		displayPanel.add(colors[2], new ColorPanel(Color.YELLOW));
		displayPanel.add(colors[3], new ColorPanel(Color.GREEN));
		displayPanel.add(colors[4], new ColorPanel(Color.BLUE));
		displayPanel.add(colors[5], new ColorPanel(new Color(0x6600FF)));
		displayPanel.add(colors[6], new ColorPanel(new Color(0x8B00FF)));
		JPanel cmdPanel = new JPanel();
		cmdPanel.add(cmdPrevious);
		cmdPanel.add(cmdNext);
		Container pane = getContentPane();
		pane.add(colorList, BorderLayout.LINE_START);
		pane.add(displayPanel, BorderLayout.CENTER);
		pane.add(cmdPanel, BorderLayout.PAGE_END);
		colorList.setSelectedIndex(selectedColorIndex);
			
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		selectedColorIndex = colorList.getSelectedIndex();
		cards.show(displayPanel, colors[selectedColorIndex]);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cards.show(displayPanel, colors[selectedColorIndex]);
		if(e.getSource() == cmdNext){
			cards.next(displayPanel);
			selectedColorIndex++;
			if(selectedColorIndex > colors.length-1){
				selectedColorIndex = 0;
			}
			colorList.setSelectedIndex(selectedColorIndex);
		}else if(e.getSource() == cmdPrevious){
			cards.previous(displayPanel);
			selectedColorIndex--;
			if(selectedColorIndex < 0){
				selectedColorIndex = colors.length-1;
				
			}
			colorList.setSelectedIndex(selectedColorIndex);
		}
		
	}
	
}

class ColorPanel extends Panel{
	
	public ColorPanel(Color color){
		setBackground(color);
		this.setLayout(new BorderLayout());
		add(new JLabel("Value: " + String.format("%X", color.getRGB()),SwingConstants.CENTER),BorderLayout.CENTER);
		
		
	}
	
}
