package com.example.mononi.test;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;

/**
 * Created by Evanase on 7/26/2016.
 */
public class ZoomMapActivity extends Activity {

    private ImageViewTouch mImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoommap);

        mImage = (ImageViewTouch) findViewById(R.id.map2);

        // set the default image display type
        mImage.setDisplayType(ImageViewTouchBase.DisplayType.FIT_IF_BIGGER);

        final DisplayMetrics metrics = getResources().getDisplayMetrics();
        int size = (int) (Math.min(metrics.widthPixels, metrics.heightPixels) / 0.55);


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.map2);

        mImage.setImageBitmap(bitmap, null, -1, -1);

    }
}
