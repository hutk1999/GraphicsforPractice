public class Cat extends Animal {
    public static void testClassMethod() {		// hide
        System.out.println("The class method in Cat.");
    }
    public void testInstanceMethod() {			// override
        System.out.println("The instance method in Cat.");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myAnimal.testClassMethod();	// call from super-class
        myAnimal.testInstanceMethod();  // call from super-class
	myCat.testClassMethod();	// call from sub-class
	myCat.testInstanceMethod();	// call from sub-class
    }
}
