package vii_poo.v_relacionamentoclasses;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador lut[] = new Lutador[6];
        //Cadastro de lutadores
        lut[0] = new Lutador("Pretty Boy", "Frances", 31, 1.75, 68.9,
                13, 2, 3
        );
        lut[1] = new Lutador("Putscript", "brasileiro", 29, 1.68, 57.8,
                14, 2, 3
        );
        lut[2] = new Lutador("Bolt", "americano", 30, 1.81, 81.0,
                14, 0, 1
        );

        lut[3] = new Lutador("Bebe", "italiano", 29, 1.69, 78.6,
                7, 2, 0
        );
        lut[4] = new Lutador("Babu", "inglês", 38, 1.90, 119.0,
                12, 2, 3
        );
        lut[5] = new Lutador("Percy", "Romano", 23, 1.84, 100.7,
                10, 0, 0
        );
        //Luta
        Luta uec = new Luta();
        uec.marcarLuta(lut[0], lut[1]);
        uec.lutar();
        lut[0].status();
        System.out.println("-----");
        lut[1].status();

    }
}
