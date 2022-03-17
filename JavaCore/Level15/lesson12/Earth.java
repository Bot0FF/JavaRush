public class Earth implements Planet {
    private static Earth earth;

    public static synchronized Earth getInstance() {
        if(earth == null) {
            earth = new Earth();
        }
        return earth;
    }
}
