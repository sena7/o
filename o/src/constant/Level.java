package constant;

import java.util.ArrayList;

public enum Level {
	PRIMITIVE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), SIXTH(6), SEVENTH(7), EIGHTH(8), NINETH(9), TENTH(
			10);

	public final int sequence;

	Level(int sequence) {
		this.sequence = sequence;
	}

	public static final ArrayList<String> getLevelNameList(){
		ArrayList<String> l = new ArrayList<String>();
		int length = Level.values().length;
		for(int i = 0; i< length; i++){
		l.add(Level.values()[i].toString());
		}
		return l;
		
	}

}
