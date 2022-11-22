package de.uni.koeln.sse.se;

public class Glass implements HouseholdItem{
	
	String name;
	int length;
	int width;
	int height;

	int thickness;

	
	public Glass(String name, int length, int width, int height, int thickness) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.thickness = thickness;
	
	}
	
	public void accept(Visitor visitor) {
		visitor.visitGlass(this);
	}



//Getters and Setters =

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getlength() {
		return length;}

	public void setlength(int length) {
		this.length = length;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getthickness() {
		return thickness;}

	public void setthickness(int thickness) {
		this.thickness = thickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	


}
