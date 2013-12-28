package com.github.ologhai;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class OlogHaiView extends SurfaceView implements SurfaceHolder.Callback {

	private final Context context;
	private final OlogHaiRunnable runnable;
	
	public OlogHaiView(Context context) {
		super(context);
		
		getHolder().addCallback(this);
		setKeepScreenOn(true);
		this.context= context;
		this.runnable= new OlogHaiRunnable(context, getHolder());
	}

	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		runnable.run();
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		runnable.setRunning(false);
	}

}
