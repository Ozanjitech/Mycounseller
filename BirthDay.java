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
public class BirthDay {
    int day;
    public int getBirthDay(int day){
        int BDkk =0;
        int sday =day;
        if(sday ==22|| sday ==11 )
            BDkk =sday;
        else if   (sday >9 && sday !=22 || sday !=11  ){
                        BDkk= ((sday%9==0)? 9 : sday%9);
                                 
                    }
        return BDkk;
    }
            
}
