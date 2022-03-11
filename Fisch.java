abstract class Fisch extends Haustier {
     Fisch(String pName, String pBesitzer) {
        super(pName, pBesitzer);
    }
    @Override
    void Pflegen() {
        WasserWechseln();
    }
    abstract void Schwimmen();
    void WasserWechseln() {
        System.out.println("Fische werden durch Wasser Wechseln gepflegt.");
    }
}
