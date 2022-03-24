import javax.xml.parsers.ParserConfigurationException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) {
        BookMetadataFormatter bookMetadataFormatter = this.createFormatter();

        for (Book b : this.books) {
            bookMetadataFormatter.append(b);
        }

        stream.println(bookMetadataFormatter.getMetadataString());
    }

    protected abstract BookMetadataFormatter createFormatter();
}
