class Coffee extends Thread {
   public void run() {
         for(int i=0; i<10; i++) {
             System.out.println("I like coffee");
             yield();  // did you forget this?
         }
   }
}