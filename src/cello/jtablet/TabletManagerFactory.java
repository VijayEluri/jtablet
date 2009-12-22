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

package cello.jtablet;

import java.util.Collections;
import java.util.Map;

import cello.jtablet.impl.jpen.JPenTabletManager;

/**
 * Manages tablet implementations.
 * 
 * @author marcello
 */
public class TabletManagerFactory {
	
	private static TabletInterface tabletInterface = getManager(Collections.<String,Object>emptyMap());
	
	/**
	 * @return tablet interface 
	 */
	public static TabletInterface getManager() {
		return tabletInterface;
	}
	/**
	 * @param hints 
	 * @return tablet interface 
	 */
	public static TabletInterface getManager(Map<String,Object> hints) {
		return new JPenTabletManager(hints);
	}
}