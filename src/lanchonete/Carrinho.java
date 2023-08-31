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

    private ArrayList<Sanduiche> sandubas;
    private double total;

    public Carrinho(){
        this.sandubas = new ArrayList<Sanduiche>();
        this.total = 0.0;
    }

    public void adicionarSanduba(Sanduiche sanduba){
        this.sandubas.add(sanduba);
        this.total += sanduba.getPreco();
    }
    
    public void removerSanduba(Sanduiche sanduba){
        this.sandubas.remove(sanduba);
        this.total -= sanduba.getPreco();
    }

    public void limparCarrinho(){
        this.sandubas.clear();
        this.total = 0.0;
    }
    
    public String verCarrinho(){
         ArrayList<Sanduiche> listSandubas = getSandubas();
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

    public ArrayList<Sanduiche> getSandubas(){
        return this.sandubas;
    }
    
    public void setSandubas(ArrayList<Sanduiche> sandubas){
        this.sandubas = sandubas;
    }
    public double getTotal(){
        return total;
    }
    

     // método que calcula o total do pedido

     public double calcularTotal(ArrayList<Sanduiche> sandubas){
        double total = 0.0;

        for (Sanduiche sanduba: sandubas){
            total += sanduba.getPreco();
        }
        return total;
    }

}

