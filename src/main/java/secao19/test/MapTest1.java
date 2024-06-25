package secao19.test;

import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Alison");
        cookies.put("password", "123456");
        cookies.put("email", "alison@gmail.com");
        cookies.put("phone", "2222-2222");

        System.out.println("Username: " + cookies.get("username"));
        System.out.println(cookies.get("firstName"));
        System.out.println(cookies.size());
        System.out.println(cookies.remove("phone"));
        System.out.println(cookies.containsKey("phone"));

        cookies.put("email", "alisonsilva@gmail.com"); // vai substituir por esse novo value


        System.out.println();
        for (String key : cookies.keySet()) {
            System.out.println(key + " : " + cookies.get(key));
        }

    }
}
