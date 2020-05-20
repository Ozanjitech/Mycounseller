/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package famtupredict;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr. Mohammed
 */
public class Parent_Event {
   
    public static String fullBirthName;
    public static String fullBirthPersonalName;
    public static String fullBirthSoulName;
    public static String fullBirthDestinyName;
    
    public static String motherName;
    public static String motherNamePersonalName;
    public static String motherNameSoulName;
    public static String motherNameDestinyName;
    
    public static String currentName;
     public static String currentNamePersonalName;
    public static String currentNameSoulName;
    public static String currentNameDestinyName;
    
    public static int day,month, year,resultmname, result, rem, sum;
    public static int sumDay, sumMonth,sumYear;
   static String sName;
    
 
   
 public static String getfullBirthName(String sName)
		{
			return fullBirthName =sName;
		}
     public static String getfullBirthPersonalName(String sName)
		{
			return fullBirthPersonalName=sName;
		}
      public static String getfullBirthSoulName(String sName)
		{
			return fullBirthSoulName =sName;
		}
      public static String getfullBirthDestinyName(String sName)
		{
			return fullBirthDestinyName =sName;
		}
        public static String getmotherName(String sName)
		{
			return motherName =sName;
		}
     public static String getmotherNamePersonalName(String sName)
		{
			return motherNamePersonalName=sName;
		}
       public static String getmotherNameSoulName(String sName)
		{
			return motherNameSoulName =sName;
		}
     public static String getmotherNameDestinyName(String sName)
		{
			return motherNameDestinyName=sName;
		}
     public static String getcurrentName(String sName)
		{
			return currentName=sName;
		}
      
     public static String getcurrentNamePersonalName(String sName)
		{
			return currentNamePersonalName=sName;
		}
      public static String getcurrentNameSoulName(String sName)
		{
			return currentNameSoulName =sName;
		}
     public static String getcurrentNameDestinyName(String sName)
		{
			return currentNameDestinyName=sName;
		}
     
