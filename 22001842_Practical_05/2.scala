object LibraryManagement {

  case class Book(title: String, author: String, isbn: String)

  var library: Set[Book] = Set(
    Book("Book 1", "Author 1", "ISBN 1"),
    Book("Book 2", "Author 2", "ISBN 2"),
    Book("Book 3", "Author 3", "ISBN 3")
  )

  // Add a new book
  def addBook(title: String, author: String, isbn: String): Unit = {
    val newBook = Book(title, author, isbn)
    if (!library.exists(_.isbn == isbn)) {
      library += newBook
      println(s"Book '$title' added successfully.")
    } else {
      println(s"Book with ISBN '$isbn' already exists in the library.")
    }
  }

  // Remove a book by ISBN
  def removeBook(isbn: String): Unit = {
    val bookOption = library.find(_.isbn == isbn)
    bookOption match {
      case Some(book) =>
        library -= book
        println(s"Book with ISBN '$isbn' removed successfully.")
      case None =>
        println(s"No book found with ISBN '$isbn'.")
    }
  }

  // Check if a book is in the library by ISBN
  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  // Display all books
  def displayLibraryCollection(): Unit = {
    println("Current Library Collection:")
    library.foreach(book =>
      println(
        s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"
      )
    )
  }

  // Search for a book by its title and display its details if found
  def searchBookByTitle(title: String): Unit = {
    val bookOption = library.find(_.title.toLowerCase == title.toLowerCase)
    bookOption match {
      case Some(book) =>
        println(s"Book found with title '$title':")
        println(
          s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"
        )
      case None =>
        println(s"No book found with title '$title'.")
    }
  }

  // Display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor =
      library.filter(_.author.toLowerCase == author.toLowerCase)
    if (booksByAuthor.nonEmpty) {
      println(s"Books by author '$author':")
      booksByAuthor.foreach(book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      )
    } else {
      println(s"No books found by author '$author'.")
    }
  }

  def main(args: Array[String]): Unit = {

    displayLibraryCollection()

    addBook("Book 4", "Author 1", "ISBN 4")
    addBook("Book 5", "Author 1", "ISBN 5")

    searchBookByTitle("Book 3")

    displayBooksByAuthor("Author 2")

    removeBook("ISBN 2")

    displayLibraryCollection()
  }
}
