class Goldfisch extends Fisch implements IStreichelbar{
    public Goldfisch(String pName, String pBesitzer) {
        super(pName, pBesitzer);
    }

    void ImKreisSchwimmen(){
        System.out.println("Goldfische schwimmen im Kreis.");
    }

    @Override
    void Schwimmen() {
        ImKreisSchwimmen();
    }

    @Override
    public void Streicheln() {
        System.out.println("Goldfische können ebenfalls gestreichelt werden.");
    }
}
