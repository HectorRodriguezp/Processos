package EX4;

import java.util.ArrayList;

public class RatoliPare extends Ratoli {
        private ArrayList<Thread> fills = new ArrayList<>();

    public RatoliPare(String nom) {
        super(nom);
    }

    public void afegir(Thread t){
            fills.add(t);
    }

    @Override
    public void run() {
        for (Thread fill : fills){
            fill.join();


        }
    }
}
