public class App {
    public static void main(String[] args) {
        int maxNumber = 7;

        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
