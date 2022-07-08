package model;

public class Student implements Comparable<Student> {
        public int rollno;
        public String name;
        public int age;

        public Student(int rollno, String name, int age) {
                this.rollno = rollno;
                this.name = name;
                this.age = age;
        }

        public int compareTo(Student st){
        return Integer.compare(age, st.age);
        }
}