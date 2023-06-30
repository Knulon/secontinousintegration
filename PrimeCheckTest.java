import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test für 3", true, PrimeCheck.isPrime(3));
    assertEquals("Test für 5", true, PrimeCheck.isPrime(5));
    assertEquals("Test für 7", true, PrimeCheck.isPrime(7));
    assertEquals("Test für 19", true, PrimeCheck.isPrime(19));
    assertEquals("Test für 23", true, PrimeCheck.isPrime(23));
  }
  
  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test für 4", false, PrimeCheck.isPrime(4));
    assertEquals("Test für 6", false, PrimeCheck.isPrime(6));
    assertEquals("Test für 9", false, PrimeCheck.isPrime(9));
    assertEquals("Test für 12", false, PrimeCheck.isPrime(12));
    assertEquals("Test für 36", false, PrimeCheck.isPrime(36));
  }
}
