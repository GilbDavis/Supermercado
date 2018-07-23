/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Vivia Jones
 */
public class Splash {
    
    public static void main(String[] args){
        SplashScreen spl = new SplashScreen();
        VPrincipal prin = new VPrincipal();
        spl.setLocationRelativeTo(null);
        spl.setVisible(true);
        try{
            for(int i = 0; i <= 100; i++){
                Thread.sleep(40);
                spl.Loadlbl.setText("Loading " + Integer.toString(i) + "%");
                spl.Progressbar.setValue(i);
                if(i == 100){
                    spl.dispose();
                    prin.setVisible(true);
                }
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
    
}
