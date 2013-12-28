package com.github.ologhai;

import java.lang.Runnable;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;

public class OlogHaiRunnable implements Runnable {

	private final Context context;
	private final SurfaceHolder holder;
	private boolean running= true;
	
	public OlogHaiRunnable(Context context, SurfaceHolder holder) {
		this.context= context;
		this.holder= holder;
	}
	
	@Override
	public void run() {
		Paint circlePaint= new Paint();
		
		circlePaint.setARGB(255, 0, 0, 255);
		while(running) {
			synchronized(holder) {
				Canvas canvas= holder.lockCanvas();
				if (canvas == null) continue;
				
				canvas.drawARGB(255, 255, 0, 255);
				canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, 20, circlePaint);
				holder.unlockCanvasAndPost(canvas);
			}
			
			try {
				Thread.sleep(33);
			} catch (Exception ex) {
				//What do we do now?!
			}
		}
	}
	
	public void setRunning(boolean running) {
		this.running= running;
	}
}
