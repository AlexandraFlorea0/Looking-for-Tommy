package PaooGame;

public final class Singleton {
    private static Singleton instance;
    // utilizam in PlayState, cand initializam eroul
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
