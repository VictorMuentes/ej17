/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej17;

import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author V1C70R MU3N735
 */
public class Ej17 {
    
    String[] Letras = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
        "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
        "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA",
        "CIEN", "CIENTO", "DOSCIENTOS", "TRESCIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"};
 
    Integer[] Valores = {1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 30, 40, 50, 60, 70, 80, 90,
        100, 100, 200, 300, 400, 500, 600, 700, 800, 900};
 
    List lstLetras = java.util.Arrays.asList(Letras);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         new Ej17().Letras();
    }
 
    public void Letras() {
        String x =" ";
        x=(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        StringTokenizer st = new StringTokenizer(x);
        Integer numero = 0;
 
        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            if (t.equals("MIL")) {
                numero *= 1000;
            }
            if (lstLetras.indexOf(t) > -1) {
                numero += Valores[lstLetras.indexOf(t)];
            }
        }
 
        System.out.println("Resultado : " + String.valueOf(numero));
    }
    }
    
