	package Day2;

	enum Animals{
		DOG("woof"),CAT("MEOW"),FISH("burble");
		String sound;
		Animals(String s) { sound=s;}
	}
	public class P12 {
		static Animals a;
		public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " +a.FISH.sound);
	}
	}