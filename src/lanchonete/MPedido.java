/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class MPedido {
    public ArrayList<Item> proteina = new ArrayList<Item>();
    private ArrayList<Item> salada = new ArrayList<Item>();
    private ArrayList<Item> molho = new ArrayList<Item>();
    private ArrayList<Item> acompanhamento = new ArrayList<Item>();
    
    public MPedido(){
        Item p1 = new Item("carne",5f);
        Item p2 = new Item("frango",4f);
        Item p3 = new Item("salame",4.5f);
        
        Item s1 = new Item("Tomate",1f);   
        Item s2 = new Item("Pepino",2f);
        Item s3 = new Item("Alface",2.5f);
        
        Item m1 = new Item("Barbecue",2f);
        Item m2 = new Item("Ketchup",1f);
        Item m3 = new Item("Maionese",1f);
        
        Item a1 = new Item("Batata",6f);
        Item a2 = new Item("Coca",5f);
        Item a3 = new Item("Nuggets",8f);
        
        proteina.add(p1);
        proteina.add(p2);
        proteina.add(p3);
        salada.add(s1);
        salada.add(s2);
        salada.add(s3);
        molho.add(m1);
        molho.add(m2);
        molho.add(m3);
        acompanhamento.add(a1);
        acompanhamento.add(a2);
        acompanhamento.add(a3);
        
    }
    public float getPreco(Object n,ArrayList<Item>a){
        for(Item i:a){
            if(i.getDesc()==n){
                return i.getPreco();
            }
        }
        return 0;
    }
    public ArrayList<Item> getPro(){
        return proteina;
    }
    public ArrayList<Item> getSal(){
        return salada;
    }
    public ArrayList<Item> getMo(){
        return molho;
    }
    public ArrayList<Item> getAcom(){
        return acompanhamento;   
    }
}
