package com.cursosteste;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PrimeiroTeste {

    @Mock
    Calculadora calculadora;

    int numero1 = 10, numero2 = 5;

    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomar2Numeros(){
        // cenário

        //execução
        int resultado = calculadora.somar(numero1, numero2);

        //verificações
        Assertions.assertThat(resultado).isEqualTo(15);
    }

    @Test
    public  void naoDeveSomarNumerosNegativos(){

        //cenário

        int numero1 = -10, numero2 = 5;

        //execução
         org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> calculadora.somar(numero1,numero2)) ;

    }

    @Test
    public void deveSubtrair2Numeros(){
        //Cenário

        //execução
        int resultado = calculadora.subtrair(numero1, numero2);

        //Verificações
        Assertions.assertThat(resultado).isEqualTo(5);
    }

    @Test
    public void deveMultiplicar2Numeros(){

        //Cenário

        //Execução
        int resultado = calculadora.multiplicar(numero1, numero2);

        //Verificações
        Assertions.assertThat(resultado).isEqualTo(50);
    }

    @Test()
    public void deveDividir2Numeros(){

        //Cenário

        //Execução
        int resultado = calculadora.dividir(numero1, numero2);

        //Verificações
        Assertions.assertThat(resultado).isEqualTo(2);
    }

    @Test
    public void naoDeveDividirPorZero(){
        //cenário

        int numero1 = 0, numero2 = 2;

        //execução
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> calculadora.dividir(numero1, numero2)) ;
    }
}

class Calculadora {

    int somar(int numero1, int numero2){
        if(numero1 < 0 || numero2 < 0  ){
            throw  new RuntimeException("Não é possível somar números negativos.");
        }
        return numero1 + numero2;
    }

    int subtrair(int numero1, int numero2){
        return numero1 - numero2;
    }

    int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    int dividir(int numero1, int numero2){
        if(numero1 <= 0 || numero2 <= 0 )
            throw new RuntimeException("Não é possível dividir valores negativos");

        return numero1 / numero2;
    }

}

