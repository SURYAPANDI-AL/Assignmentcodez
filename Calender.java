
public class Calender {
	private String month[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	private int date[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	private String day="S	M	T	W	T	F	S";
	private int count =0;
	public void calender(int year) {
		count=startpos(year,count);
		leapyear(year,date);
		System.out.println("\t\t\t#YEAR:"+year+"#\n\n");
		for(int i=0;i<month.length;i++) {
			System.out.println("\t\t\t"+month[i]+"\n");
			System.out.println(day);
			if(count!=0) {
				for(int space=0;space<count;space++) {
					System.out.print(" 	");
				}
			}
			for(int j=1;j<=date[i];j++) {
				System.out.print(j+"	");
				count++;
				if(count==7) {
					System.out.println();
					count=0;
				}
			}
			System.out.println("\n\n");
		}
	}
	private int startpos(int year,int count) {
		if(year==1)
		return count =1;
		int refyear=1,leap=0,ttldays=0;
		int diff=year-refyear;
		while(refyear<year) {
			if(refyear%4==0||refyear%100==0&&refyear%400==0)
				leap++;
			refyear++;
		}
		ttldays=(diff-leap)*365+leap*366;
		count=ttldays%7;
		return count;
	}
	private void leapyear(int year,int[]date) {
		if(year%4==0||year%100==0&&year%400==0) {
			date[1]=29;
		}
	}

	public static void main(String[] args) {
		Calender call=new Calender();
		call.calender(2022);

	}

}
