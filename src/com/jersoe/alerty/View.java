package com.jersoe.alerty;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class View {

	private JFrame frame;
	private Controller c;

	public View(Controller c) {
		this.c=c;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFrame();
					frame.setBounds(100, 100, 450, 300);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

}
