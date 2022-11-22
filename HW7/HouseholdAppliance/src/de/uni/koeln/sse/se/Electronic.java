package de.uni.koeln.sse.se;

public class Electronic implements HouseholdItem{
	
	String name;
	
	int length;
	int width;
	int height;

	int weight;
	
	Boolean fragile;
	


	public Electronic(String name, int length, int width, int height, int weight, Boolean fragile) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.fragile = fragile;
	}
	
	public void accept(Visitor visitor) {
		visitor.visitElectronic(this);
	}

	
//Getters and Setters

	public int getHeight() {
		return height;}

	public void setHeight(Integer height) {
		this.height = height;}

	public int getLenght() {
		return length;}

	public void setLenght(Integer lenght) {
		this.length = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(Integer width) {
		this.width = width;}

	public Integer getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}
	
	public Boolean getFragile() {
		return fragile;}

	public void setFragile(Boolean fragile) {
		this.fragile = fragile;}
	
	
	

}
