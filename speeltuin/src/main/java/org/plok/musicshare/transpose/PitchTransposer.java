package org.plok.musicshare.transpose;

import java.util.ArrayList;
import java.util.List;

import org.plok.musicshare.model.pitch.Pitch;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class PitchTransposer
{
	public static final List<Pitch> pitches = new ArrayList<Pitch>();
	static
	{
		pitches.add(Pitch.C_NATURAL);
		pitches.add(Pitch.C_SHARP);
		pitches.add(Pitch.D_NATURAL);
		pitches.add(Pitch.D_SHARP);
		pitches.add(Pitch.E_NATURAL);
		pitches.add(Pitch.F_NATURAL);
		pitches.add(Pitch.F_SHARP);
		pitches.add(Pitch.G_NATURAL);
		pitches.add(Pitch.G_SHARP);
		pitches.add(Pitch.A_NATURAL);
		pitches.add(Pitch.A_SHARP);
		pitches.add(Pitch.B_NATURAL);
	}

	// Not supposed to be instantiated.
	private PitchTransposer()
	{

	}

	public static Pitch transpose( final Pitch p , final int semitones )
	{
		int index = pitches.indexOf( p );
		if ( index == -1 ) {
			index = pitches.indexOf( p.getAlias() );
		}

		if ( index == -1 ) {
			throw new IllegalArgumentException( "Invalid/unsupported pitch: " + p );
		}

		final int transposedIndex = index + semitones;
		if ( transposedIndex > 11 )
		{
			return pitches.get( transposedIndex - 12 );
		}
		else if ( transposedIndex < 0 )
		{
			return pitches.get( transposedIndex + 12 );
		}
		else
		{
			return pitches.get( transposedIndex );
		}
	}
}
