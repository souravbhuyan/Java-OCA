class Prog1 {
	private void blastoff() {
		System.out.print("bang");
	}
}

public class Shuttle extends Prog1 {
	public static void main(String[] args) {
		new Shuttle().go();
	}

	void go() {
		blastoff();
		// Rocket.blastoff();//line A
	}

	private void blastoff() {
		System.out.print("sh-bang ");
	}
}