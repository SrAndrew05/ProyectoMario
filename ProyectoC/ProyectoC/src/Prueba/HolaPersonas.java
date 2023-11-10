package Prueba;

import javax.swing.JOptionPane;

public class HolaPersonas {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre=JOptionPane.showInputDialog("Dame tu nombre");
		
		javax.swing.JOptionPane.showMessageDialog(null, "hola" + nombre);
	}

}
