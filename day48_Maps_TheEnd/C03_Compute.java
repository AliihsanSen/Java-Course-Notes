package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {

    public static void main(String[] args) {

        Map<String, Integer> harfMapi = new HashMap<String, Integer>();
        harfMapi.put("A", 5);
        harfMapi.put("B", 1);
        harfMapi.put("C", 2);
        harfMapi.put("D", 4);
        harfMapi.put("E", 4);

        System.out.println(harfMapi); // {A=5, B=1, C=2, D=4, E=4}


        harfMapi.compute("A", (k, v) -> v * 2 + 3); // {A=13, B=1, C=2, D=4, E=4}
        harfMapi.compute("D", (a, b) -> b * b); // {A=13, B=1, C=2, D=16, E=4}
        harfMapi.computeIfAbsent("C", (v) -> 30); // {A=13, B=1, C=2, D=16, E=4}
        harfMapi.computeIfAbsent("F", (v) -> 30); // {A=13, B=1, C=2, D=16, E=4, F=30}
        harfMapi.computeIfPresent("E", (k, v) -> v + 5); // {A=13, B=1, C=2, D=16, E=9, F=30}
        harfMapi.computeIfPresent("G", (k, v) -> v + 5); // {A=13, B=1, C=2, D=16, E=9, F=30}



        System.out.println(harfMapi);
    }
}
