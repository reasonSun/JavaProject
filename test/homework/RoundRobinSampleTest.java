package homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RoundRobinSampleTest {

    @ParameterizedTest
    @MethodSource("paramProvider")
    void RR_Sticky_True_Test(int server, boolean sticky, String[] nums, List expectedMap) {

        RoundRobinSample robinSample = new RoundRobinSample();
        Map<Integer, List<String>> result = robinSample.solution(server, sticky, nums);

        assertEquals(expectedMap, result.get(0));
    }


    static Stream<Arguments> paramProvider() {
        String[] requests = {"1","1","2","1","3","3","4"};
        return Stream.of(
                Arguments.arguments(3,true, requests, new ArrayList<>(Arrays.asList("1","1","1","4"))),
                Arguments.arguments(3,false, requests, new ArrayList<>(Arrays.asList("1","1","4")))
        );
    }


}