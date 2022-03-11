class Kaninchen extends Saeuger implements IPflanzenfresser {
    public Kaninchen(String pName, String pBesitzer) {
        super(pName, pBesitzer);
    }
    void StallAusmisten() {
        System.out.println("Kaninchen werden durch Stall Ausmisten gepflegt.");
    }
    void Hoppeln() {
        System.out.println("Kaninchen bewegen sich durch Hoppeln fort.");
    }
    @Override
    void Pflegen() {
        StallAusmisten();
    }
    @Override
    void Fortbewegen() {
        Hoppeln();
    }
    @Override
    public void Streicheln() {
        System.out.println("Kaninchen sind Saeuger und können daher gestreichelt werden");
    }
    @Override
    public void Fressen(String pNahrung) {
        System.out.println("Kaninchen sind Pflanzenfresser und fressen daher "+pNahrung+".");
    }
}
