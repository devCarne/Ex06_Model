package myTest;

import java.util.HashMap;
import java.util.Map;

public class ModelUse {

    public static void main(String[] args) {

        Map<String, String> model = new HashMap<>();
        String sReturn = root(model);
        PrintData(sReturn, model);
    }

    private static void PrintData(String sReturn, Map<String, String> model) {
        String str1 = model.get("name1");
        System.out.println(str1);
        System.out.println("WEB-INF/views/" + sReturn + ".jsp");
    }

    private static String root(Map<String, String> model) {
        model.put("name1", "홍길동");
        model.put("name2", "전우치");

        return "Hello";
    }
}
