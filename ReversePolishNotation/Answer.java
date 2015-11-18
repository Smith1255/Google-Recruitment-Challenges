public class Answer {   
    public static String answer(String str) { 
        String newString = "";
        String[] divideMult;
        String[] dividePlus = str.split("\\+");
        for (String multBlock: dividePlus) {
            divideMult = multBlock.split("\\*");
            for (String number: divideMult) {
                newString += number;
            }
            
            for (int i = 0; i < divideMult.length-1; i++) {
                newString += "*";
            }
        }
        
        for (int i = 0; i < dividePlus.length-1; i++)  {
            newString += "+";
        }
        
        return newString;
    } 
}