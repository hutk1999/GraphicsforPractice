class Grape extends Thread {
    Grape(String s){ super(s);} // constructor

    public void run() { System.out.println("thread " + this.getName() + " running"); }
}