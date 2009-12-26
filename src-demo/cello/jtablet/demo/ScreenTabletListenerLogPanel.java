/*!
 * Copyright (c) 2009 Marcello Bastéa-Forte (marcello@cellosoft.com)
 * 
 * This software is provided 'as-is', without any express or implied
 * warranty. In no event will the authors be held liable for any damages
 * arising from the use of this software.
 * 
 * Permission is granted to anyone to use this software for any purpose,
 * including commercial applications, and to alter it and redistribute it
 * freely, subject to the following restrictions:
 * 
 *     1. The origin of this software must not be misrepresented; you must not
 *     claim that you wrote the original software. If you use this software
 *     in a product, an acknowledgment in the product documentation would be
 *     appreciated but is not required.
 * 
 *     2. Altered source versions must be plainly marked as such, and must not be
 *     misrepresented as being the original software.
 * 
 *     3. This notice may not be removed or altered from any source
 *     distribution.
 */

package cello.jtablet.demo;

import cello.jtablet.TabletManagerFactory;
import cello.jtablet.event.TabletEvent;
import cello.jtablet.event.TabletFunneler;

/**
 * Displays a list of events that occur on a given component.
 */
public class ScreenTabletListenerLogPanel extends AbstractLogPanel {

	/**
	 * Constructs a new DemoLogPanel that will listen for screen events.
	 */
	public ScreenTabletListenerLogPanel() {
		TabletManagerFactory.getManager().addScreenTabletListener(new TabletFunneler() {
			protected void handleEvent(TabletEvent ev) {
				logMessage(ev.toString());
			}		
		});
	}
}
