import java.util.Objects;

public class Student extends Person {
  private int studentId;

public Student(int studentId, String name, int age, String gender) {
  super(name, age, gender);
  this.studentId = studentId;
}


public String toString() {
  return "Student("
  + "studentId=" + this.studentId
  + "age="+ super.getAge()
  + "gender=" + super.getGender()
  + ")";
  }

// @//Override
// public boolean equals(Object obj) {

// }


public void setName (String name) {
  super.setName(name);
}

public void setAge(int age) {
  super.setAge(age);
}

public void setGender (String gender) {
  super.setGender(gender);

  
}

public int getStudentId () {
  return this.studentId;
}

public void setStudentId(int studentId) {
  this.studentId = studentId;
}




public static void main(String[] args) {
  Student s = new Student(1, "Vincent", 13, "Male");
  Student s1 = new Student(1, "Vincent", 13, "Male");
  System.out.println(s.getStudentId());
  System.out.println(s);
  System.out.println(s1);
  System.out.println(s.equals(s1)); // false
  System.out.println(System.identityHashCode(s)); // 791452441
  System.out.println(System.identityHashCode(s1)); //834600351

}


}

//