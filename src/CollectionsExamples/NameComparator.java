package CollectionsExamples;

import model.Doctor;

import java.util.*;
class NameComparator implements Comparator<Doctor>{
    public int compare(Doctor s1,Doctor s2){
        return s1.name.compareTo(s2.name);
    }
}
