import java.util.Arrays;

public class House {
 // state
  // attributes
private String AreaName;
private String furniture;
private double[] weight;



public House() {
 
}

public House(double[] weight) {
  this.weight = weight;
}


public String getAreaName() {
  return this.AreaName;
}

public String getfurniture() {
  return this.furniture;
}


public double[] getweight() {
  return this.weight;
}




public void setAreaName(String AreaName) {
  this.AreaName = AreaName;
}

public void setfurniture(String furniture) {
  this.furniture = furniture;
}

public void setprices(double[] weight) {
  this.weight = weight;
}


//toString

  public String toString() {
    return "cabinets "
        + "size=" + Arrays.toString(this.weight)
        + "cm";
  }

public static void main(String[] args) {
  
House itemName = new House();
itemName.setAreaName("kitchen");
itemName.setfurniture("cabinets");
itemName.setfurniture("cooker");


House itemName2 = new House();
itemName2.setAreaName("living room");
itemName2.setfurniture("table");
itemName2.setfurniture("chair");

System.out.println(itemName.getAreaName());
System.out.println(itemName2.getAreaName());
System.out.println(itemName.getfurniture());
System.out.println(itemName2.getfurniture());




double[] weight = new double[] {120.5, 100.3, 50,5};
itemName = new House(weight);
System.out.println(itemName.toString());




}























}
