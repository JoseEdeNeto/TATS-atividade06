package tdd;

import com.mycompany.atividade06.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
   
   @Test
   public void testeVetorOrdenadoImparMediana(){
       double vetor[] = {1, 2, 3, 4, 5};
       Calculadora mediana = new Calculadora();;
       double res = mediana.calculaMediana(vetor);
       
       Assert.assertEquals(3, res, 0.1);
   }
   
   @Test
   public void testeVetorDesordenadoParMediana(){
       double vetor[] = {5, 2, 1, 4, 3, 6};
       Calculadora mediana = new Calculadora();;
       double res = mediana.calculaMediana(vetor);
       
       Assert.assertEquals(3.5, res, 0.1);
   }
}