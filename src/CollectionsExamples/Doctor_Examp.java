package CollectionsExamples;

import model.Doctor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor_Examp {
    public static void main(String[] args) {
        List<Doctor> list= new ArrayList<>();
        list.add(new Doctor(1,"Bunty",24));
        list.add(new Doctor(2,"Saurabh",25));
        list.add(new Doctor(3,"Munesh",23));
        list.add(new Doctor(4,"Anil",22));
        list.add(new Doctor(4,"Anil",22));
        System.out.println("Sorting on the Basis of.........");
        list.sort(Comparator.comparing(p -> p.name));
        for(Doctor p:list){
            System.out.println(p.doc_id+" "+p.name+" "+p.age);
        }
        //Unique Object
        System.out.println("Unique Object :: ****************");
        List<Doctor> list5= list.stream().distinct().collect(Collectors.toList());
        for (Doctor t:list5){
            System.out.println(t.doc_id+ " "+ t.name + " "+ t.age);
        }
        // Duplicate Object
        System.out.println("Duplicate Object :: ****************");
        List <Doctor> list6 = list.stream().filter(i->Collections.frequency(list,i)>1).collect(Collectors.toList());
        for(Doctor l:list6){
            System.out.println(l.doc_id+" "+l.name+" "+l.age);
        }
    }
}
