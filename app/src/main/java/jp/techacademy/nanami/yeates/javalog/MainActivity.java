package jp.techacademy.nanami.yeates.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ともこ",16,"読書");

        human.say();
        Log.d("javatest", "「私の名前は" + human.name + "です。年齢は" + human.age + "歳です。」");

        Human human2 = new Human("ともこ",16,"読書");

        human2.think();
    }

}

