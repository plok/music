package org.plok.musicshare.model.scale;

import org.junit.Test;
import org.plok.musicshare.model.pitch.Pitch;

/**
 * Test for all chromatic scales.
 *
 * @author G.B.M. Rupert
 */
public class ChromaticScaleTest extends IntervalledScaleTest
{
	@Test
	public void testScale()
	{
		/*
		 * Setup test cases.
		 */
		final TestCase[] testCases = new TestCase[]
		{
			new TestCase( new ChromaticScale( Pitch.C_NATURAL ), "C - C# - D - D# - E - F - F# - G - G# - A - A# - B - C"  ),
			new TestCase( new ChromaticScale( Pitch.C_SHARP   ), "C# - D - D# - E - F - F# - G - G# - A - A# - B - C - C#" ),

			new TestCase( new ChromaticScale( Pitch.D_FLAT    ), "Db - D - D# - E - F - F# - G - G# - A - A# - B - C - Db" ),
			new TestCase( new ChromaticScale( Pitch.D_NATURAL ), "D - D# - E - F - F# - G - G# - A - A# - B - C - C# - D"  ),
			new TestCase( new ChromaticScale( Pitch.D_SHARP   ), "D# - E - F - F# - G - G# - A - A# - B - C - C# - D - D#" ),

			new TestCase( new ChromaticScale( Pitch.E_FLAT    ), "Eb - E - F - F# - G - G# - A - A# - B - C - C# - D - Eb" ),
			new TestCase( new ChromaticScale( Pitch.E_NATURAL ), "E - F - F# - G - G# - A - A# - B - C - C# - D - D# - E"  ),

			new TestCase( new ChromaticScale( Pitch.F_NATURAL ), "F - F# - G - G# - A - A# - B - C - C# - D - D# - E - F"  ),
			new TestCase( new ChromaticScale( Pitch.F_SHARP   ), "F# - G - G# - A - A# - B - C - C# - D - D# - E - F - F#" ),

			new TestCase( new ChromaticScale( Pitch.G_FLAT    ), "Gb - G - G# - A - A# - B - C - C# - D - D# - E - F - Gb" ),
			new TestCase( new ChromaticScale( Pitch.G_NATURAL ), "G - G# - A - A# - B - C - C# - D - D# - E - F - F# - G"  ),
			new TestCase( new ChromaticScale( Pitch.G_SHARP   ), "G# - A - A# - B - C - C# - D - D# - E - F - F# - G - G#" ),

			new TestCase( new ChromaticScale( Pitch.A_FLAT    ), "Ab - A - A# - B - C - C# - D - D# - E - F - F# - G - Ab" ),
			new TestCase( new ChromaticScale( Pitch.A_NATURAL ), "A - A# - B - C - C# - D - D# - E - F - F# - G - G# - A"  ),
			new TestCase( new ChromaticScale( Pitch.A_SHARP   ), "A# - B - C - C# - D - D# - E - F - F# - G - G# - A - A#" ),

			new TestCase( new ChromaticScale( Pitch.B_FLAT    ), "Bb - B - C - C# - D - D# - E - F - F# - G - G# - A - Bb" ),
			new TestCase( new ChromaticScale( Pitch.B_NATURAL ), "B - C - C# - D - D# - E - F - F# - G - G# - A - A# - B"  ),
		};

		/*
		 * Perform tests.
		 */
		performTests(testCases);
	}
}
