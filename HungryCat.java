public class HungryCat extends Cat {

  public HungryCat(String name, int appetite) {
    super(name, appetite);
  }

  public void meow() {
    System.out.println(getName() + " meows from hunger!");
  }

  @Override
  public void eat(Plate plate) {
    super.eat(plate);
    if (!isFull()) {
      meow();
    }
  }

}