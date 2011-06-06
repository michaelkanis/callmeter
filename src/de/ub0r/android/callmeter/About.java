/*
 * Copyright (C) 2010 Felix Bechstein
 * 
 * This file is part of CallMeter NG.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; If not, see <http://www.gnu.org/licenses/>.
 */
package de.ub0r.android.callmeter;

import android.app.Activity;
import android.os.Bundle;

/**
 * Display About {@link Activity}.
 * 
 * @author flx
 */
public class About extends Activity {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public final void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTheme(Preferences.getTheme(this));
		this.setContentView(R.layout.about);
		this.setTitle(this.getString(R.string.about_) + " "
				+ this.getString(R.string.app_name) + " v"
				+ this.getString(R.string.app_version));
	}
}
