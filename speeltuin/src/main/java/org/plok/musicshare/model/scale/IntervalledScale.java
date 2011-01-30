package org.plok.musicshare.model.scale;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.plok.musicshare.model.pitch.Pitch;
import org.plok.musicshare.transpose.PitchTransposer;

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
			this.scale.add( p );

			p = PitchTransposer.transpose( p , interval );
		}
	}

	public Pitch getPitch()
	{
		return scale.get( 0 );
	}

	public Iterator iterator()
	{
		return scale.iterator();
	}

	public Pitch next( final Pitch pitch )
	{
		throw new AssertionError( "Not yet implemented." );
	}

	public Pitch previous( final Pitch pitch )
	{
		throw new AssertionError( "Not yet implemented." );
	}
}
