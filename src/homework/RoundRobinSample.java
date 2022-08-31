package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoundRobinSample {
    final Map<Integer, List<String>> reqToServerId = new HashMap<>();
    int curServerId = 0;
    public Map<Integer, List<String>> solution(int serverCnt, boolean sticky, String[] requests) {

        if (sticky) {
            doStickyTrue(serverCnt, requests);
        } else {
            doStickyFalse(serverCnt, requests);
        }
        return reqToServerId;
    }

    private void doStickyTrue(int serverCnt, String[] requests) {
        for (String request : requests) {
            boolean registerFlag = false;

            for (Integer key : reqToServerId.keySet()) {
                if(reqToServerId.getOrDefault(key, new ArrayList<>()).contains(request)){
                    reqToServerId.get(key).add(request);

                    curServerId = (curServerId + 1) % serverCnt;
                    registerFlag = true;
                    break;
                }
            }
            if(!registerFlag){
                if(!reqToServerId.containsKey(curServerId)){
                    reqToServerId.put(curServerId, new ArrayList<>(Arrays.asList(request)));
                }else {
                    reqToServerId.get(curServerId).add(request);
                }
            }
            System.out.println("reqToServerId = " + reqToServerId);
        }
    }

    private void doStickyFalse(int serverCnt, String[] requests) {
        for (String request : requests) {
            if(!reqToServerId.containsKey(curServerId)){
                reqToServerId.put(curServerId, new ArrayList<>(Arrays.asList(request)));
            }else {
                reqToServerId.get(curServerId).add(request);
            }
            curServerId = (curServerId + 1) % serverCnt;
        }
    }

    public static void main(String[] args) {
        RoundRobinSample robinSample = new RoundRobinSample();
//        String[] requests = {"1","1","2","1","3","3","4"};
        String[] requests = {"1","1","2","2","3","3"};
        Map<Integer, List<String>> result = robinSample.solution(3,true, requests);

        System.out.println("result = " + result);
    }
}
