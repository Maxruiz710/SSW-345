//"I pledge my Honor that I have abided by the Stevens Honor System" - Max Ruiz

public class MyPizzaApp {
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: MyPizzaApp <franchise> <pizzaKind>");
            System.exit(1);
        }

        String franchise = args[0];
        String pizzaKind = args[1];
        
        PizzaStore pizzaStore;
        if (franchise.equals("NYPizzaStore")) {
            pizzaStore = new NYPizzaStore();
        } else if (franchise.equals("ChicagoPizzaStore")) {
            pizzaStore = new ChicagoPizzaStore();
        } else {
            System.out.println("Invalid franchise");
            return;
        }

        pizzaStore.orderPizza(pizzaKind);
    }
}
