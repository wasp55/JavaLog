package jp.techacademy.nanami.yeates.javalog;

/**
 * Created by Nanami on 10/10/2016.
 */
import android.util.Log;

class Human extends Animal implements Thinkable {
    static String to_jp = "人";

    String name;
    int age;
    String hobby;

    public Human(String name,int age,String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }


    public static void introduce(){
        Log.d("javatest","これは人クラスです。");
    }


    public void say(){
        Log.d("javatest", "「私の名前は" + this.name + "です。歳は" + this.age + "です。」");
    }

    @Override
    public void think(){
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }

    }
