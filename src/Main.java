public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weit = 98;
        float height = 187;
        int bmi = service.calculate(weit, height);

        if (bmi < 16) {
            System.out.println("индекс массы тела " + bmi + ", выраженный дефицит массы тела");
        }
        else if (bmi < 18.5) {
            System.out.println("индекс массы тела " + bmi + ", дефицит массы тела");
        }
        else if (bmi < 25) {
            System.out.println("индекс массы тела " + bmi + ", норма");
        }
        else {
            System.out.println("индекс массы тела " + bmi + ", избыточная масса тела");
        }

    }
}
