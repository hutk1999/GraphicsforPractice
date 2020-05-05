public class Drinks {
   public static void main(String[] a) {
      Coffee t1 = new Coffee();
      t1.start();
      new Tea().start();  // an anonymous thread
   }
}