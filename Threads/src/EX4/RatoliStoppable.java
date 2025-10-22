package EX4;

public class RatoliStoppable extends Ratoli {
    private boolean corrent = true; // controla si sigue comiendo

    public RatoliStoppable(String nom) {
        super(nom);
    }

    // método para detener el ratón
    public void stopRunning() {
        corrent = false;
    }

    @Override
    public void run() {
        while (corrent) { // sigue comiendo mientras corrent sea true
            menja();
        }
        System.out.println("El ratolí " + getNom() + " ha deixat de menjar.");
    }
}
