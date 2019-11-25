package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private TextView topicText;

    private HashMap<Integer, String>topics = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topicText = (TextView) findViewById(R.id.topicTextView);
        topics.put(0,"The zombie apocalypse is coming, who are 3 people you want on your team?");
        topics.put(1,"What’s the most embarrassing fashion trend you used to rock?");
        topics.put(2,"You have to sing karaoke, what song do you pick?");
        topics.put(3,"If you were famous, what would you be famous for?");
        topics.put(4,"If you were a sandwich, what would be?");
        topics.put(5,"If you were a talk show host, who would be the first guest you would interview");
        topics.put(6,"What’s the weirdest food you’ve ever eaten?");
        topics.put(7,"You can have an unlimited supply of one thing for the rest of your life, what is it?");
        topics.put(8,"Are you sunrise, daylight, twilight, or nighttime? Why?");
        topics.put(9,"Have you ever met your idol or someone you revere greatly?");
        topics.put(10,"If you could commit any crime and get away with it what would you choose and why?");
        topics.put(11,"If you could eliminate one thing from your daily routine, what would it be and why?");
        topics.put(12,"If you had to teach a class on one thing, what would you teach?");
        topics.put(13,"Would you rather have invisibility or flight?");
        topics.put(14,"Would you rather be the funniest or smartest person in the room?");
        topics.put(15,"What Is The Scariest Thing You Have Ever Done For Fun?");
        topics.put(16,"If You Can Instantly Become An Expert In Something, What Would It Be?");
        topics.put(17,"If You Could Visit Any Place In The World Where Would It Be And Why?");
        topics.put(18,"Would You Rather Mentally Or Physically Never Age?");
        topics.put(19,"Yell Out The First Word That Comes To Your Mind Right Now");

    }

    public void changeTopic(android.view.View view ){
        android.util.Log.d("NEW TOPIC","NEW TOPIC BUTTON CLICKED");

        int random = (int) (Math.random()*topics.size());
        android.util.Log.d("Topics size = ", String.format("value = %d", topics.size()));

        android.util.Log.d("Random Number = ", String.format("value = %d", random));
        topicText.setText(topics.get(random));
    }


}
