/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosEmAula;

/**
 *
 * @author SULDINE
 */
public class Ex02 {

    public static void main(String[] args) {
        int[] numeros = {14, 9, 7};
        int maior = 0;
        for (int valor : numeros) {
            if (valor > maior) {
                maior = valor;
            }

        }
         System.out.println("Números maior é "+maior);
    }
}
