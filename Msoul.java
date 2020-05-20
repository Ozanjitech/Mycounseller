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
public class Msoul {
       int  resultmname,result;

       // =====================================Calculates the Mother Soul Number==========================================
                
		public int getMotherSoul(String sname)
		{
                                 int MSkk =0;
				String sName = sname;
		 		sName = sName.replaceAll(" ", "");
		 		sName = sName.toLowerCase();
                 if(!sName.equals("")) { 
                     
                 char[] chMsoul = sName.toCharArray();
        
                        for(char tempMsoul : chMsoul){
            
                              if(tempMsoul =='a'|| tempMsoul=='e'||tempMsoul=='i' ||tempMsoul=='o' ||tempMsoul=='u' || tempMsoul=='y'){
                                 int reer=0;
                               char[] nn ={tempMsoul};
                                      for(char tes :nn){
                                         reer+=tes-96;
                                 if(reer >96 || reer <123)
                                    
                                     resultmname+=reer;
                                      
                   }if(resultmname ==22|| resultmname ==11 || resultmname ==33){
                         MSkk=resultmname;
                         
                         } 
       
       else if   (resultmname >9 && resultmname !=22 || resultmname !=11 || resultmname !=33 ){
                        MSkk= ((resultmname%9==0)? 9 : resultmname%9);
                                 
                    }
            }
         
       }
   }
 return MSkk;
}

}
