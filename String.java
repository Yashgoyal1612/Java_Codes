// Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are “Mark” and “Kate” then the output should be “markate”. (The output should be in lowercase)

package com.company;
import java.util.*;
public class Append_String {
    String s1, s2;

    Append_String(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
        public void Append()
        {
            s2=s2.toLowerCase();
            String s5 = "";
            s5 = s5.concat(s1);
            char s3 = s1.charAt(s1.length() - 1);
            char s4=  s2.charAt(0);
            if (s3 == s4) {
                s5 = s5 + s2.substring(1);
            } else {
                s5 = s5 + s2;
            }
            System.out.print("Final String is ");
            System.out.println(s5);
        }

        public static void main (String[]args){
            String str1, str2;
            System.out.println("Enter the first string");
            Scanner s = new Scanner(System.in);
            str1 = s.nextLine();
            System.out.println("Enter the second string");
            str2 = s.nextLine();

            Append_String obj = new Append_String(str1, str2);
            obj.Append();
        }
    }
