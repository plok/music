package org.plok.musicshare.transpose;

import org.plok.musicshare.model.Chord;
import org.plok.musicshare.model.pitch.Pitch;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class ChordTransposer
{
	// Not supposed to be instantiated.
	private ChordTransposer()
	{

	}

	public Chord transpose( final Chord chord , final int semitones )
	{
		final Pitch transposedPitch;
		{
			final Pitch pitch = chord.getPitch();
			transposedPitch = PitchTransposer.transpose(pitch, semitones);
		}

		final Pitch transposedBassPitch;
		{
			final Pitch bassPitch = chord.getBassPitch();
			transposedBassPitch = (bassPitch == null) ? null : PitchTransposer.transpose(bassPitch, semitones);
		}

		return new Chord( transposedPitch , chord.getAddition(), transposedBassPitch );
	}
}
