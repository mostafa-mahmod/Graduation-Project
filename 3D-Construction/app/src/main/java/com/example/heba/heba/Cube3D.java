package com.example.heba.heba;



//import es2.learning.ES2SurfaceView;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;


public class Cube3D extends Activity {

    Cubesurfaceview  view;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        float temp_pos=0.1f;
        Float X[] = { 0f, 0.3f,0.3f,0f,0f };
        Float Y[] = { 0f, 0f,0.3f,0.3f,0f};

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        view = new Cubesurfaceview(this,temp_pos,X,Y);
        setContentView(view);
    }


    @Override
    protected void onResume()
    {
        // The activity must call the GL surface view's onResume() on activity onResume().
        super.onResume();
        view.onResume();
    }

    @Override
    protected void onPause()
    {
        // The activity must call the GL surface view's onPause() on activity onPause().
        super.onPause();
        view.onPause();
    }




}
