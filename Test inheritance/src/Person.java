public class Person {

private String name;
private int age;
private double height;

public Person(int age, String name) {
    this.age = age;
    this.name = name;
    this.height = height;
}


public String toString() {
    return "Person(" //
    + "name=" + this.name //
    + ")";
}

   
public String getName() {
    return this.name;
}

public int getAge() {
    return this.age;
}

public double getheight() {
    return this.height;
}


public static void main(String[] args) {

Person p1 = new Person(1, "Apple");
System.out.println(p1.name);
System.out.println(p1);

StringBuilder sb  = new StringBuilder("hello");
System.out.println(sb.append("I am Anson"));

}









}