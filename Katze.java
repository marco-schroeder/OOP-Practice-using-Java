class Katze extends Saeuger implements IFleischfresser{
    public Katze(String pName, String pBesitzer) {

        super(pName, pBesitzer);
    }

    void FellBuersten() {
        System.out.println("Katzen werden durch Fell Buersten gepflegt.");
    }

    void Schleichen() {
        System.out.println("Katzen bewegen sich durch Schleichen fort.");
    }

    void Schnurren() {
        System.out.println("Katzen schnurren wenn sie gestreichelt werden.");
    }

    @Override
    void Pflegen() {
        FellBuersten();
    }

    @Override
    void Fortbewegen() {
        Schleichen();
    }

    @Override
    public void Streicheln() {
        Schnurren();
    }

    @Override
    public void Fressen(String pNahrung) {
        System.out.println("Katzen sind Fleischfresser und fressen daher "+pNahrung+".");
    }
}
