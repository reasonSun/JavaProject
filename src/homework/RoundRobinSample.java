package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoundRobinSample {
    final Map<Integer, List<String>> serverIdToReq = new HashMap<>();
    int curServerId = 0;
    public Map<Integer, List<String>> solution(int serverCnt, boolean sticky, String[] requests) {

        if (sticky) {
            processSticky(serverCnt, requests);
        } else {
            processNonSticky(serverCnt, requests);
        }
        return serverIdToReq;
    }

    private void processSticky(int serverCnt, String[] requests) {
        for (String request : requests) {
            boolean registerFlag = false;

            for (Integer key : serverIdToReq.keySet()) {
                if(serverIdToReq.getOrDefault(key, new ArrayList<>()).contains(request)){
                    serverIdToReq.get(key).add(request);

                    curServerId = (curServerId + 1) % serverCnt;
                    registerFlag = true;
                    break;
                }
            }
            if(!registerFlag){
                if(!serverIdToReq.containsKey(curServerId)){
                    serverIdToReq.put(curServerId, new ArrayList<>(List.of(request)));
                }else {
                    serverIdToReq.get(curServerId).add(request);
                }
            }
            System.out.println("serverIdToReq = " + serverIdToReq);
        }
    }

    private void processNonSticky(int serverCnt, String[] requests) {
        for (String request : requests) {
            if(!serverIdToReq.containsKey(curServerId)){
                serverIdToReq.put(curServerId, new ArrayList<>(List.of(request)));
            }else {
                serverIdToReq.get(curServerId).add(request);
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
