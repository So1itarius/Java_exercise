import java.util.*;
import java.util.stream.Collectors;

public class newMain {
    static public void main(String[] argv) {
        Book b1 = new Book();
        b1.book_name = "Война и мир";
        Book b2 = new Book();
        b2.book_name = "Преступление и наказание";
        Book b3 = new Book();
        b3.book_name = "Идиот";

        Reader r1 = new Reader();
        r1.firstname = "Иван";
        r1.lastname = "Иванов";
        Reader r2 = new Reader();
        r2.firstname = "Петр";
        r2.lastname = "Петров";

        ArrayList<Reader> g1 = new ArrayList<>();
        g1.add(r1);
        g1.add(r2);


        Information info_string1 = new Information(b1, g1);

        ArrayList<Information> Table = new ArrayList<>();
        Table.add(info_string1);

        //System.out.println(Table.get(0).readers.get(0).firstname);


        ArrayList<String[]> Table1 = new ArrayList<>();
        String[] a0 = {"Война и мир", "Иван Иванов"};
        String[] a1 = {"Война и мир", "Петр Петров"};
        Table1.add(a0);
        Table1.add(a1);

        //System.out.println(Table1.stream().map((s) -> s[0]).distinct().collect(Collectors.toList()));
        //System.out.println(Table1.stream().map((s) -> s[0]).distinct().collect(Collectors.toList()));
        ArrayList<String[]> arr = ExcelParser.parse("C:\\Users\\Павел\\IdeaProjects\\Java_exercise\\src\\Result_1.xls");

        //arr.stream().map(Arrays::toString).forEach(System.out::println);
        //arr.stream().map((s) -> s[0]).distinct().collect(Collectors.toList()).forEach(System.out::println);
        Map<Object, String> f = arr.stream().collect(Collectors.groupingBy(p -> p[0],
                                                       Collectors.mapping((p) -> p[1], Collectors.joining(";"))));
        //System.out.println(f);
        for (Object key : f.keySet()) {
            System.out.printf("%s: %s\n", key, f.get(key));
        }
        //System.out.println(f.get("Час Быка"));
        //System.out.println(Arrays.toString(arr.get(0)));
        //for (String[] a:f.get("Час Быка")){System.out.println(Arrays.toString(a));}


    }
}
