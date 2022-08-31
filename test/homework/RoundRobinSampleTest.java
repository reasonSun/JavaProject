package homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RoundRobinSampleTest {

    @ParameterizedTest
    @MethodSource("paramProvider")
    void RR_Sticky_True_Test(int serverCnt, boolean sticky, String[] nums, Map<Integer,List<String>> expectedMap) {

        RoundRobinSample robinSample = new RoundRobinSample();
        Map<Integer, List<String>> result = robinSample.solution(serverCnt, sticky, nums);

        assertEquals(expectedMap, result);
    }


    static Stream<Arguments> paramProvider() {
        String[] requests = {"1","1","2","1","3","3","4"};
        return Stream.of(
                Arguments.arguments(3, true, requests,
                        Map.of(0, List.of("1", "1", "1", "4"),
                                1, List.of("2"),
                                2, List.of("3", "3"))),

                Arguments.arguments(3, false, requests,
                        Map.of(0, List.of("1", "1", "4"),
                                1, List.of("1", "3"),
                                2, List.of("2", "3")))
        );
    }


}