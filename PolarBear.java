public class PolarBear extends Bear {
  
  public void gatherFood(){
    System.out.println("---");
    System.out.println("-> Gone fishing");
  }
  
  @Override
  public void wakeUp(){
    System.out.println("---");
    System.out.println("-> Sleeps in too cold out there");
  }


}