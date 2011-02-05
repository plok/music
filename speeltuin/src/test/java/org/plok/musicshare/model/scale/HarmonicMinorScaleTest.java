package org.plok.musicshare.model.scale;

import org.junit.Test;
import org.plok.musicshare.model.pitch.Pitch;

/**
 * Test for all harmonic minor scales.
 *
 * @author G.B.M. Rupert
 */
public class HarmonicMinorScaleTest extends IntervalledScaleTest
{
	@Test
	public void testScale()
	{
		/*
		 * Setup test cases.
		 */
		final TestCase[] testCases = new TestCase[]
		{
			new TestCase( new HarmonicMinorScale( Pitch.C_NATURAL ), "C - D - D# - F - G - G# - B - C"    ),
			new TestCase( new HarmonicMinorScale( Pitch.C_SHARP   ), "C# - D# - E - F# - G# - A - C - C#" ),

			new TestCase( new HarmonicMinorScale( Pitch.D_FLAT    ), "Db - D# - E - F# - G# - A - C - Db" ),
			new TestCase( new HarmonicMinorScale( Pitch.D_NATURAL ), "D - E - F - G - A - A# - C# - D"    ),
			new TestCase( new HarmonicMinorScale( Pitch.D_SHARP   ), "D# - F - F# - G# - A# - B - D - D#" ),

			new TestCase( new HarmonicMinorScale( Pitch.E_FLAT    ), "Eb - F - F# - G# - A# - B - D - Eb" ),
			new TestCase( new HarmonicMinorScale( Pitch.E_NATURAL ), "E - F# - G - A - B - C - D# - E"    ),

			new TestCase( new HarmonicMinorScale( Pitch.F_NATURAL ), "F - G - G# - A# - C - C# - E - F"   ),
			new TestCase( new HarmonicMinorScale( Pitch.F_SHARP   ), "F# - G# - A - B - C# - D - F - F#"  ),

			new TestCase( new HarmonicMinorScale( Pitch.G_FLAT    ), "Gb - G# - A - B - C# - D - F - Gb"  ),
			new TestCase( new HarmonicMinorScale( Pitch.G_NATURAL ), "G - A - A# - C - D - D# - F# - G"   ),
			new TestCase( new HarmonicMinorScale( Pitch.G_SHARP   ), "G# - A# - B - C# - D# - E - G - G#" ),

			new TestCase( new HarmonicMinorScale( Pitch.A_FLAT    ), "Ab - A# - B - C# - D# - E - G - Ab" ),
			new TestCase( new HarmonicMinorScale( Pitch.A_NATURAL ), "A - B - C - D - E - F - G# - A"     ),
			new TestCase( new HarmonicMinorScale( Pitch.A_SHARP   ), "A# - C - C# - D# - F - F# - A - A#" ),

			new TestCase( new HarmonicMinorScale( Pitch.B_FLAT    ), "Bb - C - C# - D# - F - F# - A - Bb" ),
			new TestCase( new HarmonicMinorScale( Pitch.B_NATURAL ), "B - C# - D - E - F# - G - A# - B"   ),
		};

		/*
		 * Perform tests.
		 */
		performTests(testCases);
	}
}
