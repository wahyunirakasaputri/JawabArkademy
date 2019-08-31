/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkademy;

/**
 *
 * @author ASUS
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Arkademy 
{
   
  
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
         String name, address,hoby, list_scholl,skills;
         Number age; 
        
         //String[]hoby, list_scholl,skills = new String[10];
         boolean is_married,interest_in_coding  = false;
        
        System.out.println("Masukan Nama Anda: ");
        name = input.nextLine();
        
        System.out.println("Masukan Umur Anda: ");
        age = input.nextInt();
        
        System.out.println("Masukan Alamat Anda: ");
        address = input.next();
        
        System.out.println("Masukan Hobi Anda: ");
        
        hoby = input.next();
        //hoby = "makan,minum,tidur";
        
        ArrayList<String> hobby = new ArrayList<String>();
        hobby.add(String.valueOf(hoby));
  
        //List<String> hobby=  new ArrayList<String>(Arrays.asList(hoby.split(",")));
        //String hobby[] = hoby.split("");
        //String text = String.valueOf(hobby);
        
        System.out.println("Apakah Anda Sudah Menikah: ");
        is_married = input.nextBoolean();
        
        System.out.println("Daftar Sekolah Anda: ");
        list_scholl = input.nextLine();
        
        ArrayList<String> list= new ArrayList<String>();
        list.add(String.valueOf(list_scholl));
  
        System.out.println("Skill Anda: ");
        skills = input.next();
        
        ArrayList<String> skills1= new ArrayList<String>();
        skills1.add(String.valueOf(skills));
        
         System.out.println("Apakah Anda Berminat Dengan Coding: ");
        interest_in_coding = input.nextBoolean();
        
        System.out.println("Nama Anda: " + name );
        System.out.println("Umur Anda: " + age );
        System.out.println("Alamat Anda: " + address );
        System.out.println("Hobi Anda: " + hobby );
       if(is_married==false)
        {
            System.out.println("Anda Belum Menikah" );
        }
        else
        {
            System.out.println("Anda Sudah Menikah" );
        }
       System.out.println("Sekolah Anda: " + list );
       System.out.println("Sekolah Anda: " + skills1 );
        if(interest_in_coding==false)
        {
            System.out.println("Anda Tidak Berminat" );
        }
        else
        {
            System.out.println("Anda Berminat" );
        }
        
    }
    
}
