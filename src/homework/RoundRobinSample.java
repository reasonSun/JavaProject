package homework;

import java.util.HashMap;
import java.util.Map;

public class RoundRobinSample {
    public Map<Integer, String> solution(int servers, boolean sticky, String[] requests) {
        Map<Integer, String> req_to_server_id = new HashMap<>();
        int cur_server_id = 0;

        if (sticky) {
            for (int i = 0; i < requests.length; i++) {
                if (req_to_server_id.isEmpty()) {
                    req_to_server_id.put(cur_server_id, requests[i]);
                } else {
                    System.out.println("requests = " + requests[i]);
                    boolean flag = false;
                    for (Integer key : req_to_server_id.keySet()) {
                        if(req_to_server_id.get(key).contains(requests[i])){
                            req_to_server_id.put(key,
                                    req_to_server_id.get(key) +","+ requests[i]);
                            cur_server_id = (cur_server_id + 1) % servers;
                            flag = false;
                            break;
                        }else{
                            flag = true;
                        }
                    }
                    if(flag){
                        if(!req_to_server_id.containsKey(cur_server_id)){
                            req_to_server_id.put(cur_server_id, requests[i]);
                        }else {
                            req_to_server_id.put(cur_server_id,
                                    req_to_server_id.get(cur_server_id) +","+ requests[i]);
                        }
                    }
                }
                System.out.println("req_to_server_id = " + req_to_server_id);
            }
        } else {
            for (int i = 0; i < requests.length; i++) {
                if(!req_to_server_id.containsKey(cur_server_id)){
                    req_to_server_id.put(cur_server_id, requests[i]);
                }else {
                    req_to_server_id.put(cur_server_id,
                            req_to_server_id.get(cur_server_id) +","+ requests[i]);
                }
                cur_server_id = (cur_server_id + 1) % servers;
            }
        }
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
