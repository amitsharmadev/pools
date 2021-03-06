package org.animals;

public class Lion {
      private String color;
      private int age;
      public Lion(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}
	public String getColor() {
  		return color;
  	}
  	public void setColor(String color) {
  		this.color = color;
  	}
  	public int getAge() {
  		return age;
  	}
  	public void setAge(int age) {
  		this.age = age;
  	}
      public boolean isVegetarian()
      {
      	return false;
      }
      public boolean canClimb()
      {
      	return false;
      }
      public String sound()
      {
      	return "roar";
      }
	@Override
	public String toString() {
		return "Lion [color=" + color + ", age=" + age + ", isVegetarian()=" + isVegetarian() + ", canClimb()="
				+ canClimb() + ", sound()=" + sound() + "]";
	}
	
}
