package windows;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.beans.Transient;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Test extends JPanel {

	private static final long serialVersionUID = 1L;



	public Test() {
		add(new General());
		setVisible(true);
	}

	private class General extends JPanel {

		private static final long serialVersionUID = 1L;

		public General() {
			setLayout(new BorderLayout());
			Center c = new Center();
			add(c);

			// add(new Top(), BorderLayout.NORTH);
			c.add(new JScrollBar(), BorderLayout.CENTER);
			// add(new Bottom(), BorderLayout.SOUTH);
		}

	}

	private class Center extends JPanel {

		private static final long serialVersionUID = 1L;

		public Center() {
			// setLayout(new WrapLayout());
			setBackground(Color.BLACK);
			addArticles(10);

		}

		private void addArticles(int number) {
			for (int i = 0; i < number; i++) {
				add(getTemplateArticle("#" + i));
			}
		}

		private Button getTemplateArticle(String text) {
			Button button = new Button(text);
			button.setBackground(new Color(249, 194, 4));
			button.setPreferredSize(new Dimension(200, 200));
			return button;
		}

	}

//	private class Bottom extends JPanel {
//
//		private static final long serialVersionUID = 1L;
//
//		public Bottom() {
//			setBackground(Color.BLUE);
//		}
//
//		@Override
//		@Transient
//		public Dimension getPreferredSize() {
//			return new Dimension(super.getPreferredSize().width, 20);
//		}
//
//	}

//HILO:

}
