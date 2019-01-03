package com.wxj.mvp.view;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wxj.mvp.BaseActivity;
import com.wxj.mvp.R;


/**
 * 网络请求loading图 Created by shixhe on 2017/10/18.
 */

public class LoadingDialog extends Dialog {

	private BaseActivity mActivity;

	private ImageView mImgLoading;

	private TextView mIdTvLoading;

	private RelativeLayout mIdLayoutDialog;

	private Animation mOperatingAnim;

	public LoadingDialog(BaseActivity activity) {
		super(activity, R.style.Dialog_bocop);
		this.mActivity = activity;
	}

	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_loading);
		initView();
	}

	private void initView() {
		mImgLoading = findViewById(R.id.img_loading);
		mIdTvLoading = findViewById(R.id.id_tv_loading);
		mIdLayoutDialog = findViewById(R.id.layout_dialog);
		mIdLayoutDialog.setOnClickListener(new View.OnClickListener() {

			@Override
            public void onClick(View v) {

			}
		});
		getWindow().setWindowAnimations(R.style.CustomProgressDialog);
	}

	@Override
    public void show() {
		if (mActivity != null && !mActivity.isFinishing()) {
			super.show();
			showLoading();
		}
	}

	private void showLoading() {
		// this.show();
		Window window = this.getWindow();
		WindowManager.LayoutParams lp = window.getAttributes();
		lp.width = WindowManager.LayoutParams.MATCH_PARENT;
		lp.height = WindowManager.LayoutParams.MATCH_PARENT;
		// window.setGravity(Gravity.CENTER);
		window.setAttributes(lp);
		window.setWindowAnimations(R.style.loadingWindowAnim);
		if (Build.VERSION.SDK_INT >= 21) {
			View decorView = getWindow().getDecorView();
			int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
			decorView.setSystemUiVisibility(option);
			getWindow().setStatusBarColor(Color.TRANSPARENT);
		}
		setCanceledOnTouchOutside(false);
		mOperatingAnim = AnimationUtils.loadAnimation(mActivity, R.anim.anim_circle);
		LinearInterpolator lin = new LinearInterpolator();
		mOperatingAnim.setInterpolator(lin);
		mImgLoading.startAnimation(mOperatingAnim);
	}

	@Override
    public void hide() {
		super.hide();
	}

	@Override
    protected void onStop() {
		super.onStop();
		if (mOperatingAnim != null) {
			mOperatingAnim.cancel();
		}
	}

	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
		}
		return false;
	}

}
