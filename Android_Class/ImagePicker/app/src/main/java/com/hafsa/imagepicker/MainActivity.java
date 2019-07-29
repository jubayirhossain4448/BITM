package com.hafsa.imagepicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button camera,gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        camera=findViewById(R.id.cameraId);
//        gallery=findViewById(R.id.galleryId);
          imageView=findViewById(R.id.imageVID);


//        camera.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//
//                startActivityForResult(intent,0);
//
//            }
//        });





    }

    public void openCamera(View view) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,0);


    }


    public void gallery(View view) {

        Intent intent = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        startActivityForResult(intent,1);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK){

            if (requestCode==0){

                Bundle bundle = data.getExtras();
                Bitmap bitmap= (Bitmap) bundle.get("data");
                imageView.setImageBitmap(bitmap);


            }
            else if(requestCode==1){

                Uri uri = data.getData();
                imageView.setImageURI(uri);

            }


        }


    }
}
