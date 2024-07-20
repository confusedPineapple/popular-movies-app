package com.example.popularmovies;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ImageView poster = findViewById(R.id.poster_image);
        TextView rating = findViewById(R.id.movie_rating);
        TextView title = findViewById(R.id.movie_title);
        TextView description = findViewById(R.id.movie_description);

        Bundle bundle = getIntent().getExtras();

        String movieTitle = bundle.getString("title");
        String moviePoster = bundle.getString("poster");
        String movieOverview = bundle.getString("overview");
        String movieRating = bundle.getString("rating");


        Picasso.get().load(moviePoster).into(poster);
        rating.setText(movieRating);
        title.setText(movieTitle);
        description.setText(movieOverview);


    }
}