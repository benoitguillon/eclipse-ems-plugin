package org.bgi.ems.commons;

import org.eclipse.core.runtime.IPath;

public class EmsConstants {
	
	public static IPath getRulesDirectory(final IPath rootPath){
		return getResourcesDirectory(rootPath).append("rules");
	}
	
	public static IPath getResourcesDirectory(final IPath rootPath){
		return rootPath.append("src" + IPath.SEPARATOR + "main " + IPath.SEPARATOR + "resources");
	}

}
