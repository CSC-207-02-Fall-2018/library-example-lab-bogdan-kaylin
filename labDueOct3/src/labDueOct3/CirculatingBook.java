package labDueOct3;

public class CirculatingBook extends LibraryBook {

	protected String currentHolder;
	protected String dueDate;
	
	public CirculatingBook(String name, String ttle, String num, 
			String call){
		super (name,ttle,num,call);
		currentHolder = "";
		dueDate = "";		
	}

	/**
	 * 
	 * @return the person who checked out the book
	 */
	public String getCurrentHolder() {
		return currentHolder;
	}
	/**
	 * 
	 * @return the date the book is due
	 */
	public String getDueDate() {
		return dueDate;
	}
	/**
	 * sets the currentHolder of the book for:
	 * @param name
	 */
	public void setCurrentHolder(String name) {
		currentHolder = name;
	}
	/**
	 * sets the dueDate of the checked out book for:
	 * @param date
	 */
	public void setDueDate(String date) {
		dueDate = date;
	}
	/**
	 * @return the circulation status of the book:
	 * available of who checked it out and till when
	 */
	public String circulationStatus() {
		if (dueDate == "") {
			return "book available on shelves";
		} else {
			return "Checked out by: " + currentHolder + " untill " + dueDate;
		}
	}

	/**
	 * processes the checkout
	 * sets the currentHolder and dueDate of book
	 * for the parameters given
	 */
	public void checkout(String person, String dateDue) {
		if (this.circulationStatus() == "book available on shelves") {
			currentHolder = person;
			dueDate = dateDue;
		} else {
			System.out.println("The book " +title+ " has already been checked out");
		}
	}

	/**
	 * processes the return of the book
	 * sets the dueDate and currentHolder to null
	 */
	public void returned( ) {
		if (this.circulationStatus() != "book available on shelves") {
			dueDate = "";
			currentHolder = "";		
		} else {
			System.out.println("The book " + title+ " has already been returned");
		}
	}
	
	/**
	 * pretty printing
	 */
	public String toString() {
		return super.toString() +this.circulationStatus() +"\n";
		}
	}

