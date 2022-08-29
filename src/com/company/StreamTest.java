package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args){
        StreamTest test = new StreamTest();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        test.filterMultiple(list);
    }
    public void streamMultiple(List<Integer> list){
        for(int value : list){
            System.out.println(value*3);
        }
        list.stream().map(x->x*3).forEach(System.out::println);
    }

    public void filterMultiple(List<Integer> list){
        // 3의 배수의 합계
        List<Integer> collector = list.stream().filter(x->x%3 == 0).collect(Collectors.toList());
        System.out.println(collector);
        int sum=0;
        for (Integer a:collector) {
            sum+=a;
        }
        System.out.println(sum);
    }
}
