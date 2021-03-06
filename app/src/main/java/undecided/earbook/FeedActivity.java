package undecided.earbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        //Load newest 10 posts from database from friends
    }



    //Common Interface Between Pages
    public void feedButtonOnClick(View v) {
        Intent feed = new Intent(getBaseContext(), FeedActivity.class);

        //Just backs out to the main login page
        startActivity(feed);
    }

    public void searchButtonOnClick(View v) {
        Intent search = new Intent(getBaseContext(), SearchActivity.class);

        //Just backs out to the main login page
        startActivity(search);
    }

    public void postButtonOnClick(View v) {
        Intent post = new Intent(getBaseContext(), PostActivity.class);

        //Just backs out to the main login page
        startActivity(post);
    }

    public void profileButtonOnClick(View v) {
        Intent profile = new Intent(getBaseContext(), ProfileActivity.class);

        //Just backs out to the main login page
        startActivity(profile);
    }
}
