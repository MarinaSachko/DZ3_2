public class BmiService {
    public int calculate(float weight, float height) {
        float index = weight / ((height / 100) * (height / 100));
        int rezult = (int) index;
        return rezult;
    }
}
