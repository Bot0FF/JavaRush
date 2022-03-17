public class Moon implements Planet {
    private static Moon moon;

    public static synchronized Moon getInstance() {
        if(moon == null) {
            moon = new Moon();
        }
        return moon;
    }
}
