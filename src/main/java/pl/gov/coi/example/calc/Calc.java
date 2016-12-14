package pl.gov.coi.example.calc;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class Calc {

    public int add(int a, int b) {
      if (a > b) {
        return a + b;
      } else if (b < a) {
        return b + a;
      } else {
        return 2 * a;
      }
    }
    public int substract(int a, int b) {
        return a - b;
    }
}
