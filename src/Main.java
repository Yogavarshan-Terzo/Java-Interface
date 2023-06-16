public class Main {
    public static void main(String[] args) {
       greet(new Printable() {
           @Override
           public void Print(String message) {
               System.out.println(message);
           }
       });
    }
    public static void greet(Printable printer){
        printer.Print("Welcome");
    }
}