package HelloWorld;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println(height);
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " metres in direction " + direction);
	}
}


public class MethodsParameters {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi, I am Sam!");
		sam.jump(7);
		sam.move("West", 12.2);

		String greeting = "Hello there.";
		sam.speak(greeting);

	}

}

