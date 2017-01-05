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
		int lampQuantity = 4;
		
		return getLampsString(litLamps, lampQuantity, "R");
	}
	
	protected String ConvertBottomHours(int hours){

		int litLamps = hours % 10;
		int lampQuantity = 4;
		
		return getLampsString(litLamps, lampQuantity, "R");
	}

	private String getLampsString(int litLamps, int lampQuantity, String lampColor){
		
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
