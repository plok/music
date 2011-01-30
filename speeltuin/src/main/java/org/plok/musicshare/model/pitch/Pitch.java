package org.plok.musicshare.model.pitch;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class Pitch
{
	public static final Pitch C_NATURAL = new Pitch(Name.C, Accidental.Natural);
	public static final Pitch C_SHARP = new Pitch(Name.C, Accidental.Sharp);

	public static final Pitch D_FLAT = new Pitch(Name.D, Accidental.Flat);
	public static final Pitch D_NATURAL = new Pitch(Name.D, Accidental.Natural);
	public static final Pitch D_SHARP = new Pitch(Name.D, Accidental.Sharp);

	public static final Pitch E_FLAT = new Pitch(Name.E, Accidental.Flat);
	public static final Pitch E_NATURAL = new Pitch(Name.E, Accidental.Natural);

	public static final Pitch F_NATURAL = new Pitch(Name.F, Accidental.Natural);
	public static final Pitch F_SHARP = new Pitch(Name.F, Accidental.Sharp);

	public static final Pitch G_FLAT = new Pitch(Name.G, Accidental.Flat);
	public static final Pitch G_NATURAL = new Pitch(Name.G, Accidental.Natural);
	public static final Pitch G_SHARP = new Pitch(Name.G, Accidental.Sharp);

	public static final Pitch A_FLAT = new Pitch(Name.A, Accidental.Flat);
	public static final Pitch A_NATURAL = new Pitch(Name.A, Accidental.Natural);
	public static final Pitch A_SHARP = new Pitch(Name.A, Accidental.Sharp);

	public static final Pitch B_FLAT = new Pitch(Name.B, Accidental.Flat);
	public static final Pitch B_NATURAL = new Pitch(Name.B, Accidental.Natural);

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
		p1.alias = p2;
		p2.alias = p1;
	}

	private final Name name;
	private final Accidental accidental;

	private Pitch alias;

	private Pitch(final Name name, final Accidental accidental)
	{
		this.name = name;
		this.accidental = accidental;
	}

	public Name getName()
	{
		return name;
	}

	public Accidental getAccidental()
	{
		return accidental;
	}

	public Pitch getAlias()
	{
		return alias;
	}

	@Override
	public String toString()
	{
		return "Pitch{" +
				"name=" + name +
				", accidental=" + accidental +
				", alias=" + alias +
				'}';
	}

	@Override
	public boolean equals(final Object o)
	{
		if (this == o) {
			return true;
		}
		if (!(o instanceof Pitch)) {
			return false;
		}

		final Pitch pitch = (Pitch) o;

		if (accidental != pitch.accidental) {
			return false;
		}
		if (name != pitch.name) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (accidental != null ? accidental.hashCode() : 0);
		return result;
	}
}
