package tdd;

import tdd.CalculaMediana;
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
       CalculaMediana mediana = new CalculaMediana();;
       double res = mediana.calculaMediana(vetor);
       
       Assert.assertEquals(3, res, 0.1);
   }
   
}