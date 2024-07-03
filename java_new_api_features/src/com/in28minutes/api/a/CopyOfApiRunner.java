package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Ranga");
        names.add("Ravi");
        names.add("john");
        List<String> copyOfNames=List.copyOf(names);//it becomes immutable

        //doNotChange(copyOfNames);//gives error as list is immutable
        System.out.println(copyOfNames);
    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotbeAllowed");
    }
}
