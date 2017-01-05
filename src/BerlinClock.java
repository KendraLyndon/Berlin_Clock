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
		if(hours >= 20){
			topHours = "RRRR";
		} else if(hours >= 15){
			topHours = "RRRO";
		} else if(hours >= 10){
			topHours = "RROO";
		} else if(hours >= 5){
			topHours = "ROOO";
		} else {
			topHours = "OOOO";
		}
		return topHours;
	}
	
	protected String ConvertBottomHours(int hours){
		String bottomHours = "";
		int mod = hours % 10;
		if(mod == 4){
			bottomHours = "RRRR";
		} else if(mod == 3){
			bottomHours = "RRRO";
		} else if(mod == 2){
			bottomHours = "RROO";
		} else if(mod == 1){
			bottomHours = "ROOO";
		} else if(mod == 0){
			bottomHours = "OOOO";
		}
		return bottomHours;
	}
	
}
