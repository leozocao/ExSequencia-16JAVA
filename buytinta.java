import java.util.Scanner;

public class buytinta {
    public static void main(String[] args) {
        double coberturatinta = 3.0;
        double capacidadelata = 18.0;
        double precolata = 80.0;

        double metrosporlata, latasinteiras, area, precototal;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        area = teclado.nextDouble();

        metrosporlata = (coberturatinta * capacidadelata);
        latasinteiras = (area / metrosporlata);
        latasinteiras = Math.ceil(latasinteiras);
        precototal = (latasinteiras * precolata);

        System.out.println("A quantidade de latas a serem compradas: " + latasinteiras);
        System.out.print("O preço a ser pago é de R$" + precototal);

        teclado.close();

    }
}