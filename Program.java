class Program {
    public static void main(String[] args) {
        Fisch[] Aquarium = new Fisch[4];
        Goldfisch GF1 = new Goldfisch("Lisa1", "Eichwitz1");
        Goldfisch GF2 = new Goldfisch("Lisa2", "Eichwitz2");
        Guppy GU1 = new Guppy("Lisa3", "Eichwitz3");
        Guppy GU2 = new Guppy("Lisa4", "Eichwitz4");
        Aquarium[0] = GF1;
        Aquarium[1] = GF2;
        Aquarium[2] = GU1;
        Aquarium[3] = GU2;
        for (Fisch fisch : Aquarium) {
            fisch.Schwimmen();
            fisch.Pflegen();
        }
        Saeuger[] Garten = new Saeuger[4];
        Kaninchen KN1 = new Kaninchen("Lisa5", "Eichwitz5");
        Kaninchen KN2 = new Kaninchen("Lisa6", "Eichwitz6");
        Katze KZ1 = new Katze("Lisa7", "Eichwitz7");
        Katze KZ2 = new Katze("Lisa8", "Eichwitz8");
        Garten[0] = KN1;
        Garten[1] = KN2;
        Garten[2] = KZ1;
        Garten[3] = KZ2;
        for (Saeuger saeuger : Garten) {
            saeuger.Fortbewegen();
            saeuger.Pflegen();
        }
        Haustier[][] Zoo = new Haustier[][] {Aquarium, Garten};
        for (Haustier[] haustier_array : Zoo) {
            for (Haustier haustier : haustier_array) {
                haustier.Pflegen();
            }
        }
        KN1.Fressen("Nahrung1");
        KN2.Fressen("Nahrung2");
        KZ1.Fressen("Nahrung1");
        KZ1.Fressen("Nahrung2");
    }
}
