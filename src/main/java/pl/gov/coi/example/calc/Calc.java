package pl.gov.coi.example.calc;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class Calc {

    private Addrer addrer;

    public Calc () {
        this(new Addrer42());
    }

    public Calc( Addrer addrer) {
        this.addrer = addrer;
    }

    public int add(int a, int b) {
      return addrer.addd(a, b);
    }
    public int substract(int a, int b) {
        return a - b;
    }
}
