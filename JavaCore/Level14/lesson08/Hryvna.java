public class Hryvna extends Money{
    public Hryvna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
