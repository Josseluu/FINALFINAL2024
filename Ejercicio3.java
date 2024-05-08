public class Ejercicio3 {
    public static void main(String[] args) {
        int a = recursive(2, -3);
        System.out.println(a);
    }

    public static int recursive(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return 1 / recursive(a, -b);
        } else {
            return a * recursive(a, b - 1);
        }
    }
}
