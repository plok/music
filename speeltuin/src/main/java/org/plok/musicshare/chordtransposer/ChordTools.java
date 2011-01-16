package org.plok.musicshare.chordtransposer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: Gerwin
 * Date: 27-okt-2007
 * Time: 19:12:52
 * To change this template use File | Settings | File Templates.
 */
public class ChordTools
{
	public static final String[] ADDITIONS = new String[]
	{
			"maj7", "maj",
			"m7", "m",
			"aug",
			"dim7", "dim",
			"sus4",
			"sus2",
			"add9",
			"7"
	};

	protected static String getChordRegex()
	{
		final StringBuilder regexBuilder = new StringBuilder();

		/*
		 * Base note.
		 */
		regexBuilder.append("(([ABCDEFG])(b|#)?){1}");

		/*
		 * Additions
		 */
		regexBuilder.append('(');
		for (int i = 0; i < ADDITIONS.length; i++) {
			if (i != 0) {
				regexBuilder.append('|');
			}

			regexBuilder.append(ADDITIONS[i]);
		}
		regexBuilder.append(")?");

		/*
		 * Bass note.
		 */
		regexBuilder.append("(/(([ABCDEFG])(b)?(#)?))?"); // Bass note

		return regexBuilder.toString();
	}

	public static List<Chord> getChords(final String text)
	{
		final Pattern chordPattern = Pattern.compile("\\[(" + getChordRegex() + ")\\]");
		final Matcher chordMatcher = chordPattern.matcher(text);

		final Set<String> chords = new HashSet<String>();

		while (chordMatcher.find()) {
			chords.add(chordMatcher.group(1));
		}

		final List<Chord> result = new ArrayList<Chord>(chords.size());

		for (final String chord : chords) {
			result.add(new Chord(chord));
		}

		return result;
	}

	public static String transposeChords(final String text, final int transpose )
	{
		String result = text;

		final List<Chord> chords = getChords(text);

		for (final Chord chord : chords) {
			result = result.replaceAll("\\[" + chord.getChord() + "\\]", chord.getTransposedChord(transpose) );
		}

		return result;
	}
}
