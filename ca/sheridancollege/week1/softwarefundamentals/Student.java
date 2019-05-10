package ca.sheridancollege.week1.softwarefundamentals;

public class Student {
	private String name;

	public Student( ) {
		
	}

	public Student( String name ){
		this.name = name;
	}

	public String getName( ) {
		return this.name;
	}

	public void setName( String name ) {
		this.name = name;
	}


	public static void main ( String args [ ] ) {
		Student student1 = new Student( );
		student1.setName( "Mark" );

		Student student2 = new Student( );
		student2.setName( "Andy" );

		Student student3 = new Student( );
		student3.setName( "Sukhpreet" );

		Student student4 = new Student( );
		student4.setName( "Charlie" );

		Student student5 = new Student( );
		student5.setName( "Tarik" );

		Student [ ] students = new Student[ 5 ];
		students[ 0 ] = student1;
		students[ 1 ] = student2;
		students[ 2 ] = student3;
		students[ 3 ] = student4;
		students[ 4 ] = new Student( "Pamela" );

		// iterate through the array and print the names

		for ( int i = 0 ; i < students.length ; i ++ ) {
			System.out.println( "Name of the student is " + students[ i ].getName( ) );
		}
	} 

}















