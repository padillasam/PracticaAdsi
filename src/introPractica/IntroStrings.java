/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introPractica;

/**
 *
 * @author samuel
 */
public class IntroStrings {
    public static void main(String[] args) {
        String s=new String("Hello World     ");
        String sub=s.substring(4,10);
        System.out.println(sub);
        String trimmed=s.trim();
        System.out.println(trimmed);
        String upper=s.toUpperCase();
        char c=s.charAt(2);
        String str=s+sub;
        System.out.println(str);
        str+=" cadena añadida";
        System.out.println(str);
        
//        String s1="Samuel";
//        String s2="Samuel";
//        System.out.println(s1);
//        s1="rick";
//        System.out.println(s1);
    }
    
}
