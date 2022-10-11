public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();
        double weight = 67;
        double height = 1.66;
        int imt = index.calculate(67, 1.66);
        System.out.println(imt);
    }
}