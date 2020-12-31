
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		Dog  dog = new Dog();
		
		if (cat instanceof Animal)
		{
			System.out.println("Cat is an animal");
		}

	}

}
