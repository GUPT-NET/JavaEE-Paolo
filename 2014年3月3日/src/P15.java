import java.util.Date;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Date date = new Date();                //��ϵͳ��ǰ�������
				int year = date.getYear()+1900;        //��ʾ��ǰ����
				int month = date.getMonth()+1;        //��0��ʼ
				int weekday = date.getDay();
				int day = date.getDate();
				int hour = date.getHours();
				int minutes = date.getMinutes();
				System.out.println("������"+year+"��"+month+"��"+day+"��"+hour+"ʱ"+minutes+"��");
	}

}
