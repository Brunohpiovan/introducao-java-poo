package ultracombat;

public class UltraCombat {
    
    public static void main(String[] args) {
        // nome,nac,idade,vit,derr,emp,alt,pes
        Lutador l[] = new Lutador[6];
                
        l[0] = new Lutador("Pretty boy", "França", 31, 11, 2, 1, 1.75F, 68.9F);
        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68F, 57.8F);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 1, 1.65F, 80.9F);
        l[3] = new Lutador("Dead code", "Australia", 28, 13, 0, 2, 1.93F, 81.6F);
        l[4] = new Lutador("Anderson silva", "Brasil", 37, 5, 4, 2, 1.70F, 119.3F);
        l[5] = new Lutador("Minotauro", "EUA", 30, 12, 2, 4, 1.81F, 105.7F);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();

    }
    
}
