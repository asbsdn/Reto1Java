import java.text.DecimalFormat;

public class CuerpoDeAgua {
    private int codigo;
    private double indice;
    private String nombre, municipio;
    DecimalFormat df = new DecimalFormat("#.00");

    // Defino el contrsuctor
    public CuerpoDeAgua(String nombre, int codigo, String municipio, double indice) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.municipio = municipio;
        this.indice = indice;
    }

    //Voy a agregaar esta line de codigo aquie a ver que pasa
    public double getIndice() {
        return indice;
    }

    // Defino los metodos

    public String nivel() {
        if (indice < 35.1) {
            return "medio";
        }
        return "otro";
    }

    public void imprimir() {
        System.out.println(df.format(indice));
    }

    public void imprimir_nombre() {
        if (indice > 14 && indice <= 35) {
            System.out.print(nombre + " ");
        }
    }
}
