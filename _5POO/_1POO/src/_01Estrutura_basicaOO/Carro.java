package _01Estrutura_basicaOO;

/*
Ordem em uma classe
 1 - atributos
 2 - construtores
 3 - geters and setters
 4 - métodos
 */

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor padrão (possui mesmo nome da classe).
    Carro() {}

    //sobrecaga do construtor
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }//atribui um valor ao atributo cor.

    String getCor() {
        return cor;
    } //devolve a cor

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombistivel){
        return capacidadeTanque * valorCombistivel;
    }
}
