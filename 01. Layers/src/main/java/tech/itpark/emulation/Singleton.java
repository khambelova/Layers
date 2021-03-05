package tech.itpark.emulation;



public class Singleton {
    //eager
    private static final Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance()
    {
        return instance;
    }
}
