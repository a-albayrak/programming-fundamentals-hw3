package businesslayer;

public class StudentWOScholar extends Student{

    @Override
    public double discountPercentage() {
        return (double) 20 /100;
    }
}