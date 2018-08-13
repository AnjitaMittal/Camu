package science.wookup.camu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewPhotoActivity extends AppCompatActivity {
    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photo);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Uri imageUri = intent.getData();
        Picasso.get().load(imageUri).into(imageView);
    }
}
