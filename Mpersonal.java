/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famtupredict;

/**
 *
 * @author Mr. Mohammed
 */
public class Mpersonal {
     int  resultmname,result;
     
               
//==================================== Obtain the Mother Personality Number===================================
                
		public int getMothertPersonality(String sname)
		{
                        int MPkk =0;
			String sName = sname;
	 		sName = sName.replaceAll(" ", "");
	 		sName = sName.toLowerCase();
                        
                                    
                      if(!sName.equals("")){
                      char[] chaCpers = sName.toCharArray();//moh 'v','u','t','h' 
                         for(char tempCpers :chaCpers){
                           if(tempCpers == 'b'||tempCpers == 'c'||tempCpers == 'd'||tempCpers == 'f'||tempCpers == 'g'||tempCpers == 'h'||tempCpers == 'j'||tempCpers == 'k'||tempCpers == 'l'||tempCpers == 'm'
                              ||tempCpers == 'n'||tempCpers == 'p'||tempCpers == 'q'||tempCpers == 'r'||tempCpers == 's'||tempCpers == 't'||tempCpers == 'v'||tempCpers == 'w'||tempCpers == 'x'||tempCpers == 'z'){
                                     int re=0;
                               char[] n ={tempCpers};
                                      for(char te :n){
                                         re+=te-96;
                                 if(re >96 || re <123)
                                    
                                     resultmname+=re;
                                      }
                 }if(resultmname ==22|| resultmname ==11 || resultmname ==33){
                         MPkk=resultmname;
                         
                         } 
       
       else if   (resultmname >9 && resultmname !=22 || resultmname !=11 || resultmname !=33 ){
                        MPkk= ((resultmname%9==0)? 9 : resultmname%9);
                         
       }
      }
    }  
	return MPkk ;

  }
}
