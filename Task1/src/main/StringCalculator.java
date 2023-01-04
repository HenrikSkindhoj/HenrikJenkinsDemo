package main;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) { 

        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        String input = numbers;
        if (numbers.startsWith("//")) {
            StringTokenizer st = new StringTokenizer(numbers, "\n");
            delimiter = st.nextToken().substring(2);
            input = st.nextToken();
        }

        int sum = 0;
        String[] split = input.split(delimiter);
        for (String str : split) {
            sum += Integer.parseInt(str);
        }

        return sum;
    }
}
