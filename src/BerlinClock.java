import java.util.Arrays;

public class BerlinClock {
	
	public String[] ConvertToBerlin(String time){
		
		String[] timeArray = time.split(":");
		
		String row0 = ConvertSeconds(Integer.parseInt(timeArray[2]));
		String row1 = ConvertTopHours(Integer.parseInt(timeArray[0]));
		String row2 = ConvertBottomHours(Integer.parseInt(timeArray[0]));
		String row3 = ConvertTopMinutes(Integer.parseInt(timeArray[1]));
		String row4 = ConvertBottomMinutes(Integer.parseInt(timeArray[1]));
		
		String[] clock = { row0, row1, row2, row3, row4 };
		return clock;
	}
	
	protected String ConvertSeconds(int seconds){
		if(seconds % 2 == 0){
			return "Y";
		} else {
			return "O";
		}
	}
	
	protected String ConvertTopHours(int hours){

		int litLamps = hours/5;
		
		return GetLampsString(litLamps, 4, "R");
	}
	
	protected String ConvertBottomHours(int hours){

		int litLamps = 0;
		
		if(hours%10 > 5){
			litLamps = (hours % 10)/2;
		} else {
			litLamps = hours % 10;
		}
		
		return GetLampsString(litLamps, 4, "R");
	}
	
	protected String ConvertTopMinutes(int minutes){
		
		int litLamps = minutes / 5;
		
		return GetLampsString(litLamps, 11, "Y");
	}

	protected String ConvertBottomMinutes(int minutes){
		
		int litLamps =  minutes%5;
		
		return GetLampsString(litLamps, 4, "Y");
	}
	
	private String GetLampsString(int litLamps, int lampQuantity, String lampColor){
		
		String output = "";
		
		for(int i=0; i<litLamps; i++){
			output += lampColor;
		}
		
		for(int i=output.length(); i<lampQuantity; i++){
			output += "O";
		}
		
		return output;
	}
}
