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
public class Mdestiny {
 
           int  resultmname,result;

    
    //========================================= Create Mother Power Name =====================================
                
		public int getMotherPowerName(String sname)
		{
                        int MDkk =0;
			String  sName =sname;
	 		sName = sName.replaceAll(" ", "");
	 		sName = sName.toLowerCase();
                        
               if(!sName.equals("")){
                   
                 char[] chMdestiny = sName.toCharArray();// 'v','u','t','h' 
                 
                   for(char tempMdestiny :chMdestiny){
                       int reer=0;
                               char[] nn ={tempMdestiny};
                                      for(char tes :nn){
                                         reer+=tes-96;
                                 if(reer >96 || reer <123)
                                    
                                     resultmname+=reer;
                                      
                   }if(resultmname ==22|| resultmname ==11 || resultmname ==33){
                         MDkk=resultmname;
                         
                         } 
       
       else if   (resultmname >9 && resultmname !=22 || resultmname !=11 || resultmname !=33 ){
                        MDkk= ((resultmname%9==0)? 9 : resultmname%9);
                                 
                    }
       
    
          }    
    
       }
            return MDkk ;
}

}
