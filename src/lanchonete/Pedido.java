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
public class Pedido {
    public ArrayList<Item> proteina = new ArrayList<Item>();
    private ArrayList<Item> salada = new ArrayList<Item>();
    private ArrayList<Item> molho = new ArrayList<Item>();
    private ArrayList<Item> acompanhamento = new ArrayList<Item>();
    private ArrayList<Item> pao = new ArrayList<Item>();
    
    public Pedido(){
        Item p1 = new Item("Carne",7f);
        Item p2 = new Item("Frango",5f);
        Item p3 = new Item("Salame",8f);
        Item p4 = new Item("Calabresa",7f);
        Item p5 = new Item("Almondegas",10f);
        
        Item s1 = new Item("Tomate",1f);   
        Item s2 = new Item("Pepino",2f);
        Item s3 = new Item("Alface",2.5f);
        Item s4 = new Item("Cebola Roxa",2f);
        Item s5 = new Item("Azeitona",1f);
        
        Item m1 = new Item("Ketchup",1f);
        Item m2 = new Item("Barbecue",2f);
        Item m3 = new Item("Maionese",1f);
        Item m4 = new Item("Rose",2f);
        Item m5 = new Item("Chipotle",3f);
        
        Item a1 = new Item("Batata",6f);
        Item a2 = new Item("Coca",5f);
        Item a3 = new Item("Nuggets",8f);
        Item a4 = new Item("Guarana",8f);
        Item a5 = new Item(" ",0f);
        
        Item pa1 = new Item("Frances",1f);
        Item pa2 = new Item("3 queijos",2f);
        Item pa3 = new Item("Integral",1.5f);
        Item pa4 = new Item("9 graos",2f);
        Item pa5 = new Item("Italiano com Queijo",2f);
        
        
        
        
        
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
    public float total(){
        float resultado = 0;
        return resultado;
    }
    
    
}
