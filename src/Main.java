public class Main {
    public static void main(String[] args) {
        int items_qty = 0;

        Food[] breakfast = new Food[args.length];

        for(String arg: args){
            String[] parts = arg.split("/");
            switch (parts[0]) {
                case "Cheese" -> breakfast[items_qty] = new Cheese();
                case "Apple" -> breakfast[items_qty] = new Apple(parts[1]);
                case "Eggs" -> breakfast[items_qty] = new Eggs(Integer.parseInt(parts[1]));
                case "Tea" -> breakfast[items_qty] = new Tea(parts[1]);
            }
            items_qty++;
        }

        for(Food item: breakfast){
            if(item != null){
                item.consume();
            } else {
                break;
            }
        }

        System.out.println("\nПодсчёт продуктов:");
        printFoods(breakfast);

        System.out.println("\nВсего хорошего!");
    }

    public static Integer countFoods(Food[] breakfast, Food food) {
        Integer count = 0;
        for (Food value : breakfast) {
            if (food.equals(value)) {
                count++;
            }
        }
        return count;
    }

    public static void printFoods(Food[] breakfast){
        for (Food value : breakfast) {
            System.out.println(value + ": " + countFoods(breakfast, value));
        }
    }
}