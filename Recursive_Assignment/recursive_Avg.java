import java.util.*;

public class recursive_Avg {
    public static void main(String[] args) {
        System.out.println(avg.average(5));
    }
}

class avg {
    public static int average(int n) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int d = sc.nextInt();
        sc.close();
        if (n == 1)
            return d;
        else
            return (d + average(n - 1) * n - 1) / n;
    }
}