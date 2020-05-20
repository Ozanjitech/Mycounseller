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
class YearCh {
int year, remy,sumY;
    

    YearCh() {
        
    }
        public int getYearChooser(int year){ 
         int BDkk =0;
        
        remy = ((year%9 ==0)? 9 : year%9);
//              sumY = sumY+remy;
              
//           year =year/10;
        
             if(remy ==11|| remy ==22 || remy==22 || remy==33 ){
            BDkk =remy;
             }
        else if   (remy >9 && remy !=11 || remy !=22 || remy !=33  ){
                        BDkk= ((remy%9==0)? 9 : remy%9);
                                 
                    }
        return BDkk;
    }

}
