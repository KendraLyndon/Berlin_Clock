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
		
		int mod = hours % 10;
		if (mod == 4){
			bottomHours = "RRRR";
		} else if (mod == 3){
			bottomHours = "RRRO";
		} else if (mod == 2){
			bottomHours = "RROO";
		} else if (mod == 1){
			bottomHours = "ROOO";
		} else if (mod == 0){
			bottomHours = "OOOO";
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
