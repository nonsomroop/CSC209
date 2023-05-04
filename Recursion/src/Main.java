public class Main {
    public static void main(String[] args) {
        System.out.println(h(2));
    }

    public static int h(int n){
        if (n == 0){
            return 0;
        } else if (n > 0 && n <= 4){
            return h(2 + h(2 * n));
        } else {
            return n;
        }
    }
}