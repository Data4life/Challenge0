/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harris_3_challenge0;

/**
 *
 * @author Data4Life
 */
public class Harris_3_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int evens = 0;
        for(int i =0; i<500; i++){
            if (isDivisblebyfive(i) && isDivisblebyeleven(i)){
                if (isDivisblebyfive(i)){
                    System.out.println("Animate this");
                }
            }else if (isDivisblebythree(i) & isDivisblebyeleven(i)){
                System.out.println("Herr Direktor");
            }
            else{
                System.out.println(i);
            }
        }    
    }  


static boolean isDivisblebytwo(int someNumber) {
    return (someNumber % 2 == 0);
}
static boolean isDivisblebythree(int someNumber) {
    return (someNumber % 3 == 0);
}
static boolean isDivisblebyfive(int someNumber) {
    return (someNumber % 5 == 0);
}
static boolean isDivisblebyeleven(int someNumber) {
    return (someNumber % 11 == 0);
}
}
