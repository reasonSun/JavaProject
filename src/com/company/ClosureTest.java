package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClosureTest {
    private String day = "Fri";
    public Stream<String> addString(Stream<String> stream,String name){
        final String a ="local";
        return stream.map(c->c+name+day+a);
    }
    public void effectivelyFinal(){
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int effectNum = 3;
//        effectNum = 4;
        List<Integer> numResult = numList.stream().filter(x-> x%effectNum == 0).collect(Collectors.toList());
        System.out.println(numResult);
    }

    public static void main(String[] args){
        List<String> strList = Arrays.asList("Closure","Java","Test");
        List<String> result = new ClosureTest()
                .addString(strList.stream(),"yuseon")
                .collect(Collectors.toList());

        System.out.println(result);

        ClosureTest finalSample = new ClosureTest();
        finalSample.effectivelyFinal();

    }
}
