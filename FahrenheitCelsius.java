import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual conversão você quer fazer? Digite: "
        + "F para converter de Celsius para Fahrenheit, e C para converter de Fahrenheit para Celsius \n");
        String escolha = scan.next();
        System.out.println("Por favor, digite a temperatura a ser convertida: ");
        double temp = scan.nextDouble();

        double resultado = "F".equals(escolha) ? ((temp * 9/5) + 32) : -99999;
        resultado = "C".equals(escolha) ? (temp - 32) * 5/9 : resultado;
        String temperatura = "F".equals(escolha) ? "Fahrenheit" : "";
        temperatura = "C".equals(escolha) ? "Celsius" : temperatura;
        String outraTemperatura = "Fahrenheit".equals(temperatura) ? "Celsius" : "Fahrenheit";

        System.out.printf("\n%.2f %s convertido para %s = %.2f", temp, outraTemperatura, temperatura, resultado);
    }
}