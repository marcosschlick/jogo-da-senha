package game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Screen {

	public void execute() {

		JLabel label = new JLabel();
		label.setSize(600, 100);
		label.setText("Jogo da senha ");
		label.setLocation(0, 0);
		label.setFont(new Font("", Font.BOLD, 30));
		label.setHorizontalAlignment(0);

		JFrame screen = new JFrame();
		screen.setLayout(null);
		screen.setSize(640, 750);
		screen.setBackground(Color.WHITE);
		screen.setLocationRelativeTo(null);
		screen.setDefaultCloseOperation(3);
		screen.setFocusable(true);

		ColorButtonLine[] colorsLine = { new ColorButtonLine(180, 100, screen), new ColorButtonLine(180, 160, screen),
				new ColorButtonLine(180, 220, screen), new ColorButtonLine(180, 280, screen),
				new ColorButtonLine(180, 340, screen), new ColorButtonLine(180, 400, screen),
				new ColorButtonLine(180, 460, screen), new ColorButtonLine(180, 520, screen) };

		ColorButton[] colorsButton = { new ColorButton(50, 600), new ColorButton(125, 600), new ColorButton(200, 600),
				new ColorButton(275, 600) };

		VerifyButton verifyButton = new VerifyButton(colorsButton, colorsLine);
		verifyButton.setLocation(360, 600);

		for (ColorButton c : colorsButton) {
			screen.add(c);
		}

		screen.add(verifyButton);

		screen.add(label);

		screen.setVisible(true);
	}
}
