public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyWeight = 54;
        double bodyGrowth = 1.73;
        double bodyMassIndex = service.calculate(bodyWeight, bodyGrowth);
        System.out.printf("Индекс массы тела равен %.2f %n", bodyMassIndex);
    }
}
