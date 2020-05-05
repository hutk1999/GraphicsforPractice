public class LocalData {

    public static void main(String args[]) {
	MyThread[]  mt = new MyThread[5];
       	for(int i=0; i<5; i++) 
                      mt[i] = new MyThread(i);
	for(int i=0; i<5; i++) 
                      mt[i].start();
    }
}

class MyThreadLocal extends ThreadLocal <Integer>{

      /*ThreadLocal<  >  in java.lang.* is generic and one can define any type or data-	          structure or container */

       private static int localId = 0;

      /* Here is the place where we define different initial values for the different thread           objects */

       protected synchronized Integer initialValue() {
        return localId++;  // auto-boxing at work for you.
    }

       public Integer get() {
        return super.get();
    }
}


class MyThread extends Thread {
    private static MyThreadLocal tls = new MyThreadLocal();
    int id;
    MyThread(int id) { this.id = id;}
    public void run() {
        System.out.println("My thread local value is " + tls.get());
        System.out.println("Using the parameter " + id);
    } 
}





