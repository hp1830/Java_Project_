package Utill_String;

public class Utill_Data1 {
	// 문자열 반전 시키기
    public static String Rav(String s , boolean Op )
    {
    	String Result="";
    	int Count=0;
    	for(int i=s.length();i>-1;i--)
    	{
    		if(Op)
    		{
    			if(Count==4)
    			{
    				Result+='/';
    			}
    		}
    		Result+=s.charAt(i);
    	}
    	return Result;
    }
    //2진수 만들기 
	public static String ToBin(int i)
	{
		if(i==1)
			return "1";
		if(((i/2)%2)==0)
			return ((i%2)==0 ? "0":"1") +ToBin(i/2);
		else
			return ((i%2)==0 ? "0":"1")+ToBin(i/2);
	}
	//2진수 만들기
	public static String ToBin(String num)
	{
		return ToBin(Integer.parseInt(num));
	}
	
	public static void TEST()
	{
		
	}
	
}
