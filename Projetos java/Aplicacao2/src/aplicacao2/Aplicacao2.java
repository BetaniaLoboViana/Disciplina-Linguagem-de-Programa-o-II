/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao2;

/**
 *
 * @author Aluno
 */
public class Aplicacao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade=11; int idade2=15; int idade3=19;
    String tipo =(idade3>=18)? "Adulto": "adolescente";
    System.out.println("Você pode beber, mas beba com moderação!");
    String tipo1 = (idade2<=17)? "Adolescente": "adulto";
    System.out.println("Você é adolescente não pode beber, pare de idiotice!");
    String tipo2 = (idade2<=12)? "Adolescente": "adulto";
    System.out.println("Você é criança não pode beber Aproveite sua vida inútil!");
    
   
    }
    
}
