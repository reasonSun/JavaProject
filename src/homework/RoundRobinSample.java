package homework;

import java.util.HashMap;
import java.util.Map;

public class RoundRobinSample {
    public Map<Integer, String> solution(int servers, boolean sticky, String[] requests) {
        Map<Integer, String> req_to_server_id = new HashMap<>();
        int cur_server_id = 0;


        return req_to_server_id;
    }

    public static void main(String[] args) {
        RoundRobinSample robinSample = new RoundRobinSample();
        String[] requests = {"1","1","2","1","3","3","4"};
//        String[] requests = {"1","1","2","2","3","3"};
        Map<Integer, String> result = robinSample.solution(3,true, requests);

        System.out.println("result = " + result);
    }
}
