import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    void diferenca() {
        //Preparação
        Calculadora calculadora = new Calculadora();
        calculadora.setA(10);
        calculadora.setB(5);

        //Execução
        int n = calculadora.diferenca();

        // Validação
        assertEquals(5,n);
    }

    @Test
    void divisao() {
        //Preparação
        Calculadora calculadora = new Calculadora();
        calculadora.setA(10);
        calculadora.setB(5);

        //Execução
        int n = calculadora.divisao();

        // Validação
        assertEquals(2,n);
    }

    @Test
    void produto() {
        //Preparação
        Calculadora calculadora = new Calculadora();
        calculadora.setA(10);
        calculadora.setB(5);

        //Execução
        int n = calculadora.produto();

        // Validação
        assertEquals(50,n);
    }

    @Test
    void soma() {
        //Preparação
        Calculadora calculadora = new Calculadora();
        calculadora.setA(10);
        calculadora.setB(5);

        //Execução
        int n = calculadora.soma();

        // Validação
        assertEquals(15,n);
    }
}