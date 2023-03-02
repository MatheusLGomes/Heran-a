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
public class Professor extends Pessoa{
    private String matricula;

    public Professor() {
    }

    public Professor(String matricula, int id, String nome) {
        super(id, nome);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome do professor :" + super.nome + "\nId do professor: " + super.id + "\nMatrícula do professor: " + this.matricula ;
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
