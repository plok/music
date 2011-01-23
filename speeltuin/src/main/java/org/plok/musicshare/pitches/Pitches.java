package org.plok.musicshare.pitches;

/**
 * All pitches used in common western music.
 *
 * @author G.B.M. Rupert
 */
public class Pitches
{
	public static final Pitch C_NATURAL = new Pitch(Pitch.Name.C, Pitch.Accidental.Natural);
	public static final Pitch C_SHARP = new Pitch(Pitch.Name.C, Pitch.Accidental.Sharp);

	public static final Pitch D_FLAT = new Pitch(Pitch.Name.D, Pitch.Accidental.Flat);
	public static final Pitch D_NATURAL = new Pitch(Pitch.Name.D, Pitch.Accidental.Natural);
	public static final Pitch D_SHARP = new Pitch(Pitch.Name.D, Pitch.Accidental.Sharp);

	public static final Pitch E_FLAT = new Pitch(Pitch.Name.E, Pitch.Accidental.Flat);
	public static final Pitch E_NATURAL = new Pitch(Pitch.Name.E, Pitch.Accidental.Natural);

	public static final Pitch F_NATURAL = new Pitch(Pitch.Name.F, Pitch.Accidental.Natural);
	public static final Pitch F_SHARP = new Pitch(Pitch.Name.F, Pitch.Accidental.Sharp);

	public static final Pitch G_FLAT = new Pitch(Pitch.Name.G, Pitch.Accidental.Flat);
	public static final Pitch G_NATURAL = new Pitch(Pitch.Name.G, Pitch.Accidental.Natural);
	public static final Pitch G_SHARP = new Pitch(Pitch.Name.G, Pitch.Accidental.Sharp);

	public static final Pitch A_FLAT = new Pitch(Pitch.Name.A, Pitch.Accidental.Flat);
	public static final Pitch A_NATURAL = new Pitch(Pitch.Name.A, Pitch.Accidental.Natural);
	public static final Pitch A_SHARP = new Pitch(Pitch.Name.A, Pitch.Accidental.Sharp);

	public static final Pitch B_FLAT = new Pitch(Pitch.Name.B, Pitch.Accidental.Flat);
	public static final Pitch B_NATURAL = new Pitch(Pitch.Name.B, Pitch.Accidental.Natural);

	/*
	 * Setup aliases.
	 */
	static
	{
		makeAlias( C_SHARP , D_FLAT );
		makeAlias( D_SHARP , E_FLAT );
		makeAlias( F_SHARP , G_FLAT );
		makeAlias( G_SHARP , A_FLAT );
		makeAlias( A_SHARP , B_FLAT );
	}

	private static void makeAlias( final Pitch p1 , final Pitch p2 )
	{
		p1.setAlias( p2 );
		p2.setAlias( p1 );
	}
}
