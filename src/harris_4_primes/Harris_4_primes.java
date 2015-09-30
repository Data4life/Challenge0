/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harris_4_primes;

/**
 *
 * @author Data4Life
 */
public class Harris_4_primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int evens = 0;
    for(int i = 0; i<101; i++){
    if(isEven(i)){
        
    }
    if(i % 2 == 0){
        evens++;
    isEven(i);
    }           
    System.out.println(isOdd(i));
    System.out.println(isEven(i));
    }
System.out.println("There are "+evens);
    
    }
    
static boolean isPrime(int someNumber){
    boolean prime = true;
    int divisors =0;
    for (int i = 2; i<someNumber/2; i++){
        if (someNumber %i==0){
            prime = false;
        }
    }
    return prime;
}
static boolean isEven(int someNumber){

    return (someNumber % 2 == 0);
    
    
    }
static boolean isOdd(int someNumber){
    return (someNumber % 2 != 0);
}    

}    
/*
        //        for(int i = 0; 1<100;i++){
        //            if (i % 2 != 0){
        //                if (i % 3 !=0){
        //                    if (i % 5 !=0){
        //                        if (i % 7 !=0){
        //                            if (i % 11 !=0){
        //                                if (i % 13 !=0){
        //                                    if (i % 17 !=0){
        //                                        if (i % 19 !=0){
        //                                            if (i % 23 !=0){
        //                                                if (i % 29 !=0){
        //                                                    if (i % 31 !=0){
        //                                                        if (i % 37 !=0){
        //                                                            if (i % 41 !=0){
        //                                                        }
        //                                                    }
        //                                                }
        //                                            }
        //                                        }
        //                                    }
        //                                }
        //                            }
        //                        }
        //                    }
        //                }

     
        A little program that comuinicates to other parts of the program
        that returns a value.
        0*/
