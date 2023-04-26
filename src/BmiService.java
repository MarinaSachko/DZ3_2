public class BmiService {
    public int calculate(float w, float h) {
        float a = w/((h/100)*(h/100));
        int b = (int) a;
        return b;
    }

}
