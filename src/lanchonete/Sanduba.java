package lanchonete;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas
 */
public class Sanduba{

    protected String sabor;
    protected String tamanho;
    protected float preco;

    public Sanduba (String sabor, String tamanho){
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
        switch (tamanho) {
            case "Pequeno":
                this.preco = 20f;
                break;
            case "Médio":
                this.preco = 25f;
                break;
            case "Grande":
                this.preco = 30f;
                break;
            default:
                break;
        }
        return this.preco;
    }
    public float getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        return " " + getSabor() + "(" + getTamanho() + " - " + getPreco() + ")\n";

    }
}
