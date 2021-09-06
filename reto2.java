import java.util.Scanner;
import java.text.DecimalFormat;

public class reto2 {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        int cantidad = teclado.nextInt();
        teclado.nextLine();
        CuerpoDeAgua[] listaCuerpo = new CuerpoDeAgua[cantidad];
        double nivel = 0;
        double suma = 0;
        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < cantidad; i++) {
            String[] entrada = teclado.nextLine().split(" ");
            listaCuerpo[i] = new CuerpoDeAgua(entrada[0], Integer.parseInt(entrada[1]), entrada[2], Double.parseDouble(entrada[3]));
        }teclado.close();

        for (int i = 0; i < listaCuerpo.length; i++) {
            listaCuerpo[i].imprimir();
        }
        for (int i = 0; i < listaCuerpo.length; i++) {
            if (listaCuerpo[i].nivel() == "medio") {
                nivel += 1;
            }
        }
        System.out.println(df.format(nivel));

        for (int i = 0; i < listaCuerpo.length; i++) {
            listaCuerpo[i].imprimir_nombre();
            suma += listaCuerpo[i].getIndice();
        }
        System.out.println();
        double prom = suma / listaCuerpo.length;
        System.out.println(df.format(prom));
    }
}