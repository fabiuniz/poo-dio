// src/br/com/fabiuniz/desafio/Veiculo.java
package br.com.fabiuniz.desafio;

// ABSTRAÇÃO: A classe Veiculo é abstrata. Ela define um "contrato"
// para os métodos que as subclasses devem implementar.
public abstract class Veiculo {

    // ENCAPSULAMENTO: Os atributos são protegidos (protected)
    // e o acesso a eles é feito através de métodos públicos.
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos abstratos que obrigam as subclasses a implementá-los
    public abstract void acelerar();
    public abstract void calcularVelocidadeMaxima();

    // Métodos públicos (getters) para acessar os atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}