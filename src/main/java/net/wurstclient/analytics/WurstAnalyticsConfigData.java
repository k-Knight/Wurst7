/*
 * Copyright (C) 2014 - 2019 | Wurst-Imperium | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.analytics;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import net.wurstclient.analytics.dmurph.AnalyticsConfigData;
import net.wurstclient.analytics.dmurph.VisitorData;

public final class WurstAnalyticsConfigData extends AnalyticsConfigData
{
	public WurstAnalyticsConfigData(String argTrackingCode)
	{
		super(argTrackingCode, VisitorData.newVisitor());
		
		try
		{
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			setScreenResolution(screen.width + "x" + screen.height);
			
		}catch(HeadlessException e)
		{
			System.err.println("Couldn't determine screen size!");
			e.printStackTrace();
		}
	}
}