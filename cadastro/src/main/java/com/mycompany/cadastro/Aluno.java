/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;

/**
 *
 * @author roy63042026
 */
public class Aluno extends Pessoa{
    private int nota1 ,nota2  ; 
    private int media;

    public int getNota() {
        return this.nota1 + nota2 ;
            
    }
        public int getMedia() {
        
            return (this.nota1 + this.nota2) / 2 ;
    }
    
    
    public Aluno (String nome, String endereco, String telefone ,int nota1 ,int nota2) {
        super(nome ,telefone ,endereco);
        this.nota1 = nota1;
        this.nota2 = nota2;
        
    }
        @Override
        public void Apresentar(){
    System.out.println("ola eu sou o aluno.me chamo : " + this.getNome() );
    }
    
    
    
    
    
    
}
