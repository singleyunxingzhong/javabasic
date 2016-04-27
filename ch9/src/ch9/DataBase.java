package ch9;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Item> itemlist = new ArrayList<Item>(); 
	public void add(Item it){
		itemlist.add(it);
	}
	public void list(){
		for(Item it:itemlist){
			it.print();
		}
	}
    public static void main(String[] args) {
	      
	}

}
