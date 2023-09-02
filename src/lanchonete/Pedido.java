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
    public ArrayList<Item> proteinas = new ArrayList<Item>();
    private ArrayList<Item> saladas = new ArrayList<Item>();
    private ArrayList<Item> molhos = new ArrayList<Item>();
    private ArrayList<Item> acomps = new ArrayList<Item>();
    private ArrayList<Item> paes = new ArrayList<Item>();      
    public Pedido(){
        
        Item p1 = new Item("Carne",7f);
        Item p2 = new Item("Frango",5f);
        Item p3 = new Item("Salame",8f);
        Item p4 = new Item("Calabresa",7f);
        Item p5 = new Item("Almondegas",10f);
        proteinas.add(p1);
        proteinas.add(p2);
        proteinas.add(p3);
        proteinas.add(p4);
        proteinas.add(p5);
        
        Item s1 = new Item("Tomate",1f);   
        Item s2 = new Item("Pepino",2f);
        Item s3 = new Item("Alface",2.5f);
        Item s4 = new Item("Cebola Roxa",2f);
        Item s5 = new Item("Azeitona",1f);
        saladas.add(s1);
        saladas.add(s2);
        saladas.add(s3);
        saladas.add(s4);
        saladas.add(s5);
        
        Item m1 = new Item("Ketchup",1f);
        Item m2 = new Item("Barbecue",2f);
        Item m3 = new Item("Maionese",1f);
        Item m4 = new Item("Rose",2f);
        Item m5 = new Item("Chipotle",3f);
        molhos.add(m1);
        molhos.add(m2);
        molhos.add(m3);
        molhos.add(m4);
        molhos.add(m5);
        
        Item a1 = new Item("Batata",6f);
        Item a2 = new Item("Coca",5f);
        Item a3 = new Item("Nuggets",8f);
        Item a4 = new Item("Guarana",8f);
        Item a5 = new Item("Nada",0f);
        acomps.add(a1);
        acomps.add(a2);
        acomps.add(a3);
        acomps.add(a4);
        acomps.add(a5);
        
        Item pa1 = new Item("Frances",1f);
        Item pa2 = new Item("3 queijos",2f);
        Item pa3 = new Item("Integral",1.5f);
        Item pa4 = new Item("9 graos",2f);
        Item pa5 = new Item("Italiano com Queijo",2f);
        paes.add(pa1);
        paes.add(pa2);
        paes.add(pa3);
        paes.add(pa4);
        paes.add(pa5);
       
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
        return proteinas;
    }
    public ArrayList<Item> getSal(){
        return saladas;
    }
    public ArrayList<Item> getMo(){
        return molhos;
    }
    public ArrayList<Item> getAcom(){
        return acomps;   
    }
    public ArrayList<Item> getPaes(){
        return paes;   
    }
    public String showItens(){
        String all = "";
        all+= "PROTEINAS:\n";
        for(Item i:proteinas){
            all+= i.getDesc()+" = "+i.getPreco()+"\n";
        }
        all+= "SALADAS:\n";
        for(Item i:saladas){
            all+= i.getDesc()+" = "+i.getPreco()+"\n";
        }
        all+= "MOLHOS:\n";
        for(Item i:molhos){
            all+= i.getDesc()+" = "+i.getPreco()+"\n";
        }
        all+= "ACOMPANHAMENTOS:\n";
        for(Item i:acomps){
            all+= i.getDesc()+" = "+i.getPreco()+"\n";
        }
        all+= "PAES:\n";
        for(Item i:paes){
            all+= i.getDesc()+" = "+i.getPreco()+"\n";
        }
        return all;
    }
}
