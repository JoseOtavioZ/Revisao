package Exercicio3;

import Exercicio2.Exercicio2;

import javax.swing.*;

public class Main3  extends JFrame {
    public static void main(String[] args) {
        Exercicio3 exercicio3 = new Exercicio3();
        exercicio3.setContentPane(exercicio3.panelEx3);
        exercicio3.setVisible(true);
        exercicio3.setSize(500, 200);
        exercicio3.setTitle("Pedra! Papel! Tesoura!");
    }
}