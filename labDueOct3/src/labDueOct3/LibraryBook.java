package labDueOct3;

public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{

	protected String callNumber;
	
	LibraryBook(String name, String ttle, String num, String call){
		super(name,ttle,num);
		callNumber = call;
		}
	/**
	 * 
	 * @return callNumber of the book
	 */
	public String getCallNum() {
		return callNumber;
	}
	/**
	 * sets the callNumber of the book for:
	 * @param call
	 */
	
	public void setCallNum(String call) {
		callNumber =  call;
	}
	
	/** 
	 * implementation of Comparable's compareTo method
	 * @param book2:  Library object being compared
	 * @return 0 if call numbers of this and book2 match
	 *         < 0 if call number of this comes before call number of book2
	 *         > 0 otherwise
	 */
	public int compareTo (LibraryBook book2) {
		return this.getCallNum().compareTo(book2.getCallNum());
	}
	
	/**
	 * pretty printing
	 */
	public String toString() {
		return super.toString() + "\n callNumber: " + callNumber +"\n";
				
	}
	
	/**
	 * abstract methods implemented in the subclasses of LibraryBook
	 *
	 */
	
	/**
	 * 
	 * @return the circulation status of the book
	 */
	public abstract String  circulationStatus();
	/**
	 * processes the checkout of the book
	 * @param person: the name of the patron checking out the book 
	 * @param dateDue: the date the book is due
	 */
	public abstract void checkout(String person, String dateDue );
	/**
	 * processes the return of the book
	 * 
	 */
	public abstract void returned( );
}
