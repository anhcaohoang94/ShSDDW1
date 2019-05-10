
public class PrintCharacters {
	
	public static void main( String args [ ] ) {
		String word = args[ 0 ];
		char [ ] arrChars = word.toCharArray( );
		for ( int i = arrChars.length -1  ; i >=0 ; i -- ) {
			System.out.print( arrChars[ i ] );
		}
		System.out.println( "" );
	}
}