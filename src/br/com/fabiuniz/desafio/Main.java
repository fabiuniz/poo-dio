// src/br/com/fabiuniz/desafio/Main.java
package br.com.fabiuniz.desafio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- DEMONSTRAÇÃO DOS PILARES DA POO ---");

        System.out.println("\n--- HERANÇA: Criação de objetos das subclasses ---");
        // Carro e Moto são criados a partir de suas classes, que herdam de Veiculo.
        Carro carro1 = new Carro("Ford", "Mustang", 2);
        Carro carro2 = new Carro("Honda", "Civic", 4);
        Moto moto1 = new Moto("Yamaha", "Fazer", "esportivo");
        Moto moto2 = new Moto("Harley-Davidson", "Iron", "cruiser");

        System.out.println("\n--- POLIMORFISMO: Tratando objetos de forma genérica ---");
        // A lista é de Veiculo, mas pode conter objetos de Carro e Moto.
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(carro2);
        veiculos.add(moto1);
        veiculos.add(moto2);

        // O loop itera sobre a lista de Veiculos...
        for (Veiculo veiculo : veiculos) {
            System.out.println("--- Processando um " + veiculo.getClass().getSimpleName() + " ---");
            
            // ...mas o método chamado (acelerar) se comporta de maneira diferente para cada tipo.
            // Isso é o POLIMORFISMO!
            veiculo.acelerar();
            veiculo.calcularVelocidadeMaxima();
            
            // Exemplo de como o ENCAPSULAMENTO é acessado:
            System.out.println("Marca do veículo (acesso via getter): " + veiculo.getMarca());
            System.out.println("--------------------");
        }
    }
}