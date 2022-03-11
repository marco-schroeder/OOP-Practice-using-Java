abstract class Saeuger extends Haustier implements IStreichelbar{
    Saeuger(String pName, String pBesitzer) {
        super(pName, pBesitzer);
    }

    abstract void Fortbewegen();
}
