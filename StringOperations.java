public class StringOperations {
	public static void main(String[] args) {
		String s="hi bye";
		System.out.println(s.length());
		System.out.println(s);				
		System.out.println(s.trim());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String str1="ABCE";
		String str2="Hi@Hello@Bye";
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("----------------");
		System.out.println(str1.startsWith("a"));
		System.out.println(str2.endsWith("i"));
		System.out.println(str2.substring(2, 6));
		
		System.out.println("----------------");
		System.out.println();
		
		System.out.println("----------------");
		String str3="@";
		
		String arr[]=str2.split(str3);
		
		for(String x : arr)
		{
			System.out.println(x);
		}
		System.out.println("----------------");
		str3="@";
		String str4=" ";
		System.out.println(str2.replace(str3,str4)); //replace
		
	}
}
