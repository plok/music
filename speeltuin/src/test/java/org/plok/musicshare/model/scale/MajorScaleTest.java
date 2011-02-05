package org.plok.musicshare.model.scale;

import org.junit.Test;
import org.plok.musicshare.model.pitch.Pitch;

/**
 * Test for all major scales.
 *
 * @author G.B.M. Rupert
 */
public class MajorScaleTest extends IntervalledScaleTest
{
	@Test
	public void testScale()
	{
		/*
		 * Setup test cases.
		 */
		final TestCase[] testCases = new TestCase[]
		{
			new TestCase( new MajorScale( Pitch.C_NATURAL ), "C - D - E - F - G - A - B - C"       ),
			new TestCase( new MajorScale( Pitch.C_SHARP   ), "C# - D# - F - F# - G# - A# - C - C#" ),

			new TestCase( new MajorScale( Pitch.D_FLAT    ), "Db - D# - F - F# - G# - A# - C - Db" ),
			new TestCase( new MajorScale( Pitch.D_NATURAL ), "D - E - F# - G - A - B - C# - D"     ),
			new TestCase( new MajorScale( Pitch.D_SHARP   ), "D# - F - G - G# - A# - C - D - D#"   ),

			new TestCase( new MajorScale( Pitch.E_FLAT    ), "Eb - F - G - G# - A# - C - D - Eb"   ),
			new TestCase( new MajorScale( Pitch.E_NATURAL ), "E - F# - G# - A - B - C# - D# - E"   ),

			new TestCase( new MajorScale( Pitch.F_NATURAL ), "F - G - A - A# - C - D - E - F"      ),
			new TestCase( new MajorScale( Pitch.F_SHARP   ), "F# - G# - A# - B - C# - D# - F - F#" ),

			new TestCase( new MajorScale( Pitch.G_FLAT    ), "Gb - G# - A# - B - C# - D# - F - Gb" ),
			new TestCase( new MajorScale( Pitch.G_NATURAL ), "G - A - B - C - D - E - F# - G"      ),
			new TestCase( new MajorScale( Pitch.G_SHARP   ), "G# - A# - C - C# - D# - F - G - G#"  ),

			new TestCase( new MajorScale( Pitch.A_FLAT    ), "Ab - A# - C - C# - D# - F - G - Ab"  ),
			new TestCase( new MajorScale( Pitch.A_NATURAL ), "A - B - C# - D - E - F# - G# - A"    ),
			new TestCase( new MajorScale( Pitch.A_SHARP   ), "A# - C - D - D# - F - G - A - A#"    ),

			new TestCase( new MajorScale( Pitch.B_FLAT    ), "Bb - C - D - D# - F - G - A - Bb"    ),
			new TestCase( new MajorScale( Pitch.B_NATURAL ), "B - C# - D# - E - F# - G# - A# - B"  ),
		};

		/*
		 * Perform tests.
		 */
		performTests(testCases);
	}
}
