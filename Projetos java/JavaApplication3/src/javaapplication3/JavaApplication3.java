/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Aluno
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int jan=15000; int fev=23000; int mar=17000; int gastrime;
         
         
     System.out.println("O seu gasto em janeiro foi de: "+jan + " R$");
     System.out.println("O seu gasto em fevereiro foi de: "+fev + " R$");
     System.out.println("O seu gasto em março foi de: "+mar + " R$");

         gastrime=jan+fev+mar;
         
    System.out.println("O seu gasto trimestral foi de: "+gastrime + " R$");
    }
    
}
