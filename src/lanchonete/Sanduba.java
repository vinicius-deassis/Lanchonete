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
    protected String pao,salada,molho,acomp;
    protected float preco;

    public Sanduba(String sabor, String tamanho, String pao, String salada, 
            String molho , String acomp) {
        super(sabor, tamanho);
        this.molho = molho;
        this.pao = pao;
        this.salada = salada;
        this.acomp = acomp;
        this.preco = calcularPreco();
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }

    public String getPao() {
        return pao;
    }

    public String getSalada() {
        return salada;
    }

    public String getMolho() {
        return molho;
    }
    public String getAcompanhamento() {
        return acomp;
    }
    
    public float calcularPreco(){
        Pedido p = new Pedido();
        if(this.getTamanho().equals("Pequeno")){         
            this.preco = (p.getPreco(this.getSabor(), p.getPro())+
                        p.getPreco(this.getMolho(), p.getMo())+
                        p.getPreco(this.getSalada(), p.getSal())+
                        p.getPreco(this.getAcompanhamento(), p.getAcom())+
                        p.getPreco(this.getPao(),p.getPaes())+10);
            
        }
        else if(this.getTamanho().equals("Medio")){         
            this.preco = (p.getPreco(this.getSabor(), p.getPro())+
                        p.getPreco(this.getMolho(), p.getMo())+
                        p.getPreco(this.getSalada(), p.getSal())+
                        p.getPreco(this.getAcompanhamento(), p.getAcom())+
                        p.getPreco(this.getPao(),p.getPaes())+15); 
        }
        else if(this.getTamanho().equals("Grande")){         
            this.preco = (p.getPreco(this.getSabor(), p.getPro())+
                        p.getPreco(this.getMolho(), p.getMo())+
                        p.getPreco(this.getSalada(), p.getSal())+
                        p.getPreco(this.getAcompanhamento(), p.getAcom())+
                        p.getPreco(this.getPao(),p.getPaes())+20);

        }
        return this.preco;
    }
    
}
