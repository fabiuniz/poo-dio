// src/br/com/fabiuniz/desafio/Carro.java
package br.com.fabiuniz.desafio;

// HERANÇA: Carro herda de Veiculo.
public class Carro extends Veiculo {

    private int numeroDePortas;

    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo); // Chama o construtor da classe pai (Veiculo)
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    // POLIMORFISMO: Este método é uma implementação específica de acelerar() para Carro.
    @Override
    public void acelerar() {
        System.out.println("O carro " + getMarca() + " " + getModelo() + " está acelerando com as 4 rodas.");
    }

    // POLIMORFISMO: Este método é uma implementação específica de calcularVelocidadeMaxima() para Carro.
    @Override
    public void calcularVelocidadeMaxima() {
        int velocidade = 180;
        if (numeroDePortas == 2) {
            velocidade += 20;
        }
        System.out.println("O carro " + getMarca() + " " + getModelo() + " atinge " + velocidade + " km/h.");
    }
}