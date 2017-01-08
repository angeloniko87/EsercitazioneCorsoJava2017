package natale.progetti.biblioteca;

public class Data{

	private int d, m, y;

	public Data(){
		d = 0;
		m = 0;
		y = 0;
	}

	public int getDay(){
		return d;
	}

	public int getMonth(){
		return m;
	}

	public int getYear(){
		return y;
	}

	public void setDay(int aDay){
		y = aDay;
	}

	public void setMonth(int aMonth){
		y = aMonth;
	}

	public void setYear(int anYear){
		y = anYear;
	}

	public void nextDay(){
		if (d < 30) d++;
		else if (m < 12){
			d = 1;
			m++;
			}else{
				d = 1;
				m = 1;
				y++;
			}

	}

	public boolean isEqual(Data date){
		if(date.getDay() == d && date.getMonth() == m && date.getYear() == y)
			return true;
		else
			return false;
	}

	public String stampa(){
		return d+"/"+m+"/"+y;
	}

}