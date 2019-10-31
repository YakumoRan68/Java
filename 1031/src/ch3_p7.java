public class ch3_p7 {
	static String[] num = {"한", "두", "세", "네", "다섯"};
	
	public static void main(String[] args) {
		for(int i = 1; i <= 999; i++ ) {
			String x = Integer.toString(i);
			int numtoclap = 0;
			for(int j = 0; j <= x.length(); j++) {
				char y = x.charAt(j);
				if(y == '3' || y == '6' || y == '9') numtoclap++;
			}
			
			if (numtoclap > 0) System.out.println(i + "박수" + num[numtoclap - 1] + "번");
		}
	}
}
