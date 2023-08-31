package lanchonete;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas
 */
public class Sanduiche{

    private String sabor;
    private String tamanho;
    private double preco;

    public Sanduiche (String sabor, String tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = calcularPreco(tamanho);
    }

    public String getSabor(){
        return sabor;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    
    public double calcularPreco(String tamanho){
        if (tamanho.equals("Pequena")){
            this.preco = 25.00;
            
        }else if (tamanho.equals("Média")){
            this.preco = 40.00;
        } else if (tamanho.equals("Grande")){
            this.preco = 60.00;
        }
        return this.preco;
    }
    public double getPreco(){
        return preco;
    }

    public void setPreco(){
        this.preco = preco;
    }

    @Override
    public String toString(){
        return " " + getSabor() + "(" + getTamanho() + " - " + getPreco() + ")\n";

    }
}
