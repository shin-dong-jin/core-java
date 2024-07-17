package ch16collectionsframework;

import java.util.Date;
import java.util.Map;
import java.util.Hashtable;
import java.util.StringTokenizer;

/* 문자열 Parsing방법 3가지
    1. string.split(String regex)
    2. scanner.useDelimiter(String regex)
    3. StringTokenizer class
*/
public class MapDemo {
    public static void main(String[] args) {
        Date date = new Date();
        String dateString = date.toString();

        StringTokenizer tokenizer = new StringTokenizer(dateString);
        String[] dateArray = new String[tokenizer.countTokens()];
        for (int i = 0; i < dateArray.length; i++) {
            dateArray[i] = tokenizer.nextToken();
        }

        System.out.println("오늘은 " + dateArray[5] + "년 " + getMonthByName(dateArray[1]) + "월 " + dateArray[2] + "일입니다.");
    }

    private static int getMonthByName(String month) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("Jan", 1);
        map.put("Feb", 2);
        map.put("Mar", 3);
        map.put("Apr", 4);
        map.put("May", 5);
        map.put("Jun", 6);
        map.put("Jul", 7);
        map.put("Aug", 8);
        map.put("Sep", 9);
        map.put("Oct", 10);
        map.put("Nov", 11);
        map.put("Dec", 12);
        return map.get(month);
    }
}
