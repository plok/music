package org.plok.musicshare.model.scale;

import org.plok.musicshare.model.pitch.Pitch;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class ChromaticScale extends IntervalledScale
{
	private static final int[] intervals = new int[]{ 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 };

	public ChromaticScale( final Pitch pitch )
	{
		super( pitch , intervals );
	}
}
