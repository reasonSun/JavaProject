package testcode;

import javafx.beans.binding.BooleanExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//import static org.assertj.core.api.Assertions.assertThat;

class LottoNumberGeneratorTest {

    @DisplayName("로또 번호 갯수 테스트")
    @Test
    void lottoNumberSizeTest() {
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        int price = 1000;

        List<Integer> lotto = lottoNumberGenerator.generate(price);

        assertEquals(6,lotto.size());

    }
}