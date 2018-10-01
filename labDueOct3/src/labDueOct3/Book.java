 /*****************************************************************
     * Bogdan Abaev Kaylin Kuhn                                               *
     * PO Box 3003                                              *
     * Program for CSC 207                                           *
     *    Library example                                   *
     * Assignment for October 3                        *
     *****************************************************************/


    /* ***************************************************************
     * Academic honesty certification:                               *
     *   Written/online sources used:                                *
     *     none                         *
     *   Help obtained                                               *
     *     none             *
     *   My signature below confirms that the above list of sources  *
     *   is complete AND that I have not talked to anyone else       *
     *   [e.g., CSC 161 students] about the solution to this problem *
     *                                                               *
     *   Signature:   Bogdan Abaev                                               *
     *****************************************************************/


package labDueOct3;

public class Book {

	protected String author;
	protected String title;
	protected String isbn;
	
	/**
	 * null constructor
	 */
	Book() {
		author = "";
		title = "";
		isbn = "";		
	}
	/**
	 * Constructor of Book with the following values:
	 * @param auth
	 * @param ttle
	 * @param num
	 */
	Book(String auth, String ttle, String num) {
		author = auth;
		title= ttle;
		isbn = num;
	}

	/**
	 * @return author of the book
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * 
	 * @return title of the book
	 */
	public String getTitle( ) {
		return title;
	}
	/**
	 * 
	 * @return ISBN of the book
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * set the value of author field for:
	 * @param name
	 */
	public void setAuthor(String name) {
		author = name;
	}
	
	/**
	 * set the value of title field for:
	 * @param name
	 */
	public void setTitle(String name) {
		title = name;
	}
	
	/**
	 * set the value of isbn field for:
	 * @param name
	 */
	public void setIsbn(String name) {
		isbn = name;
	}
	/**
	 * pretty printing
	 */
	public String toString() {
		return "Author: " + author + "\n " +
				"title: " + title + "\n " +
				" isbn : " + isbn;
	}

}







