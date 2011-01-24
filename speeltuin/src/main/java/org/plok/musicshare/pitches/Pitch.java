package org.plok.musicshare.pitches;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class Pitch
{
	public enum Name
	{
		A,B,C,D,E,F,G
	}

	public enum Accidental
	{
		Flat,
		Natural,
		Sharp
	}

	private final Name name;
	private final Accidental accidental;

	private Pitch alias;


	// A pitch also has a specific frequency.

	protected Pitch(final Name name, final Accidental accidental)
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

	public void setAlias(final Pitch alias)
	{
		this.alias = alias;
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
