public class MainClass {

  public static void main(String[] args) {
    
    Cat[] cats = {
      new Cat("Барсик", 5),
      new Cat("Мурзик", 7),
      new Cat("Том", 10)
    };

    Plate plate = new Plate(25);

    for (Cat cat : cats) {
      cat.eat(plate);
    }

    for (Cat cat : cats) {
      System.out.println(cat.getName() + " is " + (cat.isFull() ? "full" : "hungry"));
    }

    plate.addFood(15);
    plate.info();

  }

}