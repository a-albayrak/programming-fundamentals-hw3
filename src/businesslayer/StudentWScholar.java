package businesslayer;

public class StudentWScholar extends Student{

    @Override
    public double discountPercentage() {
        return (double) 30 /100;
    }
}