import java.util.*;
import java.util.stream.IntStream;
public class helloworld {
	//private String[] state = {"kuala terengganu","kuala lumpur","kajang","bangi"};
    // Function return true if given element
    // found in array
    int kodJenisLain=0;
    int kodJenisNoRumah=1;
    int kodJenisNegeri=2;

    public  static String[] state = new String[]{"Kuala TERengganu","kuala lumpur","kajang","bangi"};
    
    public static boolean isNoRumah(String strValue)
    {
        
         
	        for (int i = 0; i < state.length; i++) {
	        	
	        	boolean test = strValue.contains(state[i].toLowerCase());
	        	if (test){
	        		// Print the result
	        		return true;

	        	}
	        	else {

	        		System.out.println("not sames");
	        		return false;
	        	}
	        }
  		
        return false;
    }
    //--------------------------------------------------------------------------
    public static boolean isBandar(String strValue)
    {
        
         
	        for (int i = 0; i < state.length; i++) {
	        	
	        	boolean test = strValue.contains(state[i].toLowerCase());
	        	if (test){
	        		// Print the result
	        		return true;

	        	}
	        	else {

	        		System.out.println("not sames");
	        		return false;
	        	}
	        }
  		
        return false;
    }

   public static void main(String[]args){
   	// Get the array
        //Integer arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
  
        // Get the value to be checked
        //int toCheckValue = 7;
        //Scanner input = new Scanner(System.in);
	   	//System.out.printf("Enter your address : "); //No 11, Chendering, 21080 Kuala Terengganu, Terengganu.
	   	//String address = input.nextLine();
	   	String address = "Kuala Terengganu, Kuala Terengganu, Chendering";
	   	String[] toCheckValue = address.split(","); 
        int[] kodType = new int[toCheckValue.length];


		//String[] arr = Arrays.toString(tokens); //[No 11,  Kuala Terengganu,  Chendering]
  		//String[] arr = new String[]{"Kuala Terengganu","Kuala Lumpur","Kajang","Bangi"};
        // Print the array
        //System.out.println("Array: " + Arrays.toString(toCheckValue)); //[No 11,  Kuala Terengganu,  Chendering]
        //System.out.println("Array: " + Arrays.toString(arr)); 
  
        // Check if this value is
        // present in the array or not

        for (int a = 0; a < toCheckValue.length; a++) 
        {
        	if (isNoRumah(toCheckValue[a].toLowerCase()) {
        		kodType[0]=kodJenisNoRumah;
        	}
        	else
        	{
        		kodType[0]=kodJenisLain;
        	}
        	//---------------
        	if (isBandar(toCheckValue[a].toLowerCase()) {
        		kodType[1]=kodJenisNoRumah;
        	}
        	else
        	{
        		kodType[1]=kodJenisLain;
        	}
    	}

    /*String number;
     String address;
     String aptNumber;


    String str = "No 11, Chendering, 21080 Kuala Terengganu, Terengganu.";
    //String str = "This is String , split by StringTokenizer";
    StringTokenizer st = new StringTokenizer(str);

    System.out.println("---- Split by space ------");
    System.out.println(Arrays.toString(st));
    while (st.hasMoreElements()) {
                String s = System.out.println(st.nextElement());

                if(StringUtils.isNumeric(s)){
                    number = s;
                    continue;  
            	}   

                //if(s.string("Apt")) {
                //   aptNumber = s.substring(s.indexOf("Apt"),s.length-1);
                //   continue;
                //}
    }

    System.out.println("---- Split by comma ',' ------");
    StringTokenizer st2 = new StringTokenizer(str, ",");

    while (st2.hasMoreElements()) {
        System.out.println(st2.nextElement());
    }*/


    /*Scanner input = new Scanner(System.in);
   	//helloworld s = new helloworld();

   	System.out.printf("Enter your address : ");
   	String address = input.nextLine();

   	//System.out.println(" Student is " +name);

   	//String test = "It's the number 1 way.";
	String[] tokens = address.split(",");       // Single blank is the separator. {"A", "C"}
	System.out.println(Arrays.toString(tokens));

	String[] values = {"Kuala Terengganu","Kuala Lumpur","Kajang","Bangi"};
	boolean contains = Arrays.stream(tokens).anyMatch(s -> s.contains(Arrays.asList(values)));
	System.out.println(contains);
	if (contains){
		System.out.println(Arrays.stream(tokens).anyMatch(address::contains));
	}
	
	//var p5 = new Person(27, "Lucy", Gender.FEMALE);

    */


	

   }
}