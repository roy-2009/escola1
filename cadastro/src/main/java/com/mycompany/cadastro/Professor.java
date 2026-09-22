/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;

/**
 *
 * @author roy63042026
 */
public class Professor extends Pessoa{
    private double salario   ; 
    private String ncontato;


    public double getSalario() {
        return this.salario;
    
    }
    public String getncontato() {
        return this.ncontato;
       
    }
    public void setncontato(String ncontato) {
        this.ncontato = ncontato;
    }
        
        
    
    public Professor(String ncontato, String nome, String telefone, String endereco, double salario) {
        super(nome, telefone, endereco);
        this.ncontato = ncontato;
        this.salario = salario;
    } 
    @Override 
    public void Apresentar(){
    System.out.println("ola eu sou o professor.me chamo : " + this.getNome());
    }  
}
