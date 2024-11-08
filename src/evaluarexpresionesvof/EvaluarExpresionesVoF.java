/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluarexpresionesvof;

/**
 *
 * @author 14-cf2074
 */
public class EvaluarExpresionesVoF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        boolean resultado1 = M > T;
        boolean resultado2 = T / K == -5;
        boolean resultado3 = (M + T == 7) || (M - T == 5);

        System.out.println("M > T: " + resultado1);
        System.out.println("T / K == -5: " + resultado2);
        System.out.println("(M + T == 7) || (M - T == 5): " + resultado3);
    }
}