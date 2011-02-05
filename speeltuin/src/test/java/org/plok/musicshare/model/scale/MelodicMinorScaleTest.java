package org.plok.musicshare.model.scale;

import org.junit.Test;
import org.plok.musicshare.model.pitch.Pitch;

/**
 * Test for all melodic minor scales.
 *
 * @author G.B.M. Rupert
 */
public class MelodicMinorScaleTest extends IntervalledScaleTest
{
	@Test
	public void testScale()
	{
		/*
		 * Setup test cases.
		 */
		final TestCase[] testCases = new TestCase[]
		{
			new TestCase( new MelodicMinorScale( Pitch.C_NATURAL ), "C - D - D# - F - G - A - B - C"    ),
			new TestCase( new MelodicMinorScale( Pitch.C_SHARP   ), "C# - D# - E - F# - G# - A# - C - C#" ),

			new TestCase( new MelodicMinorScale( Pitch.D_FLAT    ), "Db - D# - E - F# - G# - A# - C - Db" ),
			new TestCase( new MelodicMinorScale( Pitch.D_NATURAL ), "D - E - F - G - A - B - C# - D"    ),
			new TestCase( new MelodicMinorScale( Pitch.D_SHARP   ), "D# - F - F# - G# - A# - C - D - D#" ),

			new TestCase( new MelodicMinorScale( Pitch.E_FLAT    ), "Eb - F - F# - G# - A# - C - D - Eb" ),
			new TestCase( new MelodicMinorScale( Pitch.E_NATURAL ), "E - F# - G - A - B - C# - D# - E"    ),

			new TestCase( new MelodicMinorScale( Pitch.F_NATURAL ), "F - G - G# - A# - C - D - E - F"   ),
			new TestCase( new MelodicMinorScale( Pitch.F_SHARP   ), "F# - G# - A - B - C# - D# - F - F#"  ),

			new TestCase( new MelodicMinorScale( Pitch.G_FLAT    ), "Gb - G# - A - B - C# - D# - F - Gb"  ),
			new TestCase( new MelodicMinorScale( Pitch.G_NATURAL ), "G - A - A# - C - D - E - F# - G"   ),
			new TestCase( new MelodicMinorScale( Pitch.G_SHARP   ), "G# - A# - B - C# - D# - F - G - G#" ),

			new TestCase( new MelodicMinorScale( Pitch.A_FLAT    ), "Ab - A# - B - C# - D# - F - G - Ab" ),
			new TestCase( new MelodicMinorScale( Pitch.A_NATURAL ), "A - B - C - D - E - F# - G# - A"     ),
			new TestCase( new MelodicMinorScale( Pitch.A_SHARP   ), "A# - C - C# - D# - F - G - A - A#" ),

			new TestCase( new MelodicMinorScale( Pitch.B_FLAT    ), "Bb - C - C# - D# - F - G - A - Bb" ),
			new TestCase( new MelodicMinorScale( Pitch.B_NATURAL ), "B - C# - D - E - F# - G# - A# - B"   ),
		};

		/*
		 * Perform tests.
		 */
		performTests(testCases);
	}
}