  //===========Destiny Number====================  
     
public static String getfullBirthName(java.awt.event.ActionEvent evt){
                         sName ="";
	 		sName = sName.replaceAll(" ", "");
	 		sName = sName.toLowerCase();
if(!sName.equals("")){
           char[] chse = sName.toCharArray();// 'v','u','t','h'            
        for(char tem :chse){
             if(tem <=97 && tem>=122){
                  resultmname+=tem-96;
             }
        }
        while(resultmname >9 && resultmname ==11 || resultmname ==22 || resultmname ==33){
                       result= ((resultmname%9==0)? 9 : resultmname%9);
       
    
        }    
    
  }
return (String.valueOf(result)) ;
}      



//================ Personal Number ==============

public static String getfullBirthPersonalName(java.awt.event.ActionEvent evt){
                         sName ="";
	 		sName = sName.replaceAll(" ", "");
	 		sName = sName.toLowerCase();
if(!sName.equals("")){
          char[] chse = sName.toCharArray();// 'v','u','t','h'            
        for(char temp :chse){
            
        
             if(temp == 'b'||temp == 'c'||temp == 'd'||temp == 'f'||temp == 'g'||temp == 'h'||temp == 'j'||temp == 'k'||temp == 'l'||temp == 'm'
                     ||temp == 'n'||temp == 'p'||temp == 'q'||temp == 'r'||temp == 's'||temp == 't'||temp == 'v'||temp == 'w'||temp == 'x'||temp == 'z'){
             if(temp <=97 && temp >=122){
            
                  resultmname+=temp-96;
             }
             }
             while(resultmname >9 && resultmname ==11 || resultmname ==22 || resultmname ==33){
                       result= ((resultmname%9==0)? 9 : resultmname%9);
             }            
        }    
   }
  return (String.valueOf(result)) ;
  
 }

//================ Soul Number==============

public static String getfullBirthSoulName(java.awt.event.ActionEvent evt){
                         sName ="";
	 		sName = sName.replaceAll(" ", "");
	 		sName = sName.toLowerCase();
    if(!sName.equals("")) {  
       
         
         char[] chas = sName.toCharArray(); //'c','f','d','m'
         for(char tempse : chas){
         if(tempse =='a'|| tempse=='e'||tempse=='i' ||tempse=='o' ||tempse=='u' || tempse=='y'){
            if(tempse>=97 && tempse<=122){
                 resultmname+=tempse-96;
            }
         }
            while(resultmname >9 || resultmname == 11 ||  resultmname == 22 ||resultmname == 33){
             resultmname-=9;
            }
         
       }
   }
 return (String.valueOf(resultmname));		
}

//======================Mothers Destiny Name============================

public static String getMothersDestinyName(){
    sName ="";
    sName =sName.replaceAll(" ", " ");
    sName = sName.toLowerCase();
    
    if(sName.equals(" ")){
        char[] chMdestiny = sName.toCharArray();
        for(char tempMdestiny : chMdestiny){
            if(tempMdestiny <= 97 && tempMdestiny>=122){
               resultmname+=tempMdestiny -96;  
            }while(resultmname >9 || resultmname ==11 || resultmname == 22 || resultmname ==33){
                resultmname-=9;
            }
        }
    }
 return (String.valueOf(resultmname));		
}

// ================== Mother Personal Name==============

public static String getMotherPersonalName(){
    
    sName ="";
    sName = sName.replaceAll("", "");
    sName = sName.toLowerCase();
    
    if(sName.equals("")){
        char[] chMpers = sName.toCharArray();
        for(char tempMpers : chMpers){
        if(tempMpers == 'b'||tempMpers == 'c'||tempMpers == 'd'||tempMpers == 'f'||tempMpers == 'g'||tempMpers == 'h'||tempMpers == 'j'||tempMpers == 'k'||tempMpers == 'l'||tempMpers == 'm'
                     ||tempMpers == 'n'||tempMpers == 'p'||tempMpers == 'q'||tempMpers == 'r'||tempMpers == 's'||tempMpers == 't'||tempMpers == 'v'||tempMpers == 'w'||tempMpers == 'x'||tempMpers == 'z'){
             if(tempMpers <=97 && tempMpers >=122){    
                resultmname+=tempMpers-96; 
             }while(resultmname >9 || resultmname ==11 || resultmname == 22 || resultmname ==33){
                 resultmname-=9;
             }
        }
    }
    }
  return (String.valueOf(resultmname));		
   
}

//==============================Mothers Soul Name===============================

public static String getMotherSoulName(){
    
    sName ="";
    sName = sName.replaceAll("", "");
    sName = sName.toLowerCase();
    
    if(sName.equals(" ")){
        char[] chMsoul = sName.toCharArray();
        for(char tempMsoul : chMsoul){
            if(tempMsoul =='a'|| tempMsoul=='e'||tempMsoul=='i' ||tempMsoul=='o' ||tempMsoul=='u' || tempMsoul=='y'){
            if(tempMsoul >=97 && tempMsoul <=122){
                 resultmname+=tempMsoul-96;
            }
        }while(resultmname >9 || resultmname ==11 || resultmname == 22 || resultmname ==33){
            resultmname-=9;
        }
    }
}
return (String.valueOf(resultmname));
}
//=================Exit=====================

private JFrame frame;

public void iExitsystem(){
 
    frame = new JFrame("Exit");
    if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Billing System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        System.exit(0);
    }
}

//============= Key Numbers Only======================

public void NumbersOnly(java.awt.event.KeyEvent evt){
    
    char iNumber = evt.getKeyChar();
    if(!(Character.isDigit(iNumber)) 
        || (iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
        
        evt.consume();
    }
}
    
    /**
     *
     * @param evt
     */
//============= Key Characters Only======================
    public void CharactersOnly(java.awt.event.KeyEvent evt){
    
    char character = evt.getKeyChar();
    if(!(Character.isAlphabetic(character))
       && !(Character.isSpace(character))) 
     {
        
        evt.consume();
    }
        
}

}








