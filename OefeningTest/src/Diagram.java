import java.awt.Color;
import java.awt.Graphics;


public class Diagram {
	
	private Meting[] aMetingen;
	private double max = 0;
	private double min = 0;
	private double snelheidsbeperking;
	private int[] aValues= new int[60];

	public Diagram() {

	}

	public void addMetingen( Meting[] aMetingen, double snelheidsbeperking){
		this.aMetingen=aMetingen;
		this.snelheidsbeperking=snelheidsbeperking;
	}
	
	public void teken(Graphics g, int x, int y) {
		double min = 0;
		double max = 0;
		int minIndex = 0;
		int maxIndex = 0;
		double sum = 0;
		double average = 0;

		for (int i = 0;i < aMetingen.length; i++) {
			sum += aMetingen[i].get_speed();
			// check if current minimal meting is lower than loops meting
			if(min == 0 || min > aMetingen[i].get_speed()) {
				min = aMetingen[i].get_speed();
				minIndex = i;
			}
			// check if current highest meting is higher than loops meting
			if(max < aMetingen[i].get_speed()) {
				max = aMetingen[i].get_speed();
				maxIndex = i;
			}
			average = sum / aMetingen.length;
		}

		///////////////////////

		// analyze
		for (Meting anMetingen : this.aMetingen) {
			int index = 29 + (int) (anMetingen.get_speed() - this.snelheidsbeperking);
			if (index > 59) {
				index = 59;
			}
			if (index < 0) {
				index = 0;
			}
			this.aValues[index]++;
		}
			
		// tekenen
		for (int i=0 ; i< this.aValues.length; i++) {
			
			g.setColor( Color.BLUE );
			if( i<29 ){
				g.setColor( Color.BLACK );
			}
			if( i>29 ){
				g.setColor( Color.RED );
			}
			
			g.fillRect( x+i*10, y-this.aValues[i]*10, 10, this.aValues[i]*10);
			g.drawString(String.format("%d", this.aValues[i]), x+i*10, y+10);
		}

		////////////////////////////

		// 1. Schrijf hier (GUI) kenteken met de maximale snelheid en de boete
		g.setColor(Color.BLACK);
		int myY = y + 50;
		g.drawString("Maximale snelheid: "+max+", Boete: "+aMetingen[maxIndex].get_boetes(this.snelheidsbeperking),x,myY);
		// 2. en de gemiddelde snelheid van alle overtredingen.


		// 3. de totale bedrag van alle boetes
		
	}
}
