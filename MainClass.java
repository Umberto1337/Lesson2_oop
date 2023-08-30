public class MainClass {

  public static void main(String[] args) {

    Cat[] cats = {
      new Cat("Барсик", 5),  
      new Cat("Мурка", 20),
      new Cat("Том", 10)
    };

    Plate plate = new Plate(15);

    for (Cat cat : cats) {
      cat.eat(plate);
      checkSatiety(cat); 
    }

    System.out.println("Full cats:");
    for (Cat cat : cats) {
      if (cat.isFull()) {
        System.out.println(cat.getName());  
      }
    }

    plate.addFood(15);
    plate.info();

  }

  public static void checkSatiety(Cat cat) {

    if (!cat.isFull()) {
    
      HungryCat hungryCat = new HungryCat(cat.getName(), cat.getAppetite());
      hungryCat.setFull(cat.isFull());  
      cat = hungryCat;

      hungryCat.meow();

    }

  }

}