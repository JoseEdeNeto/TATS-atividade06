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
   public void testeVetorOrdenadoImpar(){
       double vetor[] = {1, 2, 3, 4, 5};
       Calculadora mediana = new Calculadora();;
       double res = mediana.calculaMediana(vetor);
       
       Assert.assertEquals(3, res, 0.1);
   }
   
}