package com.example.naumi.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class DrawView extends View{
        public DrawView(Context context) {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Paint myPaint = new Paint();
            canvas.drawColor(Color.argb(200, 255, 85, 15));
            myPaint.setARGB(225,230,10,100);
            canvas.drawCircle((float).50*getWidth(),(float).5*getHeight(),(float).0625*getWidth(),myPaint);
            myPaint.setStrokeWidth(10);
            //Vertical Lines
            canvas.drawLine((float).125*getWidth(),getTop(),(float).125*getWidth(),getBottom(),myPaint);
            canvas.drawLine((float).25*getWidth(),getTop(),(float).25*getWidth(),getBottom(),myPaint);
            canvas.drawLine((float).375*getWidth(),getTop(),(float).375*getWidth(),getBottom(),myPaint);
            canvas.drawLine((float).5*getWidth(),getTop(),(float).5*getWidth(),getBottom(),myPaint);
            canvas.drawLine((float).625*getWidth(),getTop(),(float).625*getWidth(),getBottom(),myPaint);
            canvas.drawLine((float).75*getWidth(),getTop(),(float).75*getWidth(),getBottom(),myPaint);
            canvas.drawLine((float).875*getWidth(),getTop(),(float).875*getWidth(),getBottom(),myPaint);
            //Horizontal Lines
            canvas.drawLine(getLeft(),(float).125*getHeight(),getRight(),(float).125*getHeight(),myPaint);
            canvas.drawLine(getLeft(),(float).25*getHeight(),getRight(),(float).25*getHeight(),myPaint);
            canvas.drawLine(getLeft(),(float).375*getHeight(),getRight(),(float).375*getHeight(),myPaint);
            canvas.drawLine(getLeft(),(float).5*getHeight(),getRight(),(float).5*getHeight(),myPaint);
            canvas.drawLine(getLeft(),(float).625*getHeight(),getRight(),(float).625*getHeight(),myPaint);
            canvas.drawLine(getLeft(),(float).75*getHeight(),getRight(),(float).75*getHeight(),myPaint);
            canvas.drawLine(getLeft(),(float).875*getHeight(),getRight(),(float).875*getHeight(),myPaint);
            //Declare and Instantiate RectF
            myPaint.setARGB(225,255,148,255);
            RectF topRight = new RectF((float).875*getWidth(),getTop(),getWidth(),(float).125*getHeight());
            canvas.drawRect(topRight,myPaint);
            RectF botLeft = new RectF(getLeft(),(float).875*getHeight(),(float).125*getWidth(),getHeight());
            canvas.drawRect(botLeft,myPaint);
            RectF botRight = new RectF((float).875*getWidth(),(float).875*getHeight(),getRight(),getBottom());
            canvas.drawRect(botRight,myPaint);
            //X within topRight
            myPaint.setColor(Color.BLACK);
            canvas.drawLine(topRight.left,topRight.top,topRight.right,topRight.bottom,myPaint);
            canvas.drawLine(topRight.right,topRight.top,topRight.left,topRight.bottom,myPaint);
            //Black Circle within botRight
            canvas.drawCircle(botRight.centerX(),botRight.centerY(),botRight.width()/2-5,myPaint);
            //Red Circle within botLeft
            myPaint.setColor(Color.RED);
            canvas.drawCircle(botLeft.centerX(),botLeft.centerY(),botLeft.width()/2-5,myPaint);


        }
}
