package lanchonete;



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
    private float preco;

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
    
    public float calcularPreco(String tamanho){
        if (tamanho.equals("Pequena")){
            this.preco = 15f;
            
        }else if (tamanho.equals("Média")){
            this.preco = 20f;
        } else if (tamanho.equals("Grande")){
            this.preco = 30f;
        }
        return this.preco;
    }
    public float getPreco(){
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
