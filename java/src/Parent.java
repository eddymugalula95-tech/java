public class Parent {
    final String university;
    String parentMessage;

    public Parent(String university) {
        this.university = university;
        this.parentMessage = "Hello from the parent class";
}
    public void displayMessages() {
        System.out.println("Welcome to " + university);
        System.out.println(parentMessage);
    }
}
