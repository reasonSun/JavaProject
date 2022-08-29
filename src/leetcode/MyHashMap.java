package leetcode;

import java.util.Arrays;

public class MyHashMap {

    int[] map;

    public MyHashMap() {
        map = new int[1000001];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }

    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();
        obj.put(1,3);
        obj.remove(1);
        System.out.println(obj.get(2));
    }
}
