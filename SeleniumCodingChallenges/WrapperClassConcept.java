package Day1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
		String x ="100";
		System.out.println(x+20);
		
		//data conversion String to int
		int i =Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer,Double,Character,Boolean
		
		String y ="12.5";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		
		String k ="true";
		boolean b =Boolean.parseBoolean(k);
		System.out.println(b);
		
		//integer to strig
		
		int j  =200;
		System.out.println(j+200);
		String s = String.valueOf(j);//200
		System.out.println(s+200);
		
		
		
		
		
		

	}

}
