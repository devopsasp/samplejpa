package com.model;
import javax.persistence.*;
@Entity
public class Item {
@Id
@GeneratedValue
private int id;
private String itemName;
private float price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Item() 
{
	
}
}
