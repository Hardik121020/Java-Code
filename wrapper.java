class wrapper_class
{
	public static void main(String args[])
	{	
		float a=25;
		String s="25";
		
		Float ft_obj=new Float(a); //Float object
		System.out.println("Float object = "+ft_obj);
		
		float a_new=ft_obj;  //Float
		System.out.println("Float value = "+a_new);
		
		float s_ft=Float.parseFloat(s);  //String to Float
		System.out.println("String to Float value = "+s_ft);
		
		Float string_obj=new Float(s);   //String to Float object
		System.out.println("String to Float object = "+string_obj);
		
		String ft_str_obj = Float.toString(a_new);  //Float value to String
		System.out.println("Float value to String = "+ft_str_obj);
		
		String float_str_obj = Float.toString(ft_obj);  //Float object to String
		System.out.println("Float object to String = "+float_str_obj);
	}
}
