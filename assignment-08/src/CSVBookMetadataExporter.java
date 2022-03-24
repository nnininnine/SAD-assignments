import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {
    public CSVBookMetadataExporter() {}

    @Override
    protected BookMetadataFormatter createFormatter() {
        try {
            BookMetadataFormatter formatter = new CSVBookMetadataFormatter();
            return formatter;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
