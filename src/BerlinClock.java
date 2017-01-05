import java.util.Arrays;

public class BerlinClock {
//	public String[] convertToBerlin(String time){
//		return null;
//	}
	
	protected String ConvertSeconds(int seconds){
		if(seconds % 2 == 0){
			return "Y";
		} else {
			return "O";
		}
	}
	
	protected String ConvertTopHours(int hours){
		String topHours = "";
		int litLamps = hours/5;
		
		for(int i=0; i<litLamps; i++){
			topHours += "R";
		}
		
		for(int i=topHours.length(); i<4; i++){
			topHours += "O";
		}
		
		return topHours;
	}
	
	protected String ConvertBottomHours(int hours){
		String bottomHours = "";
		int litLamps = hours % 10;
		
		for(int i=0; i<litLamps; i++){
			bottomHours += "R";
		}
		
		for(int i=bottomHours.length(); i<4; i++){
			bottomHours += "O";
		}
		
		return bottomHours;
	}
//	
//	protected String ConvertTopMinutes(int minutes){
//		String topMinutes = "";
//		
//		if(minutes )
//		
//		return topMinutes;
//	}
}
