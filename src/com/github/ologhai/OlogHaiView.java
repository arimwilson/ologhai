package com.github.ologhai;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class OlogHaiView extends SurfaceView implements SurfaceHolder.Callback {

	private final Context context;
	
	public OlogHaiView(Context context) {
		super(context);
		
		getHolder().addCallback(this);
		setKeepScreenOn(true);
		this.context= context;
	}

	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		
		
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		
	}

}
