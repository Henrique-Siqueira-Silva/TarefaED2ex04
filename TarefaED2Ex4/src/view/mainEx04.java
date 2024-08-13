package view;

import javax.swing.JOptionPane;

import controller.Ex04;


public class mainEx04 {
	public static void main (String args[]) {
		Ex04 m = new Ex04();
		
		int a =0; 
		int resp = 0;
		
		while (a % 2 == 0) {
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero impar"));
		}

		
		resp = m.FatorialDuplo(a, 1, 1);
		System.out.println(resp);
		
		
	}

}