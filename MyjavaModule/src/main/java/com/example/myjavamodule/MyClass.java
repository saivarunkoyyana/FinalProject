package com.example.myjavamodule;

import java.util.Random;

public class MyClass {
   public String[] jokes={"ALGORITHM (noun.) "+"\n"+"word used by programmers when they don't want to explain what they did","HARDWARE (noun.)"+"\n"+"(Answer)a part of a computer that you can kick","what is the easiest way to become wealthy "+"\n"+"(Answer) inheritance","0 is false and 1 is true , right? "+"\n"+"(Answer) 1"};


    public String jokes(){
        Random  random= new Random();
        final int abc=random.nextInt(jokes.length);
        String jokes_haha=jokes[abc];

        return jokes_haha;
    }
}
