
// TreeMAP --> Keys are sorted, sirf keys ke basis pr sort krega ye

import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Kali", 100);
        tm.put("Linux", 400);
        tm.put("HELO", 30);
        tm.put("Jaanu", 500);

        System.out.println(tm);
    }
}