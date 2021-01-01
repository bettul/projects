/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_project;

/**
 *
 * @author ZEYNEP
 */
public class Calisan  extends Kullanıcı implements Onay{

    @Override
    public boolean onayver(String tip) {
        boolean flag=false;
        if(tip=="kart"||tip=="limit"){
        flag=true;
        }
       return flag;
    }

    @Override
    public boolean yetki_ver() {
        yetki=true;
        return yetki;
    }

    


    
}
