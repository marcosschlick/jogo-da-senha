package game;

import java.awt.Color;
import java.util.Random;

public class Answer {
	Color color1 = setColor();
	Color color2 = setColor();
	Color color3 = setColor();
	Color color4 = setColor();

	Color[] colors = { color1, color2, color3, color4 };

	private static Color setColor() {
		Random random = new Random();

		int randomNumber = random.nextInt(6);

		switch (randomNumber) {

		case 0:
			return Color.red;

		case 1:
			return Color.blue;
		case 2:
			return Color.green;

		case 3:
			return Color.pink;

		case 4:
			return Color.yellow;

		default:
			return Color.orange;
		}

	}

	public Color getColor1() {
		return color1;
	}

	public Color getColor2() {
		return color2;
	}

	public Color getColor3() {
		return color3;
	}

	public Color getColor4() {
		return color4;
	}

}
