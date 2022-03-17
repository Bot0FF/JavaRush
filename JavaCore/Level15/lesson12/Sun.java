public class Sun implements Planet {
    private static Sun sun;

    public static synchronized Sun getInstance() {
        if(sun == null) {
            sun = new Sun();
        }
        return sun;
    }
}
