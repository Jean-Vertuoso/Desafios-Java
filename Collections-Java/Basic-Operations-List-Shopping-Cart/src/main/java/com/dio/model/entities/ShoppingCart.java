package com.dio.model.entities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //attributes
    private List<Item> itemList = new ArrayList<>();

    //constructor

    public ShoppingCart() {}
    
    //getters
    public List<Item> getItemList() {
        return itemList;
    }
    
    //methods
    public void addItem(Item item){
        itemList.add(item);
    }
    
    public void removeItem(String items){
        List<Item> itemsToRemove = new ArrayList<>();
        if (!itemList.isEmpty()) {
            //itemList.remove(itemToRemove);
            
            for (Item item : itemList) {
                if(item.getName().equalsIgnoreCase(items)){
                    itemsToRemove.add(item);
                }
            }
        itemList.removeAll(itemsToRemove);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    
    public double calcTotalValue(){
        double sum = 0;
        
        for (Item item : itemList) {
            sum += item.getSubPrice();
        }
        
        return sum;
    }
    
    public void showItems(){        
        if (!itemList.isEmpty()) {            
            for (Item item : itemList) {            
                StringBuilder sb = new StringBuilder();
                
                sb.append("Nome: "+ item.getName());
                sb.append(" - Preco: "+ String.format("%.2f", item.getPrice()));
                sb.append(" - Quantidade: "+ item.getQuantity());
                
                System.out.println(sb.toString());
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
