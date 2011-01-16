package org.plok.musicshare.chordtransposer;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class Main
{
	public static void main(String[] args)
	{
		System.out.println( "\n===[ no transpose ]==================" );
		System.out.println( ChordTools.transposeChords( input , 0 ) );

		System.out.println( "\n===[ transpose: 4 ]==================" );
		System.out.println( ChordTools.transposeChords( input , 4  ) );

		System.out.println( "\n===[ transpose: -5 ]=================" );
		System.out.println( ChordTools.transposeChords( input , -5  ) );
	}

	private static String input =
			"[C]               [Fmaj7]             [C]                   [F]\n" +
			"I would like to leave this city, this old town don't smell too pretty,\n" +
			"    [C]     [C/B]        [Am]          [D7]                 [F]\n" +
			"And I can feel the warning signs running around my mind,\n" +
			"[C]          [Fmaj7]                    [C]                 [Fmaj7]\n" +
			"And when I leave this island, I'll book myself into a soul asylum,\n" +
			"[C]            [C/B]        [Am]          [D7]                 [F]\n" +
			"'Cause I can feel the warning signs running around my mind.";

}
