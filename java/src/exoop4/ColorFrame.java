package exoop4;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {
	   
	   JFrame jFrame;
	   JPanel jPanel;
	   JPanel jBtnPanel;
	   JButton redButton;
	   JButton blueButton;
	   JButton orangeButton;
	   
	   public ColorFrame() {
	      init();
	   }
	   
	   void init() {
	      jFrame = new JFrame("배경색 변경 프로그램");
	      jFrame.setLayout(new BorderLayout());
	      jFrame.setBounds(100, 100, 400, 400);
	      
	      jPanel = new JPanel();
	      jPanel.setLayout(new BorderLayout());
	      
	      jBtnPanel = new JPanel();
	      
	      redButton = new JButton("RED");
	      blueButton = new JButton("BLUE");
	      orangeButton = new JButton("ORANGE");
	      
	     
	      addListener(redButton, jPanel, Color.red);
	      addListener(blueButton, jPanel, Color.blue);
	      addListener(orangeButton, jPanel, Color.orange);
	      
//	      redButton.addActionListener(new ActionListener() {
//	    	// 익명클래스
//	    	  public void actionPerformed(ActionEvent e) {
//	    		  jPanel.setBackground(Color.RED);
//	    	  }
//	   });
//	      
//	      blueButton.addActionListener(new ActionListener() {
//	    	  // 익명클래스
//	    	  public void actionPerformed(ActionEvent e) {
//	    		  jPanel.setBackground(Color.BLUE);
//	    	  }
//		   });
	    
	      
	      jBtnPanel.add(redButton);
	      jBtnPanel.add(blueButton);
	      jBtnPanel.add(orangeButton);
	      jPanel.add(jBtnPanel, BorderLayout.SOUTH);
	      jFrame.add(jPanel, BorderLayout.CENTER);
	      
	      jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      jFrame.setVisible(true);
	   }
	   
	   
	   
	   public static void addListener(JButton jButton, JPanel jPanel, Color color) {
		    jButton.addActionListener(new ActionListener() {
		    	  // 익명클래스
		    	  public void actionPerformed(ActionEvent e) {
		    		  jPanel.setBackground(color);
		    
		    		  
		    	  }
		    });
	   }
	   
	   
	   public static void main(String[] args) {
	      new ColorFrame();
	   }

	   
	   
	} // class
