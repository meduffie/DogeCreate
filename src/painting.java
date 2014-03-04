//DogeCode 0.1 ~ Austin Duffie 2014
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
public class painting extends JComponent{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g){
			dogeCode n = new dogeCode();
			Graphics2D g2 = (Graphics2D) g;
			Image Doge = null;
			try {
	            URL dogeKYM = new URL("http://i2.kym-cdn.com/photos/images/original/000/581/296/c09.jpg");
	            Doge = ImageIO.read(dogeKYM);
	        } catch (IOException veryExcept) {
	        	veryExcept.printStackTrace();
	        }
			ImageObserver paintingChild = null;
			g2.drawImage(Doge, 0, 0, 900, 900, getBackground(), paintingChild);
			super.paintComponent(g2);
			super.paintComponent(g);
			Random wow = new Random();
			int wowX = wow.nextInt(800);
			int wowY = wow.nextInt(890);
			int wowX1 = wow.nextInt(800);
			int wowY1 = wow.nextInt(890);
			int wowX2 = wow.nextInt(800);
			int wowY2 = wow.nextInt(890);
			int wowX3 = wow.nextInt(800);
			int wowY3 = wow.nextInt(890);
			int wowX4 = wow.nextInt(800);
			int wowY4 = wow.nextInt(890);
			g2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			g2.setColor(Color.blue);
			g2.drawString(n.in1,wowX, wowY);
			g2.setColor(Color.red);
			g2.drawString(n.in2,wowX1,wowY1);
			g2.setColor(Color.orange);
			g2.drawString(n.in3,wowX2,wowY2);
			g2.setColor(Color.magenta);
			g2.drawString(n.in4,wowX3,wowY3);
			g2.setColor(Color.cyan);
			g2.drawString(n.in5,wowX4,wowY4);
		}
}
