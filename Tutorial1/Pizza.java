import java.util.Scanner;

class DeluxePizza extends Pizza {
      protected int noOfToppings;

      DeluxePizza(int total, int noOfToppings) {
            super(total, 200);
            this.noOfToppings = noOfToppings;
      }

      DeluxePizza() {
            this(0, 0);
      }

      void getToppings(int x) {
            this.noOfToppings = x;
      }

      int getPrice() {
            return (super.getPrice() + this.noOfToppings * 20 * this.total);
      }
}

class StandardPizza extends Pizza {

      StandardPizza(int total) {
            super(total, 100);
      }

      StandardPizza() {
            this(0);
      }

}

public class Pizza {
      protected int total;
      private int price;

      Pizza(int total, int price) {
            this.total = total;
            this.price = price;
      }

      Pizza() {
            this(0, 0);
      }

      void getPizza() {
            System.out.println("Enter your order: ");
            Scanner s = new Scanner(System.in);
            this.total = s.nextInt();
      }

      int getPrice() {
            return (this.total * price);
      }

      int getTotal() {
            return (this.total + this.total / 5);
      }

      public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            StandardPizza stdP = new StandardPizza();
            DeluxePizza dlxP = new DeluxePizza();

            int i = 0;
            while (i < 2) {
                  System.out.println("Order your Pizza \n1. Standard Pizza \n2. Deluxe Pizza \n3. Done");
                  int choice = s.nextInt();

                  switch (choice) {
                        case 1: {
                              stdP.getPizza();
                              // System.out.println(stdP.getTotal());
                              ++i;
                              break;
                        }
                        case 2:
                              dlxP.getPizza();
                              System.out.println(
                                          "Do you want to add extra toppings(only upto 3)? If yes specify or press 0 to ignore: ");
                              int x = s.nextInt();
                              dlxP.getToppings(x);
                              ++i;
                              break;

                        case 3:
                              i = 2;
                        default:
                              System.out.println("Invalid Input");
                              break;
                  }
            }

            System.out.println("\nTotal Pizzas: " + (stdP.getTotal() + dlxP.getTotal()));
            System.out.print("Total Price: " + (stdP.getPrice() + dlxP.getPrice()));
      }
}