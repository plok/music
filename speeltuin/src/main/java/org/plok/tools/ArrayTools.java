package org.plok.tools;

/**
 * @FIXME Need comment
 * @author G.B.M. Rupert
 */
public class ArrayTools
{
	public static <T> int indexOf( final T value , final T[] array )
	{
		if ( isNullOrEmpty(array) ) {
			return -1;
		}

		if ( value == null ) {
			for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
				if ( array[ i ] == null ) {
					return i;
				}
			}
		}
		else
		{
			for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
				final T item = array[i];
				if ( value.equals( item ) ) {
					return i;
				}
			}
		}

		return -1;
	}

	public static <T> boolean isNullOrEmpty( final T[] array )
	{
		return (array == null) || (array.length == 0);
	}
}
