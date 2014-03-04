

/*
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Bargraph extends JComponent {
	
	private int women;
	private int men;
	private float total;


	public Bargraph() {
		
		this.women = 0;
		this.men = 0;
		this.total = 0;
		
	}
	
	public Bargraph(int women, int men){
		super();
		this.men = men;
		this.women = women;
	}
		
	public void updateValues(int women, int men) {		
		this.women = women;
		this.men = men;
		this.total = this.women + this.men;
		
		System.out.println("nan skit");
		
		this.invalidate();
		this.repaint();
	}	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		int height = getHeight();
		int width = getWidth();
		
		if(this.women > 0) {
			
			float percent = (women / total);
			float pixelValue = height * percent;
			
			int posX = (width / 2) - (width / 6);
			int posY = (int) (height - pixelValue);
			
			g.setColor(Color.BLUE);
			g.fillRect(posX, posY, width / 4, (int) pixelValue); 
		} else {
			System.out.println("women = 0");
		}

if(this.men > 0) {
			
			float percent = men / total;
			float pixelValue = height * percent;
			
			int posX = (width / 2) - (width / 2);
			int posY = (int) (height - pixelValue);
			
			g.setColor(Color.RED);
			g.fillRect(posX, posY, width / 4, (int) pixelValue);
			
		} else {
			System.out.println("men = 0");
		
		}

		g.setColor(Color.DARK_GRAY);
		g.drawLine(0, 0, width, 0);
		g.drawString("Totalt " + total + " sokande.", 245, 15);	
	}
}




*/
 
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
 

public class Bargraph extends JComponent{
	private int women;
	private int men;
	private float total;
	private float percentWomen;
	private float percentMen;
	
	 public Bargraph() {
		  percentWomen 	= 0;
		  percentMen 	= 0;
		 }
	 
	public void updateValues(int women, int men){
		this.women = women;
		this.men = men;
		this.total = women + men;

	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		this.percentWomen = women/total;
		this.percentMen = men/total;
		
		int h = getHeight();
		float menPixelH = h*percentMen;
		float womenPixelH = h*percentWomen;
		int posYm = (int)(h-(percentMen*100));
		int posYw = (int)(h-(percentWomen*100));
		super.paintComponent(g);

//		g.fillRect(0, 50, 50,50);
		g.setColor(Color.red);
		g.fillRect (0, posYw, 100, (int)womenPixelH);
		g.setColor(Color.blue);
		g.fillRect (100, posYm, 100, (int)menPixelH);
		
		//System.out.println("Amounts: " + women + " - " +men);
		//System.out.println("Percentages: "+  Math.round(-percentWomen*getHeight()) + " - " + Math.round(-percentMen*getHeight()));
		repaint();
	}
}
