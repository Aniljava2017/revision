package model;

import java.util.Objects;

public class Doctor{
        public int doc_id;
        public String name;
        public int age;
        public Doctor(int doc_id, String name, int age){
            this.doc_id=doc_id;
            this.name=name;
            this.age=age;
        }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return doc_id == doctor.doc_id && age == doctor.age && Objects.equals(name, doctor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doc_id, name, age);
    }
}
