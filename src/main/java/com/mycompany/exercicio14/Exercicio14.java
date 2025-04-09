package com.mycompany.exercicio14;

import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {

        int calculo;
        int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));
        int atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

        if (atual >= nascimento) {
            calculo = atual - nascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + calculo);

        } else {
            JOptionPane.showMessageDialog(null, "O ano de nascimento não é válido! ");

        }

    }
}
