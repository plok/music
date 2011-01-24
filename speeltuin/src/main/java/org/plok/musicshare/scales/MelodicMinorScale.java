package org.plok.musicshare.scales;

import org.plok.musicshare.pitches.Pitch;

/**
* @FIXME Need comment
* @author G.B.M. Rupert
*/
public class MelodicMinorScale extends IntervalledScale
{
	private static final int[] intervals = new int[]{ 2 , 1 , 2 , 2 , 2 , 2 , 1 };

	public MelodicMinorScale( final Pitch pitch )
	{
		super( pitch , intervals );
	}
}
