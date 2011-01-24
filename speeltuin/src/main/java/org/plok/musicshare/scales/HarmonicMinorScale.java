package org.plok.musicshare.scales;

import org.plok.musicshare.pitches.Pitch;

/**
* @FIXME Need comment
* @author G.B.M. Rupert
*/
public class HarmonicMinorScale extends IntervalledScale
{
	private static final int[] intervals = new int[]{ 2 , 1 , 2 , 2 , 1 , 3 , 1 };

	public HarmonicMinorScale( final Pitch pitch )
	{
		super( pitch , intervals );
	}
}
