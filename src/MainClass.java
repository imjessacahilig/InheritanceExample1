import java.util.*;

public class MainClass {

    public static void main(String[] args) {


    }

    private static void mapExample(){
        // key-value pair
        Map<String, Float> employees = new HashMap<>();
        employees.put("John Dool", 3000.0f);
        employees.put("Chao Di", 4500.0f);
        employees.put("Prasad D", 1000.0f);

        employees.remove("John Dool");

        System.out.println(employees.get("Chao Di"));


        for (String key : employees.keySet()) {
            System.out.println("Employee: " + key);
        }

        for (Float value : employees.values()) {
            System.out.println("Payment: " + value);
        }

        for (Map.Entry<String, Float> pair : employees.entrySet()) {
            System.out.println("Employee-payment " + pair);
        }
    }

    private static void setExample() {
        // unique collection
        Set<String> names = new HashSet();

        names.add("John");
        names.add("Neeki");
        names.add("Mark");
        names.add("John");

        if (names.contains("John")) {
            System.out.println("Element exists");
        }

        System.out.println("size: " + names.size());
        for (String item : names) {
            System.out.println(item);
        }
    }

    private static void listExample() {
        // lists  are ordered collection
        List<Float> transfers = new ArrayList<>();
        Queue<String> test = new LinkedList();
        transfers.add(120.0f);
        transfers.add(400.0f);
        transfers.add(5000.0f);

        for (Float transfer : transfers) {
            System.out.println("tranfer:" + transfer);
        }
    }

    private static void queueExample() {
        // FIFO, LIFO
        Queue<String> pokemons = new LinkedList();
        pokemons.offer("Pikachu");
        pokemons.offer("Charmander");

        for (String pokemon : pokemons) {
            System.out.println(pokemon);

        }
    }
}
