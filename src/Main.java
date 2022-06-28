public class Main {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("Hello"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Good"));
        CountDisplay countDisplay1 = new CountDisplay(new StringDisplayImpl("Bad"));
        display.display();
        countDisplay.display();
        countDisplay1.display();
        countDisplay.multiDisplay(3);
    }
}
