package Chapter6.Example6_4;

class B implements CompurerAverage {
    public double average(double a, double b) {
        double aver = 0;
        aver = Math.sqrt(a * b);
        return aver;
    }
}
