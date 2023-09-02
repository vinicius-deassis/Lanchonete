/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class Carrinho{

    private ArrayList<Sanduba> sandubas;
    private float total;

    public Carrinho(){
        this.sandubas = new ArrayList<Sanduba>();
        this.total = 0.0f;
    }

    public void adicionarSanduba(Sanduba sanduba){
        this.sandubas.add(sanduba);
        this.total += sanduba.getPreco();
    }
    
    public void removerSanduba(Sanduba sanduba){
        this.sandubas.remove(sanduba);
        this.total -= sanduba.getPreco();
    }

    public void limparCarrinho(){
        this.sandubas.clear();
        this.total = 0.0f;
    }
    
    public String verCarrinho(){
         ArrayList<Sanduba> listSandubas = getSandubas();
         String mensagem = "";
            if (listSandubas.isEmpty()){
                mensagem = "Não há sanduiches no carrinho!";                     
            }else{
                int opcaoSanduba = -1;
                while (opcaoSanduba < 0 || opcaoSanduba > sandubas.size()) {                  
                    for (int i = 0; i < sandubas.size(); i++) {
                        mensagem += (i) + 1 + ". " + sandubas.get(i) + "\n";
                    }                 
                    opcaoSanduba = 0;
                }
        }
        return mensagem;
    }

    public ArrayList<Sanduba> getSandubas(){
        return this.sandubas;
    }
    
    public void setSandubas(ArrayList<Sanduba> sandubas){
        this.sandubas = sandubas;
    }
    public float getTotal(){
        return total;
    }
    

     // método que calcula o total do pedido

     public float calcularTotal(ArrayList<Sanduba> sandubas){
        float total = 0f;

        for (Sanduba sanduba: sandubas){
            total += sanduba.getPreco();
        }
        return total;
    }

}

