package org.plok.musicshare.chordtransposer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.plok.musicshare.pitches.Pitch;
import org.plok.musicshare.pitches.Pitches;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class ChromaticScale implements Scale
{
	public static final List<Pitch> scalePitches = new ArrayList<Pitch>();
	static
	{
		scalePitches.add(Pitches.C_NATURAL);
		scalePitches.add(Pitches.C_SHARP);
		scalePitches.add(Pitches.D_NATURAL);
		scalePitches.add(Pitches.D_SHARP);
		scalePitches.add(Pitches.E_NATURAL);
		scalePitches.add(Pitches.F_NATURAL);
		scalePitches.add(Pitches.F_SHARP);
		scalePitches.add(Pitches.G_NATURAL);
		scalePitches.add(Pitches.G_SHARP);
		scalePitches.add(Pitches.A_NATURAL);
		scalePitches.add(Pitches.A_SHARP);
		scalePitches.add(Pitches.B_NATURAL);
	}

	private final List<Pitch> scale;

	public ChromaticScale( final Pitch pitch )
	{
		this.scale = new ArrayList<Pitch>(12);

		Pitch p = pitch;
		for ( int i = 0 ; i < 12 ; i++ )
		{
			this.scale.add( p );
			p = next( p );
		}
	}

	public Iterator<Pitch> iterator()
	{
		return this.scale.iterator();
	}

	public Pitch getPitch()
	{
		return this.scale.get( 0 );
	}

	public Pitch next( final Pitch p )
	{
		return transpose( p , 1 );
	}

	public Pitch previous( final Pitch p )
	{
		return transpose( p , -1 );
	}

	public static Pitch transpose( final Pitch p , final int semitones )
	{
		int index = scalePitches.indexOf( p );
		if ( index == -1 ) {
			index = scalePitches.indexOf( p.getAlias() );
		}

		if ( index == -1 ) {
			throw new IllegalArgumentException( "Invalid/unsupported pitch: " + p );
		}

		final int transposedIndex = index + semitones;
		if ( transposedIndex > 11 )
		{
			return scalePitches.get( transposedIndex - 12 );
		}
		else if ( transposedIndex < 0 )
		{
			return scalePitches.get( transposedIndex + 12 );
		}
		else
		{
			return scalePitches.get( transposedIndex );
		}
	}
}
