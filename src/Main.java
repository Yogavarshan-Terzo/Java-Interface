public class Main {
    public static void main(String[] args) {
       greet(new MessagePrinter());
    }
    public static void greet(Printable printer){
        printer.Print("Welcome");
    }
}