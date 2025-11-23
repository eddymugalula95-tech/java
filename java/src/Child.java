public class Child extends Parent {
    String childMessage;

    public Child(String university) {
        super(university); // Calls Parent constructor
        this.childMessage = "Hello from the child class";
    }

    @Override
    public void displayMessages() {
        super.displayMessages(); // Calls Parent method
        System.out.println(childMessage);
    }
}
