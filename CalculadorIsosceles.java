
public class CalculadorIsosceles {
    public static void main(String[] args) {


        int baseTriangulo = 16;
        int alturaTriangulo = 13;
        int largoPanel = 3;
        int anchoPanel = 2;

        int cantidadDePaneles = (baseTriangulo * alturaTriangulo) / (2 * largoPanel * anchoPanel);
        System.out.println(cantidadDePaneles);
    }
}

