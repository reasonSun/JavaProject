package fast.grade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MajorEvaluationTest {

    @Test
    void studentGrade() {
        MajorEvaluation major = new MajorEvaluation();
        int point = 80;
        String grade = major.getGrade(point);

        assertEquals("B", grade);

    }

}