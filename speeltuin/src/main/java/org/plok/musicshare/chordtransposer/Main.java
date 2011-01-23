package org.plok.musicshare.chordtransposer;

import java.util.Iterator;

import org.plok.musicshare.pitches.Pitch;
import org.plok.musicshare.pitches.Pitches;

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


		printScale(new ChromaticScale( Pitches.C_NATURAL ));
		printScale(new ChromaticScale( Pitches.E_FLAT ));
		printScale(new ChromaticScale( Pitches.A_SHARP ));
	}

	private static void printScale(final ChromaticScale scale)
	{
		System.out.print( "\n\nChromatic scale in " );
		printPitch( scale.getPitch() );
		System.out.println( "" );

		final Iterator<Pitch> iterator = scale.iterator();
		while (iterator.hasNext()) {
			Pitch p = iterator.next();
			printPitch(p);

			if ( iterator.hasNext() ) {
				System.out.print( " - " );
			}

			p = scale.next( p );
		}
		System.out.println( "" );
	}

	private static void printPitch(final Pitch p)
	{
		System.out.print( p.getName() );

		final Pitch.Accidental a = p.getAccidental();
		if ( a == Pitch.Accidental.Flat ) {
			System.out.print( "b" );
		}
		else if ( a == Pitch.Accidental.Sharp ) {
			System.out.print( "#" );
		}
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
