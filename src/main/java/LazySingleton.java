public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    private static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

    public void print() {
        System.out.println("This is Lazy Singleton print method");
    }
}
