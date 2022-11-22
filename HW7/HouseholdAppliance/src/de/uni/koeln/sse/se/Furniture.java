package de.uni.koeln.sse.se;

public class Furniture implements HouseholdItem{
	
	String name;
	String type;


	int length;
	int width;
	int height;
	
	int weight;

	
	public Furniture(String name, String type, int length, int width, int height, int weight) {
		this.name = name;
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}
	
	public void accept(Visitor visitor) {
		visitor.visitFurniture(this);
	}


	

//Getters and Setters



	public int getHeight() {
		return height;}

	public void setHeight(Integer height) {
		this.height = height;}

	public int getlength() {
		return length;}

	public void setlength(Integer length) {
		this.length = length;}

	public int getWidth() {
		return width;	}

	public void setWidth(Integer width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getType() {
		return type;}

	public void setType(String type) {
		this.type = type;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	
}
