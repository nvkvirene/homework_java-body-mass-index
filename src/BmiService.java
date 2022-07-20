public class BmiService {
    public double calculate(int bodyWeight, double bodyGrowth) {
        double imb = bodyWeight / (bodyGrowth * 2);
        return imb;
    }
}
