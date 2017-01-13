package br.com.treinar.operadores;

import javax.swing.JOptionPane;

public class DoWhile {
	public static void main(String[] args) {
		 int x = 10;
		 String result = "";
		 
		 do{
			 result += ("Value of x :" + x + "\n");
			 x++;
			 System.out.print("\n");
			 //if(x == 17)           //Posso parar o dowhile com um break.
				//break;
		 }while(x < 20);
		 JOptionPane.showMessageDialog(null, result, "Titulo Alert", 1);
		 
	}

}
