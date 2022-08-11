import java.util.*;
public class MarksSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(97);
        marks.add(93);
        marks.add(89);
        marks.add(85);
        marks.add(90);
        System.out.println(marks);
        marks.remove(2);
        System.out.println(marks);

    }
}