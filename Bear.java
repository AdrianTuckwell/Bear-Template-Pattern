public abstract class Bear {

  public abstract void gatherFood();

  public void typicalDay(){
    wakeUp();
    gatherFood();
    eat();
    sleep();
  }

  public void wakeUp(){
    System.out.println("waking up");
  }

  public void eat(){
    System.out.println("eating");
  }

  public void sleep(){
    System.out.println("Going to sleep");
  }

  public void roar(){
    System.out.println("roar!");
  }
  





}