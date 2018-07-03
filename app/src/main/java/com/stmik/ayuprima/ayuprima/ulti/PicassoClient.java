package com.stmik.ayuprima.ayuprima.ulti;

import android.content.Context;
import android.widget.ImageView;


import com.stmik.ayuprima.ayuprima.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Battosai on 3/14/2017.
 */

public class PicassoClient {

    public static void downloadImage(Context c, String imagUrl, ImageView img)
    {
        if(imagUrl != null && imagUrl.length()>0)
        {
            Picasso.with(c).load(imagUrl).placeholder(R.drawable.loading).into(img);
        }else {
            Picasso.with(c).load(R.drawable.loading).into(img);
        }
    }

}
