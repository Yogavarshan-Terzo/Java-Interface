public class Main {
    public static void main(String[] args) {
       greet(System.out::println);
    }
    public static void greet(Printable printer){
        printer.Print("Welcome");
    }
}