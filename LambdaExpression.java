package NewPackege;

interface Drawable {
	public void draw();
}

public class LambdaExpression {

	public static void main(String[] args) {

		int width = 10;

		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();

		int width1 = 11;

		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing  using lambda :" + width1);
		};
		d2.draw();

	}
}