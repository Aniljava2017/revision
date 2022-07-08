package CollectionsExamples;

import model.Doctor;

import java.util.*;

class TestComparator{
    public static void main(String args[]){
//Creating a list of students
        ArrayList<Doctor> al=new ArrayList<Doctor>();
        al.add(new Doctor(201,"Vijay",23));
        al.add(new Doctor(206,"Ajay",27));
        al.add(new Doctor(205,"Jai",21));

        System.out.println("Sorting by Name");

//Using NameComparator to sort the elements
        Collections.sort(al,new NameComparator());
//Traversing the elements of list
        for(Doctor dc: al){
            System.out.println(dc.doc_id+" "+dc.name+" "+dc.age);
        }
        System.out.println("*******************************");
        System.out.println("sorting by Age");
//Using AgeComparator to sort the elements
        Collections.sort(al,new AgeComparator());
//Traversing the list again
        for(Doctor dc: al){
            System.out.println(dc.doc_id+" "+dc.name+" "+dc.age);
        }

    }
}
