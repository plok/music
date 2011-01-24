package org.plok.musicshare.scales;

import org.plok.musicshare.pitches.Pitch;

/**
* @FIXME Need comment
* @author G.B.M. Rupert
*/
public class MajorScale extends IntervalledScale
{
	private static final int[] intervals = new int[]{ 2 , 2 , 1 , 2 , 2 , 2 , 1 };

	public MajorScale( final Pitch pitch )
	{
		super( pitch , intervals );
	}
}
