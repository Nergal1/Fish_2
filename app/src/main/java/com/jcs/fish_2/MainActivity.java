package com.jcs.fish_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.anenn.flowlikeviewlib.FlowLikeView;

public class MainActivity extends Activity {
	private FlowLikeView likeViewLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
	}

	private void initView() {
		likeViewLayout = (FlowLikeView) findViewById(R.id.flowLikeView);
	}

	public void addLikeView(View view) {
		likeViewLayout.addLikeView();
	}
}
