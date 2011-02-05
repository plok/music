package org.plok.musicshare.chordtransposer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.plok.tools.ArrayTools;

/**
 * Created by IntelliJ IDEA.
 * User: Gerwin
 * Date: 15-nov-2007
 * Time: 19:24:34
 * To change this template use File | Settings | File Templates.
 */
public class Chord
{
	private final String _chord;

	private final String _baseNote;

	private final String _addition;

	private final String _bassNote;

	public Chord(final String chord)
	{
		if (!isValid(chord)) {
			throw new IllegalArgumentException("Invalid chord specified: " + chord);
		}

		final Pattern chordPattern = Pattern.compile(ChordTools.getChordRegex());
		final Matcher chordMatcher = chordPattern.matcher(chord);

		chordMatcher.find();

		_chord    = chordMatcher.group( 0 ); /* C#sus2/Gb */
		_baseNote = chordMatcher.group( 1 ); /* C#        */
		         // chordMatcher.group( 2 ); /* C         */
		         // chordMatcher.group( 3 ); /* #         */
		_addition = chordMatcher.group( 4 ); /* sus2      */
		         // chordMatcher.group( 5 ); /* /Gb       */
		_bassNote = chordMatcher.group( 6 ); /* Gb        */
		         // chordMatcher.group( 7 ); /* G         */
		         // chordMatcher.group( 8 ); /* b         */
	}

	public static boolean isValid(final String chord)
	{
		final Pattern chordPattern = Pattern.compile(ChordTools.getChordRegex());
		final Matcher chordMatcher = chordPattern.matcher(chord);

		return chordMatcher.matches();
	}

	public String getChord()
	{
		return _chord;
	}

	public String getTransposedChord(final int transpose)
	{
		String result = _chord;

		if (transpose != 0) {
			result = getTransposedNote(_baseNote, transpose);

			if (_addition != null) {
				result += _addition;
			}

			if (_bassNote != null) {
				result += "/" + getTransposedNote(_bassNote, transpose);
			}
		}

		return result;
	}

	private static String getTransposedNote(final String note, final int transpose)
	{
		final String[] flatLadder = {"A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab"};
		final String[] crossLadder = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

		final int flatIndex = ArrayTools.indexOf(note, flatLadder);
		final int index = flatIndex >= 0 ? flatIndex : ArrayTools.indexOf(note, crossLadder);

		if (index < 0) {
			throw new IllegalArgumentException("No such note: " + note);
		}

		final int transposedIndex = index + transpose;
		final int realTransposedIndex;

		if (transposedIndex < 0) {
			realTransposedIndex = 12 + transposedIndex;
		}
		else if (transposedIndex > 11) {
			realTransposedIndex = transposedIndex - 12;
		}
		else {
			realTransposedIndex = transposedIndex;
		}

		return flatIndex >= 0 ? flatLadder[realTransposedIndex] : crossLadder[realTransposedIndex];
	}
}
