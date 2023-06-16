public class Main {
    public static void main(String[] args) {
       greet(message -> System.out.println(message));
    }
    public static void greet(Printable printer){
        printer.Print("Welcome");
    }
}