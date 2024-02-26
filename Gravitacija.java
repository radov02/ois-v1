import java.util.Scanner;

public class Gravitacija{

    private static final double G;
    private static final double M;
    private static final double r;
    static {
        G = 6.674 * Math.pow(10, -11);
        M = 5.972 * Math.pow(10, 24);
        r = 6.371 * Math.pow(10, 6);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nadmorska = sc.nextInt();
        izpisiGravPospesek(nadmorska);

        sc.close();
    }

    public static double gravPospesek(int v){
        return (G * M) / Math.pow(r + v, 2);
    }

    public static void izpisiGravPospesek(int v){
        System.out.println(gravPospesek(v));
    }
}