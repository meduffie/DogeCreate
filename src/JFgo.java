//DogeCode 0.1 ~ Austin Duffie 2014 
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class JFgo{
	public static void main(String[] args) {
		Image Doge2 = null;
		try {
            URL dogeKYM = new URL("http://i2.kym-cdn.com/photos/images/original/000/581/296/c09.jpg");
            Doge2 = ImageIO.read(dogeKYM);
        } catch (IOException veryExcept) {
        	veryExcept.printStackTrace();
        }
		JFrame manyWindow = new JFrame();
        manyWindow.setSize(900, 900);
        manyWindow.setTitle("DogeCreate 0.1!");
        manyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        manyWindow.setVisible(true);
        painting veryConstruct = new painting();
        manyWindow.setIconImage(Doge2);
        manyWindow.add(veryConstruct);
        
        }
	}
