package labDueOct3;

public class ReferenceBook extends LibraryBook {

	protected String collection;
	
	public ReferenceBook(String name, String ttle, String num, String call,String col){
		super(name,ttle,num,call);
		collection = col;
	}

	/**
	 * 
	 * @return collection the book belongs to
	 */
	public String getCollection() {
		return collection;
	}
	/**
	 * sets the collection of the book for:
	 * @param col
	 */
	public void setCollection(String col) {
		collection = col;
	}
	
	/**
	 * @return the circulation status of the book;
	 * always non-circulating
	 */
	public String circulationStatus() {
		return "non-circulating reference book";
	}


	/**
	 * reference books can't be checked out so
	 * this just informs the user about it
	 */
	public void checkout( String person, String dateDue) {
		System.out.println("Can't checkout reference book: "+ title);
	}

	/**
	 * reference books can't be checked out. so this 
	 * functions just prints the corresponding warning
	 */
	public void returned() {
		System.out.println("reference book " + title+ " could not have been checked out -- return impossible");
	}
	/**
	 * pretty printing
	 */
	public String toString() {
		return super.toString() + "collection: " + collection +"\n";
	}

	
}
