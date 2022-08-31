package homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DandyNumber {

    private int solution(String number) {
        Set<String> set = new HashSet<>();
        int dandyNum;

        for (int i = 0; i < number.length()-2; i++) {
            if (number.charAt(i) == number.charAt(i + 1)
                    && number.charAt(i + 1) == number.charAt(i + 2)) {
                set.add(number.substring(i, i + 3));
            }
        }

        if (!set.isEmpty()) {
            dandyNum = Integer.parseInt(Collections.max(set));
        } else{
            dandyNum = -1;
        }

        return dandyNum;
    }

    public static void main(String[] args) {
        DandyNumber dandyNumber = new DandyNumber();
        int result = dandyNumber.solution("123333111119999");
        System.out.println("result = " + result);
    }
}
