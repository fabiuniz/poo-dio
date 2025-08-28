<!-- 
  Tags: Dev
  Label: ☕ POO java
  Description: Desafio POO - Demonstração dos 4 Pilares da Programação Orientada a Objetos
  path_hook: hookfigma.hook7
-->

# Desafio POO - Demonstração dos 4 Pilares da Programação Orientada a Objetos

## 📋 Sobre o Projeto

Este projeto demonstra de forma prática os quatro pilares fundamentais da Programação Orientada a Objetos (POO) através de um sistema de veículos. O sistema modela diferentes tipos de veículos (carros e motos) com comportamentos específicos, exemplificando como a POO pode ser aplicada para resolver problemas reais.

## 🏗️ Estrutura do Projeto

```
src/br/com/fabiuniz/desafio/
├── Veiculo.java      # Classe abstrata (pai)
├── Carro.java        # Classe concreta (filha)
├── Moto.java         # Classe concreta (filha)
└── Main.java         # Classe principal com demonstrações
```

## 🎯 Os 4 Pilares da POO Demonstrados

### 1. 🔒 **Abstração**

**Localização**: `Veiculo.java`

A abstração é implementada através da classe abstrata `Veiculo`, que define um "contrato" comum para todos os tipos de veículos:

```java
public abstract class Veiculo {
    // Métodos abstratos que devem ser implementados pelas subclasses
    public abstract void acelerar();
    public abstract void calcularVelocidadeMaxima();
}
```

**Como funciona**: A classe `Veiculo` abstrai as características comuns de todos os veículos (marca, modelo) e define comportamentos que devem existir, mas que serão implementados de forma específica por cada tipo de veículo.

### 2. 🛡️ **Encapsulamento**

**Localização**: `Veiculo.java`, `Carro.java`, `Moto.java`

O encapsulamento protege os dados internos das classes e controla o acesso através de métodos públicos:

```java
// Atributos privados - não podem ser acessados diretamente
private String marca;
private String modelo;
private int numeroDePortas;

// Métodos públicos para acessar os dados
public String getMarca() {
    return marca;
}
```

**Como funciona**: Os atributos são declarados como `private`, impedindo acesso direto. O acesso é feito através de métodos `getter`, garantindo controle sobre como os dados são manipulados.

### 3. 🔄 **Herança**

**Localização**: `Carro.java` e `Moto.java`

As classes filhas herdam características e comportamentos da classe pai:

```java
public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo); // Chama o construtor da classe pai
        this.numeroDePortas = numeroDePortas;
    }
}
```

**Como funciona**: `Carro` e `Moto` herdam de `Veiculo` usando `extends`, reutilizando código comum (marca, modelo) e adicionando características específicas (numeroDePortas, tipoDeGuidao).

### 4. 🎭 **Polimorfismo**

**Localização**: `Carro.java`, `Moto.java`, `Main.java`

O mesmo método (`acelerar()`) se comporta de forma diferente dependendo do tipo do objeto:

```java
// Em Carro.java
@Override
public void acelerar() {
    System.out.println("O carro está acelerando com as 4 rodas.");
}

// Em Moto.java
@Override
public void acelerar() {
    System.out.println("A moto está acelerando sobre duas rodas.");
}
```

**Demonstração prática no Main**:
```java
List<Veiculo> veiculos = new ArrayList<>();
veiculos.add(new Carro("Ford", "Mustang", 2));
veiculos.add(new Moto("Yamaha", "Fazer", "esportivo"));

for (Veiculo veiculo : veiculos) {
    veiculo.acelerar(); // Cada objeto executa sua própria versão
}
```

## 🚀 Como Executar

1. **Compilar o projeto**:
   ```bash
   javac -d bin src/br/com/fabiuniz/desafio/*.java
   ```

2. **Executar a aplicação**:
   ```bash
   java -cp bin br.com.fabiuniz.desafio.Main
   ```

## 📊 Saída Esperada

```
--- DEMONSTRAÇÃO DOS PILARES DA POO ---

--- HERANÇA: Criação de objetos das subclasses ---

--- POLIMORFISMO: Tratando objetos de forma genérica ---
--- Processando um Carro ---
O carro Ford Mustang está acelerando com as 4 rodas.
O carro Ford Mustang atinge 200 km/h.
Marca do veículo (acesso via getter): Ford
--------------------
--- Processando um Carro ---
O carro Honda Civic está acelerando com as 4 rodas.
O carro Honda Civic atinge 180 km/h.
Marca do veículo (acesso via getter): Honda
--------------------
--- Processando um Moto ---
A moto Yamaha Fazer está acelerando sobre duas rodas.
A moto Yamaha Fazer atinge 180 km/h.
Marca do veículo (acesso via getter): Yamaha
--------------------
--- Processando um Moto ---
A moto Harley-Davidson Iron está acelerando sobre duas rodas.
A moto Harley-Davidson Iron atinge 150 km/h.
Marca do veículo (acesso via getter): Harley-Davidson
--------------------
```

## 💡 Pontos-Chave da Implementação

- **Flexibilidade**: Novos tipos de veículos podem ser facilmente adicionados
- **Manutenibilidade**: Mudanças em comportamentos específicos não afetam outras classes
- **Reutilização**: Código comum fica na classe pai
- **Segurança**: Dados internos protegidos pelo encapsulamento

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **POO** - Paradigma de programação aplicado

## 👨‍💻 Autor

[Fabiano Rocha/Fabiuniz](https://github.com/SeuUsuarioGitHub)

## Licença

LICENSE
MIT License

Copyright (c) fabiuniz@msn.com (https://github.com/fabiuniz)

