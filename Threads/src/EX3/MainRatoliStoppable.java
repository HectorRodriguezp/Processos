package EX3;

public class MainRatoliStoppable {
    public static void main(String[] args) {
        // 2 ratones normales
        Ratoli r1 = new Ratoli("Ratolí1");
        Ratoli r2 = new Ratoli("Ratolí2");

        // 1 ratón stoppable
        RatoliStoppable r3 = new RatoliStoppable("RatolíStoppable");

        // creamos los hilos
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        // los iniciamos
        t1.start();
        t2.start();
        t3.start();

        try {
            // esperamos 6 segundos
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // detenemos solo el EX3.RatoliStoppable
        r3.stopRunning();

        System.out.println("El RatolíStoppable ha estat aturat per main().");
    }
}
