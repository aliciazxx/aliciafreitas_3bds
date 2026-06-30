package termometro;
public class Main {
    public static void main(String[] args) {
        // 1. Instanciando o termômetro
        Termometro termometro = new Termometro();
        System.out.println("Temperatura inicial do laboratório: " + termometro.getTemperatura() + "°C");
        System.out.println("--------------------------------------------------");

        // 2. Mudando para uma temperatura válida
        System.out.println("Tentando alterar a temperatura para 25.5°C...");
        termometro.setTemperatura(25.5);
        System.out.println("Temperatura atual: " + termometro.getTemperatura() + "°C");
        System.out.println("--------------------------------------------------");

        // 3. Tentando mudar para um valor inválido (acima do limite)
        System.out.println("Tentando alterar a temperatura para 55.0°C...");
        termometro.setTemperatura(55.0);
        System.out.println("Temperatura atual (permanece a anterior): " + termometro.getTemperatura() + "°C");
        System.out.println("--------------------------------------------------");

        // 4. Tentando mudar para outro valor inválido (abaixo do limite)
        System.out.println("Tentando alterar a temperatura para -15.0°C...");
        termometro.setTemperatura(-15.0);
        System.out.println("Temperatura final do sistema: " + termometro.getTemperatura() + "°C");
    }
}
