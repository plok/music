package org.plok.musicshare.chordtransposer;

import org.plok.musicshare.pitches.Pitch;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public interface Scale
{
	public Pitch next( Pitch p );

	public Pitch previous( Pitch p );
}
