Objective

The goal of this lab was to understand how XML works and how to perform basic XML operations using Java. Tasks included:
- Creating a well-formed XML file.
- Reading and parsing the XML file using Java DOM.
- Modifying the XML content programmatically and saving the result.


Files Included

- `books.xml` – Original XML file containing book data.
- `XmlParser.java` – Java class for parsing and modifying the XML file.
- `updated_books.xml` – New XML file created after modifying the year of the first book.
- `README.md` – Explanation and results.


How It Works

  1. Reading XML
The `XmlParser.java` file uses Java's DOM parser to:
- Load the `books.xml` file.
- Read and print each book's title, author, year, and genre.

  2. Modifying XML
It then modifies the `<year>` of the first `<book>` element to `"2023"` and saves the result in a new file named `updated_books.xml`.

Sample Console Output

Title: 1984
Author: George Orwell
Year: 1949
Genre: Dystopian
-----------
Updated first book year and saved to updated_books.xml
BUILD SUCCESSFUL (total time: 0 seconds)
