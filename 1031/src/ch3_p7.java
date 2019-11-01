public class ch3_p7 {
	static String[] num = {"one", "two", "three", "four", "five"};
	
	public static void main(String[] args) {
		for(int i = 1; i <= 99999; i++ ) {
			String x = Integer.toString(i);
			int numtoclap = 0;
			for(int j = 0; j < x.length(); j++) {
				char y = x.charAt(j);
				if(y == '3' || y == '6' || y == '9') numtoclap++;
			}
			
			if (numtoclap > 0) System.out.println(i + "clap" + num[numtoclap - 1]);
		}
	}
}
