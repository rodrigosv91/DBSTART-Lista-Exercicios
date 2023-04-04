package exercicio_01;

import org.junit.jupiter.api.Test;

import static lista_exercicios.exercicio_01.Exercicio_01.testaSeEhMaiorOuMenorDeIdade;
import static org.assertj.core.api.Assertions.assertThat;

class Exercicio_01Test {

    @Test
    void testaSeEhMaiorDeIdade(){
        String resultadoEsperado = "Pessoa maior de idade";
        String resultadoObtido = testaSeEhMaiorOuMenorDeIdade(18);
        assertThat(resultadoObtido).isEqualTo(resultadoEsperado);
    }

    @Test
    void testaSeEhMenorDeIdade(){
        String resultadoEsperado = "Pessoa menor de idade";
        String resultadoObtido = testaSeEhMaiorOuMenorDeIdade(17);
        assertThat(resultadoObtido).isEqualTo(resultadoEsperado);
    }
}
