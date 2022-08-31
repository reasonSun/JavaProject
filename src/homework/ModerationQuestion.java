package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ModerationQuestion {

    private int solution(List<Integer> levels) {
        double difficulty = Math.floor(levels.size() * 0.25);

        if(difficulty <= 0){
            return -1;
        }

        levels.sort(Comparator.reverseOrder());
        System.out.println("levels = " + levels);
        System.out.println("levels.get = " + levels.get((int)difficulty - 1));

        return levels.get((int)difficulty - 1);
    }

    public static void main(String[] args) {
        ModerationQuestion moderationQuestion = new ModerationQuestion();
        List<Integer> levels = new ArrayList<Integer>(List.of(1,2,3,4));
        int questionNum = moderationQuestion.solution(levels);
        System.out.println("questionNum = " + questionNum);
    }
}
