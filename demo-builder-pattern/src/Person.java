import java.lang.module.ModuleDescriptor.Builder;
// if 20 attributes
public class Person {
  private String name;
  private int age;

  public Person () { //  Builder pattern should not contain any public construsctor

}

private Person( String name, int age) () {
    this.name = name;
    this.age = age;
    
}
public static Builder builder() {
    return new Person.Builder();
}

  public Person(String name) {
    this.name = name;
   
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

public Builder name(String name) {
    this.name = name;
    return this;
}
public Builder age(int age) {
    this.age = age;
    return this;
}

public Person build() {
    return new Person();
}


public static void main(String[] args) {
    Person person = new Person();
    person.setAge(18);
    person.setName("John"); // what if 20 attributes? careless mistakes

    // builder pattern
    Person person2 = Person.Builder() //
    .age(18)// return current bulder object
    .name("John") // return current builder object
    .build(); // create person object

    System.out.println(person2.getAge()) + " " + person2;
}



















}
