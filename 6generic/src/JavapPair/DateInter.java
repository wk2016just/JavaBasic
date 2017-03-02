package JavapPair;

import java.util.Date;

class DateInter extends Pair<Date> {
	public void setValue(Date value) {
		super.setValue(value);
	}
	
	public Date getValue() {
		return (Date) super.getValue();
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		DateInter dateInter=new DateInter();
		dateInter.setValue(new Date());                
        dateInter.setValue(new Object());//±‡“Î¥ÌŒÛ
    }
}