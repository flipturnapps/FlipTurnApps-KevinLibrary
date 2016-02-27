package com.flipturnapps.kevinLibrary.sprite.networked;

import com.flipturnapps.kevinLibrary.command.CommandIO;

public class NetSpriteCommandCreate extends NetSpriteCommandParent 
{

	@Override
	public String getName() 
	{
		return "create";
	}

	@Override
	public int getMaximumParams() 
	{
		return Integer.MAX_VALUE;
	}

	@Override
	public int getMinimumParams() 
	{
		return 2;
	}

	@Override
	protected void netSpriteExecute(String[] params, NetworkedSpritePanel panel) {
		int id = Integer.parseInt(params[0]);
		String[] newParams = new String[params.length -1];
		for (int i = 1; i < params.length; i++) 
		{
			newParams[i-1] = params[i];
		}
		panel.createNewSpriteWithId(id,newParams);
		
	}

	

}