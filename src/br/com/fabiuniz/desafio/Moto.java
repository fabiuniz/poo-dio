// src/br/com/fabiuniz/desafio/Moto.java
package br.com.fabiuniz.desafio;

// HERANÇA: Moto herda de Veiculo.
public class Moto extends Veiculo {

    private String tipoDeGuidao;

    public Moto(String marca, String modelo, String tipoDeGuidao) {
        super(marca, modelo); // Chama o construtor da classe pai (Veiculo)
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    // POLIMORFISMO: Implementação específica de acelerar() para Moto.
    @Override
    public void acelerar() {
        System.out.println("A moto " + getMarca() + " " + getModelo() + " está acelerando sobre duas rodas.");
    }

    // POLIMORFISMO: Implementação específica de calcularVelocidadeMaxima() para Moto.
    @Override
    public void calcularVelocidadeMaxima() {
        int velocidade = 150;
        if (tipoDeGuidao.equals("esportivo")) {
            velocidade += 30;
        }
        System.out.println("A moto " + getMarca() + " " + getModelo() + " atinge " + velocidade + " km/h.");
    }
}