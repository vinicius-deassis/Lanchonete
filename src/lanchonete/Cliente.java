/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete;

/**
 *
 * @author USER
 */
public class Cliente {
    public String nome;
    public String ender;
    public String telefone;
    public Object pay;
    
    public Cliente(String nome, String ender, String telefone, Object pay){
        this.nome = nome;
        this.ender = ender;
        this.telefone = telefone;
        this.pay = pay;     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
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
        return "\nNome: "+nome+"\nEndereço: "+ender+"\nTelefone: "+telefone+
                "\nPagamento: "+pay;
    }
}
