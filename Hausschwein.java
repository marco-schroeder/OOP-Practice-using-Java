class Hausschwein extends Saeuger implements IAllesfresser {
    public Hausschwein(String pName, String pBesitzer) {
        super(pName, pBesitzer);
    }
    @Override
    void Pflegen() { }
    @Override
    public void Fressen(String pNahrung) {
        System.out.println("Hausschweine sind Allesfresser und fressen daher"+pNahrung+".");
    }
    @Override
    public void Streicheln() {
        System.out.println("Hausschweine sind Saeuger und können daher gestreichelt werden.");
    }
    @Override
    void Fortbewegen() { }
}
