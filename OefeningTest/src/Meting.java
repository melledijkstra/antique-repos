import java.util.Date;

public class Meting {
	
	private double speed;
	private String numberplate;
	// private Date datum;
	
	public Meting( String numberplate, double speed ){
		this.speed=speed;
		this.numberplate=numberplate;
	}
	
	public double get_speed(){
		return this.speed;
	}
	
	public String get_numberplate(){
		return this.numberplate;
		
	}
	
	public double get_boetes( double maxspeed ){
		
		// 4. implement boetes
		// Km/u	 1	 2	 3	 4	 5	 6	 7	 8	 9	10	11	12	13	14	15
		// Euro	11	15	19	23	30	36	41	47	53	61	83	90	96	104	113
		// Km/u	16	17	18	19	20	21	22	23	24	25	26	27	28	29	30
		// Euro	123	132	141	152	163	175	184	195	207	217	228	239	250	262	273
		
		if ( this.speed-maxspeed>0 ){ return 1;}
		else {return 0;}
	}
}
