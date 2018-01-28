import java.util.Date;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Date date = new Date();                //以系统日前构造对象
				int year = date.getYear()+1900;        //表示当前日期
				int month = date.getMonth()+1;        //从0开始
				int weekday = date.getDay();
				int day = date.getDate();
				int hour = date.getHours();
				int minutes = date.getMinutes();
				System.out.println("现在是"+year+"年"+month+"月"+day+"日"+hour+"时"+minutes+"分");
	}

}
