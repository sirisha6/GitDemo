import java.util.*;
public class Example2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int week[] = new int[7];
        for (int i = 0; i < week.length; i++) {
            week[i] = sc.nextInt();
        }
        float total=0.0f;
        int t=0;
        for (int i = 0; i < week.length; i++) {
            t += week[i];
            total = total + week[i] * 100;
            if (week[i] > 8) {
                int temp = week[i] - 8;
                total = total + (temp * 15);
            }
        }
        if (t > 40) {
            int temp1 = 40 - t;
            total = total + temp1 * 25;
        }
        float sun_d = 0;
        if (week[0] > 0) {
            sun_d = week[0] * 100;
            if (week[0] > 8) {
                int sun1 = week[0] - 8;
                sun_d = sun_d + (sun1 * 15);
            }
            sun_d = sun_d + (sun_d * 0.50f);
        }
        float sat_d = 0;
        if (week[6] > 0) {
            sat_d = week[6] * 100;
            if (week[6] > 8) {
                int sat1 = week[6] - 8;
                sat_d = sat_d + (sat1 * 15);
            }
            sat_d = sat_d + (sat_d * 0.25f);
        }
        total = total + sun_d + sat_d;
        System.out.print(total);
    }
}
