// Andrew Smith 
// 12/4/15
//Google Programming Challenge 3 - Access Codes
import java.util.ArrayList;  
//---------------------------------------------------------------------------------------------------------
// This program was created for the Google FOOBAR Coding Recruitment Challenge
//
// The application takes a given set of "Access Codes" (made of only lowercase letters) and finds the 
// number of distinct access codes as defined by:
//
//      Any string that is not repeated both forwards and backwards. "foo" is distinct in the list 
//      ["foo", "bar], but not in the list ["foo", "oof"].
//
// and returns the total number of distinct codes.
//---------------------------------------------------------------------------------------------------------
public class Answer {   
    public static int answer(String[] accessCodes) {
       ArrayList<String> distinctKeys = new ArrayList<String>();
       
       for (String accessKey: accessCodes) {
           if (distinctKeys.contains(accessKey))
                continue; //There is an identical string in the saved keys
           else if (distinctKeys.contains(new StringBuilder(accessKey).reverse().toString()))
                continue; //There is a reversed string in the saved keys
           else 
                distinctKeys.add(accessKey); //The given accessKey is distinct 
                    
       }
       
       return distinctKeys.size();
    } 
}

