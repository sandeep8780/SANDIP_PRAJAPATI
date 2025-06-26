package Screening_Test;

import java.util.*;

public class problem_4 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};


        Map<Integer, Integer> divisorCount = new LinkedHashMap<>();


        for (int i = 1; i <= 9; i++) {
            divisorCount.put(i, 0);
        }


        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    divisorCount.put(i, divisorCount.get(i) + 1);
                }
            }
        }


        System.out.println("Output: ");
        System.out.println(divisorCount);
    }
}
