class Guppy extends Fisch {
    public Guppy(String pName, String pBesitzer) {
        super(pName, pBesitzer);
    }
    @Override
    void Schwimmen() {
        HinUndHerSchwimmen();
    }
    void HinUndHerSchwimmen(){
        System.out.println("Guppys schwimmen hin und her.");
    }
}
