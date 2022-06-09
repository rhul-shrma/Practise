package com.practise;

public class EncryptDepcrypt {
    public static void main(String[] args) {
//        Encryption
        char grade = 'A';
        grade = (char)(grade+8);
        System.out.println(grade);


//    Decryption
        grade = (char)(grade-8);
        System.out.println(grade);
    }

}
