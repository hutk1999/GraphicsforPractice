public class EnumTest {


	public enum Day {
    		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    		THURSDAY, FRIDAY, SATURDAY 
	}

	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	

	public void tellItLikeItIs() {
	   switch (day) {
	      					
	      case FRIDAY: 
					     
	      case SATURDAY: System.out.println("Weekends are best."); break;
					
	      case SUNDAY: System.out.println("Sundays are bad.");
					     break;
					     
	      default:	System.out.println("Midweek days are so-so.");
					     break;
		}
	}
	
	public static void main(String[] args) {
		EnumTest fourthDay = new EnumTest(Day.WEDNESDAY);
		fourthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.FRIDAY);
		sixthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SATURDAY);
		seventhDay.tellItLikeItIs();
		EnumTest firstDay = new EnumTest(Day.SUNDAY);
		firstDay.tellItLikeItIs();	
	}
}

