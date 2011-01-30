package org.plok.musicshare.model;

import org.plok.musicshare.model.pitch.Pitch;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class Chord
{
	private final Pitch pitch;

	private final String addition;

	private final Pitch bassPitch;

	public Chord(final Pitch pitch, final String addition, final Pitch bassPitch)
	{
		this.pitch = pitch;
		this.addition = addition;
		this.bassPitch = bassPitch;
	}

	public Pitch getPitch()
	{
		return pitch;
	}

	public String getAddition()
	{
		return addition;
	}

	public Pitch getBassPitch()
	{
		return bassPitch;
	}
}
