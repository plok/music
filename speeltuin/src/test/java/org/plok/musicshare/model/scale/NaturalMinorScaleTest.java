package org.plok.musicshare.model.scale;

import org.junit.Test;
import org.plok.musicshare.model.pitch.Pitch;

/**
 * Test for all natural minor scales.
 *
 * @author G.B.M. Rupert
 */
public class NaturalMinorScaleTest extends IntervalledScaleTest
{
	@Test
	public void testScale()
	{
		/*
		 * Setup test cases.
		 */
		final TestCase[] testCases = new TestCase[]
		{
			new TestCase( new NaturalMinorScale( Pitch.C_NATURAL ), "C - D - D# - F - G - G# - A# - C"    ),
			new TestCase( new NaturalMinorScale( Pitch.C_SHARP   ), "C# - D# - E - F# - G# - A - B - C#"  ),

			new TestCase( new NaturalMinorScale( Pitch.D_FLAT    ), "Db - D# - E - F# - G# - A - B - Db"  ),
			new TestCase( new NaturalMinorScale( Pitch.D_NATURAL ), "D - E - F - G - A - A# - C - D"      ),
			new TestCase( new NaturalMinorScale( Pitch.D_SHARP   ), "D# - F - F# - G# - A# - B - C# - D#" ),

			new TestCase( new NaturalMinorScale( Pitch.E_FLAT    ), "Eb - F - F# - G# - A# - B - C# - Eb" ),
			new TestCase( new NaturalMinorScale( Pitch.E_NATURAL ), "E - F# - G - A - B - C - D - E"      ),

			new TestCase( new NaturalMinorScale( Pitch.F_NATURAL ), "F - G - G# - A# - C - C# - D# - F"   ),
			new TestCase( new NaturalMinorScale( Pitch.F_SHARP   ), "F# - G# - A - B - C# - D - E - F#"   ),

			new TestCase( new NaturalMinorScale( Pitch.G_FLAT    ), "Gb - G# - A - B - C# - D - E - Gb"   ),
			new TestCase( new NaturalMinorScale( Pitch.G_NATURAL ), "G - A - A# - C - D - D# - F - G"     ),
			new TestCase( new NaturalMinorScale( Pitch.G_SHARP   ), "G# - A# - B - C# - D# - E - F# - G#" ),

			new TestCase( new NaturalMinorScale( Pitch.A_FLAT    ), "Ab - A# - B - C# - D# - E - F# - Ab" ),
			new TestCase( new NaturalMinorScale( Pitch.A_NATURAL ), "A - B - C - D - E - F - G - A"       ),
			new TestCase( new NaturalMinorScale( Pitch.A_SHARP   ), "A# - C - C# - D# - F - F# - G# - A#" ),

			new TestCase( new NaturalMinorScale( Pitch.B_FLAT    ), "Bb - C - C# - D# - F - F# - G# - Bb" ),
			new TestCase( new NaturalMinorScale( Pitch.B_NATURAL ), "B - C# - D - E - F# - G - A - B"     ),
		};

		/*
		 * Perform tests.
		 */
		performTests(testCases);
	}
}
