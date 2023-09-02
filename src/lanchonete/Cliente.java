/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete;
/**
 *
 * @author Nicolas
 */

public class Cliente{

    private String nome;
    private String telefone;
    private Object bairro;
    private Object pay;
    private final Carrinho carrinho;

    public Cliente(String nome, String telefone, Object bairro, Object pay){
        this.nome = nome;
        this.telefone = telefone;
        this.bairro = bairro;
        this.pay = pay;
        this.carrinho = new Carrinho();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Object getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Object getPay() {
        return pay;
    }

    public void setPay(Object pay) {
        this.pay = pay;
    }
    
    @Override
    public String toString(){
        return "\nNome: "+getNome()+"\nbairro: "+getBairro()+"\nTelefone: "+getTelefone()+
                "\nPagamento: "+getPay();
    }
}