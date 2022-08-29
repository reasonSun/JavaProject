package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args){
        Object[] objArr = {"1", new Integer(1), "2","3","3","4","4"};
        Set numSet = new HashSet();

        for(int i = 0; i < objArr.length; i++){
            numSet.add(objArr[i]);
        }
        // HashSet은 중복을 허용하지 않는다.
        // 1이 2개 출력 되는 이유는 하나는 String, 나머지 하나는 Integer로 다른 객체여서 중복으로 간주하지 않음
        System.out.println(numSet);

        Set tree = new TreeSet();
        tree.add("abc");
        tree.add("AAA");
        tree.add("macbook");
        tree.add("air");
        tree.add("intelli");
        tree.add("list");
        tree.add("yu");
        tree.add("ggg");

        // TreeSet은 tree구조로 부모노드를 기준으로 왼쪽자식노드의 값은 부모노드의 값보다 작고, 오른쪽 자식노드의 값은 부모노드보다 커야한다.
        // 중복된 값 저장 안함, 검색과 정렬에 유리하다.
        System.out.println(tree);


    }
}
