public class Cat {

  private String name;
  private int appetite;
  private boolean full;

  public Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
    this.full = false;
  }

  public void eat(Plate plate) {
    if (plate.decreaseFood(appetite)) {
      full = true;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAppetite() {
    return appetite;
  }

  public void setAppetite(int appetite) {
    this.appetite = appetite;
  }

  public boolean isFull() {
    return full;
  }

  public void setFull(boolean full) {
    this.full = full;
  }

}