import java.util.*;

public class ArrayListDemo 
{
  List<Double> list ;
  Random rnd ; 

  public ArrayListDemo() {
     this.list = new ArrayList<>();
     this.rnd = new Random() ;
  }

  public static void main(String[] args) 
  {
    int count = 1;
// set count to first argument from command line
    if (args.length != 0) {
      String arg = args[0];
      count = Integer.parseInt(arg);
    }
   System.out.println(String.format("Running test %1$s times.", count)); 
    for (int i = 0; i < count; i++) {
      ArrayListDemo ob = new ArrayListDemo() ;
      ob.test() ;
      }
  }

  public void test() 
  {
     Double n ;
     Long t1, t2 ;
     int size = 1<<27, last = size-1 ;

     t1 = System.currentTimeMillis();
     for ( int i=0 ; i<size; ++i ) {
        this.list.add(this.rnd.nextDouble()) ;
     }
     t2 = System.currentTimeMillis();
     System.out.println("Created List in " + (t2 - t1) + " milliseconds");

     t1 = System.currentTimeMillis();
     n = this.list.get(0) ;
     t2 = System.currentTimeMillis();
     System.out.println("First number is " + n + " found in " + (t2 - t1) + " milliseconds");

     t1 = System.currentTimeMillis();
     n = this.list.get(last) ;
     t2 = System.currentTimeMillis();
     System.out.println("Last number is " + n + " found in " + (t2 - t1) + " milliseconds");

     t1 = System.currentTimeMillis();
     this.list.remove(last) ;
     t2 = System.currentTimeMillis();
     System.out.println("Removed last number in " + (t2 - t1) + " milliseconds");

     t1 = System.currentTimeMillis();
     this.list.remove(1) ;
     t2 = System.currentTimeMillis();
     System.out.println("Removed index 1 in " + (t2 - t1) + " milliseconds");

     t1 = System.currentTimeMillis();
     this.list.add(0,0.0) ;
     t2 = System.currentTimeMillis();
     System.out.println("Added number at index 0 in " + (t2 - t1) + " milliseconds");

     t1 = System.currentTimeMillis();
     this.list.add(last,0.0) ;
     t2 = System.currentTimeMillis();
     System.out.println("Added number last in " + (t2 - t1) + " milliseconds");
  }
}

