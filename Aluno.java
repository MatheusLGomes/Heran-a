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
public class Aluno extends Pessoa {

    private String discplina;
    private double nota;

    public Aluno() {
    }

    public Aluno(String discplina, double nota, int id, String nome) {
        super(id, nome);
        this.discplina = discplina;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome do aluno: " + super.nome + "\nid do aluno " + super.id + "\nDiscplina " + this.discplina +  "\nNota do aluno " + this.nota;
        
    }
    
    

    public String getDiscplina() {
        return discplina;
    }

    public void setDiscplina(String discplina) {
        this.discplina = discplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
