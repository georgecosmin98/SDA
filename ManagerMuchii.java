public class ManagerMuchii {
    Muchie[] muchii;

    public ManagerMuchii(Muchie[] muchii) {
        this.muchii = muchii;
    }

    public void matriceDeAdiacenta(int numarLinii, int numarColoane) {
        int[][] matriceDeAdiacenta = new int[numarLinii][numarColoane];

        for (Muchie m : muchii) {
            matriceDeAdiacenta[m.getX() - 1][m.getY() - 1] = 1;
            matriceDeAdiacenta[m.getY() - 1][m.getX() - 1] = 1;

        }

        afisareMatrice(matriceDeAdiacenta);

    }

    public void matriceDeIncidenta(int numarLinii, int numarColoane) {

        int[][] matriceDeIncidenta = new int[numarLinii][numarColoane];

        int counter = 0;

        for (Muchie m : muchii) {
            matriceDeIncidenta[m.getX() - 1][counter] = 1;
            matriceDeIncidenta[m.getY() - 1][counter] = 1;
            counter++;
        }
        afisareMatrice(matriceDeIncidenta);
    }

    public void listaDeAdiacenta(int numarLinii, int numarColoane) {
        System.out.println("Varful I   | Lista vecinilor lui I");
        int[][] matrice = new int[numarLinii][numarColoane];
        int lastX=0;
        for (Muchie m : muchii) {
            matrice[m.getX() - 1][m.getY() - 1] = 1;
            matrice[m.getY() - 1][m.getX() - 1] = 1;
        }
        for(int i=0;i<numarLinii;i++){
            System.out.print((i+1)+ " | ");
            for(int j=0;j<numarColoane;j++)
                if(matrice[i][j]==1)
                    System.out.print((j+1) + " ");


            System.out.println();
        }
    }



    public void afisareMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
