package CollectionsExamples;

import model.Doctor;
import model.Student;

import java.util.*;
class AgeComparator implements Comparator<Doctor>{
    public int compare(Doctor s1, Doctor s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
