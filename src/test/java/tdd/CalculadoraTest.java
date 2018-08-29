package tdd;

import com.mycompany.atividade06.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
   
   @Test
   public void testeVetorOrdenadoImparMediana() throws Exception{
       double[] vetor = {1, 2, 3, 4, 5};
       Calculadora mediana = new Calculadora();;
       double res = mediana.calculaMediana(vetor);
       
       Assert.assertEquals(3, res, 0.1);
   }
   
   @Test
   public void testeVetorDesordenadoParMediana() throws Exception{
       double[] vetor = {5, 2, 1, 4, 3, 6};
       Calculadora mediana = new Calculadora();;
       double res = mediana.calculaMediana(vetor);
       
       Assert.assertEquals(3.5, res, 0.1);
   }
   
   @Test
   public void testeMediaValoresMenorMaiorAcimaAbaixo() throws Exception{
       double[] vetor = {5, 2, 1, 4, 3, 6};
       Calculadora calc = new Calculadora();
       double media = calc.calculaMedia(vetor);
       double menorValor = calc.getMenorValor(vetor);
       double maiorValor = calc.getMaiorValor(vetor);
       int numerosAbaixo = calc.getValoresAbaixo(vetor, media);
       int numerosAcima = calc.getValoresAcima(vetor, media);
       
       Assert.assertEquals(3.5, media, 0.1);
       Assert.assertEquals(1, menorValor, 0.1);
       Assert.assertEquals(6, maiorValor, 0.1);
       Assert.assertEquals(3, numerosAbaixo);
       Assert.assertEquals(3, numerosAcima);
   }
   
   @Test
   public void testDesvioPadrao() throws Exception{
       double[] vetor = {5, 2, 1, 4, 3, 6};
       Calculadora calc = new Calculadora();
       double desvio = calc.calculaDesvioPadrao(vetor);
       
       Assert.assertEquals(1.707825, desvio, 0.5);
   }
   
   @Test
   public void testeMenoresMaiores() throws Exception{
       double[] vetor = {5, 2, 1, 4, 3, 6};
       Calculadora calc = new Calculadora();
       double[] valores = calc.menoresMaiores(vetor, 2);
       double[] expected = {1, 2, 5, 6};
       
       Assert.assertArrayEquals(expected, valores, 0);
   }
   
   @Test(expected = Exception.class)
   public void testeVetorVazio() throws Exception{
       double[] vetor = {};
       Calculadora calc = new Calculadora();
       calc.calculaMedia(vetor);
   }
}