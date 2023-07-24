package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollectorPartitioning {
    public static void main(String[] args) {
        ArrayList list=new ArrayList(Arrays.asList(1,2,3,"abc","gsh","sghj"));
       Map<Boolean, List> r= (Map<Boolean, List>) list.stream().collect(Collectors.partitioningBy(i->i instanceof Integer));
        System.out.println(r.get(true));
        System.out.println(r.get(false));


        ArrayList<Integer> list1=new ArrayList(Arrays.asList(1,2,3,4,5));
        Map<Boolean, List<Integer>> r1=list1.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(r1.get(true));
        System.out.println(r1.get(false));

    }
}
