/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno("DEV1",7, 1001, "Matheus");
       System.out.println(aluno1.toString());
       Professor professor1 = new Professor("LEX", 121, " Carlos");
       System.out.println(professor1.toString());
    }
    
}
