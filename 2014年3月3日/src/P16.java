import java.text.SimpleDateFormat;
import java.util.Date;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
			Date date= new Date();
			System.out.println(format1.format(date));
			System.out.println(date.toString());
	} 

}
