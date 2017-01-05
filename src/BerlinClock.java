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
