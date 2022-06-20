package com.learning.Challange;
import java.util.List;
public class JavaReadXmlSaxTestChallange {
    public static void main(String[] args) {
        Runner runner = new Runner();
        List<User> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}
