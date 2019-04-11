import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new FileReader("C:\\Users\\ylyho\\SDA\\lab3\\src\\graf.txt"));

        int n = sc.nextInt();
        int m = sc.nextInt();

        Muchie[] muchii = new Muchie[m];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int cost = sc.nextInt();
            muchii[i] = new Muchie(x, y, cost);
        }

        sc.close();

        ManagerMuchii managerMuchii=new ManagerMuchii(muchii);
        System.out.println("Matrice de adiacenta:");
        managerMuchii.matriceDeAdiacenta(n,m);
        System.out.println("Matrice de incidenta: ");
        managerMuchii.matriceDeIncidenta(n,m);
        managerMuchii.listaDeAdiacenta(n,m);
    }
}
