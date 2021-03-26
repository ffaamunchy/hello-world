import java.util.*;
import java.util.stream.IntStream;
public class helloworld {
    //private String[] state = {"kuala terengganu","kuala lumpur","kajang","bangi"};
    // Function return true if given element
    // found in array
    

    public  static String[] city = new String[]{"Kuala TERengganu","kuala lumpur","kajang","bangi"};
    public  static String[] state = new String[]{"Selangor","Terengganu","Pahang","Chendering"};
    
    public static boolean isNoRumah(String strValue)
    {
            String[] isDigit = strValue.split(" "); // [No, 11]
            //System.out.println("Value no rumah : "+ Arrays.toString(isDigit));
            for (int i = 0; i < isDigit.length; i++) {

                /*if(isDigit[i].startsWith("No")){
                    System.out.println(isDigit[i]+" ");
                    
                    return true;
                }*/
                String aptVal = isDigit[i].toLowerCase();
                if (aptVal.startsWith("no") || isNumber(isDigit[i])) {
                    //System.out.println("'apt':" + strValue);
                    
                    return true;
                } 
                
            }


         
            
        
        return false;
    }
    //--------------------------------------------------------------------------
    public static boolean isBandar(String strValue)
    {
        
         
            for (int i = 0; i < city.length; i++) {
                
                boolean match = strValue.contains(city[i].toLowerCase());
                if (match){
                    // Print the result
                    return true;

                }
                else {

                    //System.out.println("not sames");
                    return false;
                }
            }
        
        return false;
    }
    //--------------------------------------------------------------------------
    public static boolean isDaerah(String strValue)
    {
        
         
            for (int i = 0; i <= state.length; i++) {
                System.out.println("****"+state[i]);
                boolean match = strValue.contains(state[i].toLowerCase());
                if (match){
                    // Print the result
                    //System.out.println(match1);
                    return true;

                }
                else {
                    return false;
                }
            }
        
        return false;
    }

    public static boolean isNumber(String val){
        int intValue;
            try {
            intValue = Integer.parseInt(val);
            return true;
        } catch (NumberFormatException e) {
            //System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
   public static void main(String[]args){
        String kodJenisLain="";
        String kodJenisNoRumah="";
        String kodJenisNegeri="";
        String kodJenisDaerah="";
        //Scanner input = new Scanner(System.in);
        //System.out.printf("Enter your address : "); //No 11, Chendering, 21080 Kuala Terengganu, Terengganu.
        //String address = input.nextLine();
        

        String address = "no F-3A-16, Kuala Terengganu, Pahang";
        String[] toCheckValue = address.split(","); // [No 11, Kuala Terengganu, Chendering]
        String[] kodType = new String[toCheckValue.length];
        //toCheckValue.toLowerCase();
        for (int a = 0; a < toCheckValue.length; a++) 
        {

            /*if(toCheckValue[a].startsWith("No") || toCheckValue[a].startsWith("no")){
                isNoRumah(toCheckValue[a]);
            }*/
            //---------------
            if (toCheckValue[a].startsWith("No") || toCheckValue[a].startsWith("no")) {
                if(isNoRumah(toCheckValue[a])){
                    kodJenisNoRumah = toCheckValue[a];
                    kodType[0] = kodJenisNoRumah;
                }
            }else
            {
                kodType[0]=kodJenisLain;
            }
            
            //---------------
            if (isBandar(toCheckValue[a].toLowerCase())) {
                kodJenisNegeri = toCheckValue[a];
                kodType[1]=kodJenisNegeri;
                //String kodJenisNegeri = kodType[1];
            }
            else
            {
                kodType[1]=kodJenisLain;
                //String kodJenisLain = kodType[1];
            }

            //---------------
            //isDaerah(toCheckValue[a].toLowerCase());
            if (isDaerah(toCheckValue[a].toLowerCase())) {
                System.out.println(toCheckValue[a]);
                kodJenisDaerah = toCheckValue[a];
                kodType[2]=kodJenisDaerah;
                //String kodJenisNegeri = kodType[1];
            }
            else
            {
                kodType[2]=kodJenisLain;
                //String kodJenisLain = kodType[1];
            }
            //System.out.printf("'apt : '"+kodType[0]+"\n 'city : '"+kodType[1]+"\n 'state : '"+kodType[2]+"\n");
            //System.out.printf(kodType[a]);
            
        }

        
   }
}