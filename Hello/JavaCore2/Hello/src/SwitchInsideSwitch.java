
public class SwitchInsideSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=2;
		String dayString;
		String dayType;
	switch (day) {
	case 1:
		dayString = "sunday";
		break;
	case 2:
		dayString ="monday";
		break;
	case 3:
		dayString ="tuesday";
		break;
	case 4:
		dayString ="wedday";
		break;

	default:
		dayString="invalid day";
		break;
	}
    switch(day) {
    case 1:
    case 2:
    case 3:
    	dayType="weekend";
    	break;
    	default:
    	dayType="invalid day";
    }
    	System.out.println(dayString +"is a" +dayType);
    	
 }
	}


