import javax.naming.NameParser;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj rozmiar trojkata: ");
          int size = new Scanner(System.in).nextInt();;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój znak: ");
        String name = scanner.next();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print(Name);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}