public class RandomCountDisplay extends CountDisplay {
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        times *= Math.random();
        multiDisplay(times);
    }

}
