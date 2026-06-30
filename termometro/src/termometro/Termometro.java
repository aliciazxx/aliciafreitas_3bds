package termometro;
public class Termometro {
    // Atributo privado para garantir o encapsulamento
    private double temperatura;

    // Construtor padrão que inicia a temperatura em 20.0 graus
    public Termometro() {
        this.temperatura = 20.0;
    }

    // Método Getter para ler a temperatura atual
    public double getTemperatura() {
        return this.temperatura;
    }

    // Método Setter com as regras de validação do laboratório
    public void setTemperatura(double novaTemperatura) {
        if (novaTemperatura < -10.0 || novaTemperatura > 50.0) {
            System.out.println("⚠️ ALERTA: Alteração rejeitada! A temperatura de " + novaTemperatura + "°C está fora dos limites permitidos (-10.0°C a 50.0°C).");
        } else {
            this.temperatura = novaTemperatura;
            System.out.println("✅ Temperatura alterada com sucesso para: " + novaTemperatura + "°C");
        }
    }
}