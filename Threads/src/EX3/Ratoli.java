package EX3;

public class Ratoli implements Runnable{
    private String nom;

    public Ratoli(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void menja() {
        System.out.println("El ratolí " + getNom() + " ha començat a menjar");
        System.out.println("El ratolí " + getNom() + " està menjant");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("El ratolí " + getNom() + " ha acabat de menjar");
    }


    @Override
    public void run() {
        this.menja();
    }
}



