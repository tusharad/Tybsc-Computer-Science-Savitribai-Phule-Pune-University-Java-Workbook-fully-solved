/**
 * @author : tushar
 * @created : 2021-05-18
**/
class A11A1 implements Runnable{
    @Override
    public void run(){
    }
  public static void main(String args[]) {
    Thread t1 = new Thread();
    t1.start();
    try{
      t1.sleep(100);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    t1.setPriority(1);
    int groupPriority = t1.getPriority();
    System.out.println(groupPriority);
    System.out.println("Running");
  }
}
