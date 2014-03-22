package com.baiper06.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.baiper06.jni.Main;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridBagLayout;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

import javax.swing.Box;

public class Calc {

	private JFrame frame;
	Main math_functions = new Main();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}
	
	public float getNumber1(){
		return Float.parseFloat( textField_1.getText() );
	}
	
	public float getNumber2(){
		return Float.parseFloat( textField_2.getText() );
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblValor = new JLabel("Valor 1:");
		GridBagConstraints gbc_lblValor = new GridBagConstraints();
		gbc_lblValor.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor.gridx = 0;
		gbc_lblValor.gridy = 0;
		frame.getContentPane().add(lblValor, gbc_lblValor);
		
		JLabel lblValor_1 = new JLabel("Valor 2:");
		GridBagConstraints gbc_lblValor_1 = new GridBagConstraints();
		gbc_lblValor_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblValor_1.gridx = 2;
		gbc_lblValor_1.gridy = 0;
		frame.getContentPane().add(lblValor_1, gbc_lblValor_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 1;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 1;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue = new GridBagConstraints();
		gbc_horizontalGlue.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalGlue.gridx = 1;
		gbc_horizontalGlue.gridy = 2;
		frame.getContentPane().add(horizontalGlue, gbc_horizontalGlue);
		
		JButton btnAdd = new JButton("Sumar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float result = math_functions.add( getNumber1(), getNumber2() );
				textField_result.setText(Float.toString(result) );
			}
		});
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 3;
		frame.getContentPane().add(btnAdd, gbc_btnAdd);
		
		JButton btnMult = new JButton("Multiplicar");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float result = math_functions.multiplication( getNumber1(), getNumber2() );
				textField_result.setText( Float.toString(result) );
			}
		});
		GridBagConstraints gbc_btnMult = new GridBagConstraints();
		gbc_btnMult.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMult.insets = new Insets(0, 0, 5, 0);
		gbc_btnMult.gridx = 2;
		gbc_btnMult.gridy = 3;
		frame.getContentPane().add(btnMult, gbc_btnMult);
		
		JButton btnSub = new JButton("Restar");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float result = math_functions.subtraction( getNumber1(), getNumber2() );
				textField_result.setText( Float.toString(result) );
			}
		});
		GridBagConstraints gbc_btnSub = new GridBagConstraints();
		gbc_btnSub.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSub.insets = new Insets(0, 0, 5, 5);
		gbc_btnSub.gridx = 0;
		gbc_btnSub.gridy = 4;
		frame.getContentPane().add(btnSub, gbc_btnSub);
		
		JButton btnDiv = new JButton("Dividir");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( getNumber2() != 0 ){
					float result = math_functions.division( getNumber1(), getNumber2() );
					textField_result.setText( Float.toString(result) );
				} else {
					textField_result.setText( "Error matematico" );
				}
				
				
			}
		});
		GridBagConstraints gbc_btnDiv = new GridBagConstraints();
		gbc_btnDiv.insets = new Insets(0, 0, 5, 0);
		gbc_btnDiv.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDiv.gridx = 2;
		gbc_btnDiv.gridy = 4;
		frame.getContentPane().add(btnDiv, gbc_btnDiv);
		
		JLabel lblResultado = new JLabel("Resultado:");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.insets = new Insets(0, 0, 0, 5);
		gbc_lblResultado.gridx = 0;
		gbc_lblResultado.gridy = 6;
		frame.getContentPane().add(lblResultado, gbc_lblResultado);
		
		textField_result = new JTextField();
		GridBagConstraints gbc_textField_result = new GridBagConstraints();
		gbc_textField_result.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_result.gridx = 2;
		gbc_textField_result.gridy = 6;
		frame.getContentPane().add(textField_result, gbc_textField_result);
		textField_result.setColumns(10);
	}

}
