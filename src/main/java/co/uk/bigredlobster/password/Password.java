package co.uk.bigredlobster.password;

import java.util.ArrayList;
import java.util.List;

public class Password {

    public static void main(String[] args) {
        Parser parser = new Parser();
        List<String> params = parser.doIt(args);

        Password p = new Password();
        List<String> items = p.doIt(
                params.get(0),
                Integer.parseInt(params.get(1)) - 1,
                Integer.parseInt(params.get(2)) - 1,
                Integer.parseInt(params.get(3)) - 1
        );

        items.forEach(System.out::println);
    }

    private List<String> doIt(String s, int s1, int s2, int s3) {
        List<String> out = new ArrayList<>();
        out.add(String.valueOf(s.charAt(s1)));
        out.add(String.valueOf(s.charAt(s2)));
        out.add(String.valueOf(s.charAt(s3)));
        return out;
    }
}
