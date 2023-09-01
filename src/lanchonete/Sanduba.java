/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete;
import java.util.ArrayList;
import lanchonete.Pedido;

/**
 *
 * @author USER
 */
public class Sanduba extends Sanduiche{
    private String pao,salada,molho;
    private float preco;
    private Pedido p;

    public Sanduba(String sabor, String tamanho, String pao, String salada, String molho) {
        super(sabor, tamanho);
        this.molho = molho;
        this.pao = pao;
        this.salada = salada;
        this.preco = calcularPreco(tamanho);
        
    }
    
    @Override
    public float calcularPreco(String tamanho){
        ArrayList acomp = p.getAcom();
        ArrayList pro = p.getPro();
        p.getMo();
        
        if (tamanho.equals("Pequena")){
            
            
        }else if (tamanho.equals("Média")){
            this.preco = 40.00f;
        } else if (tamanho.equals("Grande")){
            this.preco = 60.00f;
        }
        return this.preco;
    }
    
}
