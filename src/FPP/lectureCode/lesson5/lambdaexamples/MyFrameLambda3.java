package FPP.lectureCode.lesson5.lambdaexamples;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This version is the same as MyFrameLambda2
 * but the button listener has been implemented
 * using a named lambda expression
 *
 */
public class MyFrameLambda3 extends JFrame {
	
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel textPanel;
	private JTextField text;
	private JLabel label;
	private JButton button;
	public MyFrameLambda3() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		getContentPane().add(mainPanel);
	}
	private void defineTopPanel() {
		topPanel = new JPanel();
		defineTextPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		topPanel.add(textPanel);
		
	}
	private ActionListener butnListener 
	   = evt -> System.out.println(text.getText());
	   
	private void defineMiddlePanel(){
		middlePanel=new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		button = new JButton("My Button");
		button.addActionListener(butnListener);
		middlePanel.add(button);
		
	}
	private void defineTextPanel() {
		
		JPanel topText = new JPanel();
		JPanel bottomText = new JPanel();
		topText.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		bottomText.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));		
		
		text = new JTextField(10);
		label = new JLabel("My Text");
		label.setFont(makeSmallFont(label.getFont()));
		topText.add(text);
		bottomText.add(label);
		
		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(topText,BorderLayout.NORTH);
		textPanel.add(bottomText,BorderLayout.CENTER);
	}
	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");	
		centerFrameOnDesktop(this);
		setSize(320,160); 
		setResizable(false);
	}
	public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize()-2));
    }

	
	public static void centerFrameOnDesktop(Component f) {
	        final int SHIFT_AMOUNT = 0;
	        Toolkit toolkit = Toolkit.getDefaultToolkit();
	        int height = toolkit.getScreenSize().height;
	        int width  = toolkit.getScreenSize().width;
	        int frameHeight = f.getSize().height;
	        int frameWidth  = f.getSize().width;
	        f.setLocation(((width-frameWidth)/2)-SHIFT_AMOUNT, (height-frameHeight)/3);    
	    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				MyFrameLambda3 mf = new MyFrameLambda3();
				mf.setVisible(true);
			}
		});
	}
	
	private static final long serialVersionUID = 3618976789175941431L;
}
	