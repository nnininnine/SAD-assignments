import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {
    public XMLBookMetadataExporter() {}

    @Override
    protected BookMetadataFormatter createFormatter() {
        try {
            BookMetadataFormatter formatter = new XMLBookMetadataFormatter();
            return formatter;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
