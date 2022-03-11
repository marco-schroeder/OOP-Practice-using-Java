abstract class Haustier {
    String Name;
    final String Besitzer;

     Haustier(String pName, String pBesitzer) {

        this.Name = pName;
        this.Besitzer = pBesitzer;
    }

    abstract void Pflegen();
}
