package com.example.heba.heba;

        import android.content.Context;
        import android.opengl.GLSurfaceView;
        import android.view.MotionEvent;
//import es2.learning.ViewPortRenderer;

public class Cubesurfaceview extends GLSurfaceView {

    float touchedX = 0;
    float touchedY = 0;
    Cuberenderer renderer;

    public Cubesurfaceview(Context context,float temp_pos,  Float X[],  Float Y[]) {
        super(context);
        setEGLContextClientVersion(2);
        setRenderer(renderer = new Cuberenderer(this,temp_pos,X,Y));

    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        if (event.getAction() == MotionEvent.ACTION_DOWN)
        {
            touchedX = event.getX();
            touchedY = event.getY();
        } else if (event.getAction() == MotionEvent.ACTION_MOVE)
        {
            renderer.xAngle += (touchedX - event.getX())/2f;
            renderer.yAngle += (touchedY - event.getY())/2f;

            touchedX = event.getX();
            touchedY = event.getY();
        }
        return true;

    }
}