package nik.mobil.gameofballs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

/**
 * Created by Gábor on 2015.05.02..
 */
public class MapView extends View {

    private final static int WIDTH=100;
    private final static int HEIGHT=500;
    private List<Integer> map;
    private Paint paint;

    public MapView(Context context) {
        super(context);
    }

    public MapView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MapView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void Init()
    {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.game_map2);
        canvas.drawBitmap(bitmap, null, new Rect(180,120,390,330), null);
        canvas.drawBitmap(bitmap,new Rect(0,0,290,230),new Rect(0,0,300,300),null);
    }
}
