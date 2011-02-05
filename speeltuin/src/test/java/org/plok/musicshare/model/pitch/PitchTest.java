package org.plok.musicshare.model.pitch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for the {@link Pitch class}.
 *
 * @author G.B.M. Rupert
 */
public class PitchTest
{
	@Test
	public void testAliases()
	{
		// Check all "black piano keys".
		checkAlias( Pitch.C_SHARP , Pitch.D_FLAT );
		checkAlias( Pitch.D_SHARP , Pitch.E_FLAT );
		checkAlias( Pitch.F_SHARP , Pitch.G_FLAT );
		checkAlias( Pitch.G_SHARP , Pitch.A_FLAT );
		checkAlias( Pitch.A_SHARP , Pitch.B_FLAT );

		// It should also work the other way around of course.
		checkAlias( Pitch.D_FLAT , Pitch.C_SHARP );
		checkAlias( Pitch.E_FLAT , Pitch.D_SHARP );
		checkAlias( Pitch.G_FLAT , Pitch.F_SHARP );
		checkAlias( Pitch.A_FLAT , Pitch.G_SHARP );
		checkAlias( Pitch.B_FLAT , Pitch.A_SHARP );
	}

	private void checkAlias( final Pitch pitch , final Pitch expectedAlias )
	{
		Assert.assertEquals( "Incorrect alias for pitch: '" + pitch + "'." , expectedAlias , pitch.getAlias() );
	}
}
