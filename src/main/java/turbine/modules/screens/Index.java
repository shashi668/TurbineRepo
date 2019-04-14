package turbine.modules.screens;


import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;

import org.apache.turbine.modules.screens.VelocitySecureScreen;

/**
 * This class provides the data required for displaying content in the
 * Velocity page. 
 */
public class Index extends VelocitySecureScreen
{
	/**
	 * This method is called by the Turbine framework when the
	 * associated Velocity template, Index.vm is requested
	 * 
	 * @param data the Turbine request data
	 * @param context the Velocity context
	 * @throws Exception a generic Exception
	 */
	@Override
	protected void doBuildTemplate(RunData data, Context context)
			throws Exception
	{
		
		String html; 
		html="<html><head><title>Simple Page</title></head>"; 
		html+="<body bgcolor='#ff00ff'><hr/><font size=50>This is Html content</font><hr/>"; 
		html+="<table id='first' border=2 bgcolor='#80ff00'><tr><td>Application</td><td>Devops</td><tr><td>Database</td><td>Apponix</td></tr></table>";
		html+="</body></html>";
		context.put("success", "Congratulations, it worked!"+html);

	}

	/**
	 * This method is called bythe Turbine framework to determine if
	 * the current user is allowed to use this screen. If this method
	 * returns false, the doBuildTemplate() method will not be called.
	 * If a redirect to some "access denied" page is required, do the
	 * necessary redirect here.
	 * 
	 * @param data the Turbine request data
	 * @return true if this screen may be accessed
	 * @throws Exception a generic Exception
	 */
	@Override
	protected boolean isAuthorized(RunData data) throws Exception
	{
		// use data.getACL() 
		return true;
	}
}
