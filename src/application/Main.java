package application;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null, "Digite uma frase");
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.println("Frase normal: "+frase);
        System.out.println("Frase invertida: "+fraseInvertida);
    }
}