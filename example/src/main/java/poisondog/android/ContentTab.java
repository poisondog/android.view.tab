/*
 * Copyright (C) 2017 Adam Huang <poisondog@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package poisondog.android;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import poisondog.android.view.tab.design.Tab;

/**
 * @author Adam Huang
 * @since 2017-04-19
 */
public class ContentTab implements Tab {
	private LayoutInflater mInflater;

	/**
	 * Constructor
	 */
	public ContentTab(LayoutInflater inflater) {
		mInflater = inflater;
	}

	@Override
	public CharSequence getTitle() {
		return "demo";
	}

	@Override
	public View getContent() {
		return mInflater.inflate(R.layout.content, null);
	}

	@Override
	public View getTitleView() {
		TextView text = new TextView(mInflater.getContext());
		text.setText("demo");
		text.setGravity(Gravity.CENTER);
		return text;
	}

}