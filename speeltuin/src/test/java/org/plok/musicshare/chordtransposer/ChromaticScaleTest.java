package org.plok.musicshare.chordtransposer;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.plok.musicshare.pitches.Pitch;
import org.plok.musicshare.pitches.Pitches;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class ChromaticScaleTest
{
	@Test
	public void testScale()
	{
		/*
		 * Test spec.
		 */
		class Test
		{
			public final ChromaticScale scale;

			public final String expectedOutput;

			Test(final ChromaticScale scale, final String expectedOutput)
			{
				this.scale = scale;
				this.expectedOutput = expectedOutput;
			}
		}

		/*
		 * Setup test cases.
		 */
		final List<Test> tests = new ArrayList<Test>();
		tests.add( new Test( new ChromaticScale( Pitches.C_NATURAL ), "C-C#-D-D#-E-F-F#-G-G#-A-A#-B" ) );
		tests.add( new Test( new ChromaticScale( Pitches.C_SHARP   ), "C#-D-D#-E-F-F#-G-G#-A-A#-B-C" ) );

		tests.add( new Test( new ChromaticScale( Pitches.D_FLAT    ), "Db-D-D#-E-F-F#-G-G#-A-A#-B-C" ) );
		tests.add( new Test( new ChromaticScale( Pitches.D_NATURAL ), "D-D#-E-F-F#-G-G#-A-A#-B-C-C#" ) );
		tests.add( new Test( new ChromaticScale( Pitches.D_SHARP   ), "D#-E-F-F#-G-G#-A-A#-B-C-C#-D" ) );

		tests.add( new Test( new ChromaticScale( Pitches.E_FLAT    ), "Eb-E-F-F#-G-G#-A-A#-B-C-C#-D" ) );
		tests.add( new Test( new ChromaticScale( Pitches.E_NATURAL ), "E-F-F#-G-G#-A-A#-B-C-C#-D-D#" ) );

		tests.add( new Test( new ChromaticScale( Pitches.F_NATURAL ), "F-F#-G-G#-A-A#-B-C-C#-D-D#-E" ) );
		tests.add( new Test( new ChromaticScale( Pitches.F_SHARP   ), "F#-G-G#-A-A#-B-C-C#-D-D#-E-F" ) );

		tests.add( new Test( new ChromaticScale( Pitches.G_FLAT    ), "Gb-G-G#-A-A#-B-C-C#-D-D#-E-F" ) );
		tests.add( new Test( new ChromaticScale( Pitches.G_NATURAL ), "G-G#-A-A#-B-C-C#-D-D#-E-F-F#" ) );
		tests.add( new Test( new ChromaticScale( Pitches.G_SHARP   ), "G#-A-A#-B-C-C#-D-D#-E-F-F#-G" ) );

		tests.add( new Test( new ChromaticScale( Pitches.A_FLAT    ), "Ab-A-A#-B-C-C#-D-D#-E-F-F#-G" ) );
		tests.add( new Test( new ChromaticScale( Pitches.A_NATURAL ), "A-A#-B-C-C#-D-D#-E-F-F#-G-G#" ) );
		tests.add( new Test( new ChromaticScale( Pitches.A_SHARP   ), "A#-B-C-C#-D-D#-E-F-F#-G-G#-A" ) );

		tests.add( new Test( new ChromaticScale( Pitches.B_FLAT    ), "Bb-B-C-C#-D-D#-E-F-F#-G-G#-A" ) );
		tests.add( new Test( new ChromaticScale( Pitches.B_NATURAL ), "B-C-C#-D-D#-E-F-F#-G-G#-A-A#" ) );

		/*
		 * Run tests.
		 */
		for (final Test test : tests)
		{
			final StringBuilder actualOutput = new StringBuilder();

			final Iterator<Pitch> iter = test.scale.iterator();
			while (iter.hasNext())
			{
				final Pitch pitch = iter.next();

				appendPitch( actualOutput, pitch );
				if ( iter.hasNext() )
				{
					actualOutput.append("-");
				}
			}

			Assert.assertEquals( test.expectedOutput, actualOutput.toString() );
		}
	}

	private void appendPitch(final StringBuilder target, final Pitch pitch)
	{
		target.append( pitch.getName() );

		final Pitch.Accidental accidental = pitch.getAccidental();
		if ( accidental == Pitch.Accidental.Sharp )
		{
			target.append( "#" );
		}
		else if ( accidental == Pitch.Accidental.Flat )
		{
			target.append( "b" );
		}
	}
}
