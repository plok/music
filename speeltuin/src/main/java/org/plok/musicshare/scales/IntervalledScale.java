package org.plok.musicshare.scales;

import java.util.ArrayList;
import java.util.List;

import org.plok.musicshare.chordtransposer.ChromaticScale;
import org.plok.musicshare.pitches.Pitch;

/**
* @FIXME Need comment
* @author G.B.M. Rupert
*/
public abstract class IntervalledScale
{
	private final List<Pitch> scale;

	IntervalledScale( final Pitch pitch , final int... intervals )
	{
		this.scale = new ArrayList<Pitch>( intervals.length );

		Pitch p = pitch;
		for (final int interval : intervals) {
			this.scale.add( pitch );

			p = ChromaticScale.transpose( p , interval );
		}
	}

	public Pitch getPitch()
	{
		return scale.get( 0 );
	}
}
