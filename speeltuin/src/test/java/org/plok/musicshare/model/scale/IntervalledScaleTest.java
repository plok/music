package org.plok.musicshare.model.scale;

import junit.framework.Assert;

import java.util.Iterator;

import org.plok.musicshare.model.pitch.Accidental;
import org.plok.musicshare.model.pitch.Pitch;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public abstract class IntervalledScaleTest
{
	protected class TestCase
	{
		public final IntervalledScale input;

		public final String expectedOutput;

		TestCase(final IntervalledScale input, final String expectedOutput)
		{
			this.input = input;
			this.expectedOutput = expectedOutput;
		}
	}

	protected void performTests( final TestCase[] testCases )
	{
		for (final TestCase testCase : testCases)
		{
			final String scaleName = testCase.input.getClass().getName();
			final Pitch scalePitch = testCase.input.getPitch();

			performTest("Incorrect " + scaleName + " for pitch: '" + scalePitch + "'.", testCase);
		}
	}

	protected void performTest( final String message , final TestCase testCase )
	{
		final String expectedOutput = testCase.expectedOutput;
		final String actualOutput = buildOutputString(testCase.input);

		Assert.assertEquals(message, expectedOutput, actualOutput );
	}

	private String buildOutputString(final IntervalledScale scale)
	{
		final StringBuilder result = new StringBuilder();

		// Create string for one scale cycle.
		final Iterator<Pitch> pitches = scale.iterator();
		while (pitches.hasNext())
		{
			final Pitch pitch = pitches.next();

			appendPitch( result, pitch );
			result.append(" - ");
		}

		// After a scale cycle, it should start with the scale's pitch again.
		appendPitch( result , scale.getPitch() );

		return result.toString();
	}

	private void appendPitch(final StringBuilder target, final Pitch pitch)
	{
		target.append( pitch.getName() );

		final Accidental accidental = pitch.getAccidental();
		if ( accidental == Accidental.Sharp )
		{
			target.append( "#" );
		}
		else if ( accidental == Accidental.Flat )
		{
			target.append( "b" );
		}
	}
}
