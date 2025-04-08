/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio13;

/**
 *
 * @author Fabricio de Aguiar
 */
/**A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
salário bruto. Faça um algoritmo que permita entrar com o salário bruto e o
valor da prestação e informar se o empréstimo pode ou não ser concedido.*/

import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void main(String[] args) {
        double sb, vp, lp;
        sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Bruto: "));
        vp = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da prestação: "));
        lp = sb * 0.3;
        if (vp <= lp) {
            JOptionPane.showMessageDialog(null, "Empréstimo Concedido! ");
        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo NEGADO! ");
        }
    }
}
