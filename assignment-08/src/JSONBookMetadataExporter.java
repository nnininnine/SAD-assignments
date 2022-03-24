public class JSONBookMetadataExporter extends BookMetadataExporter {
    public JSONBookMetadataExporter() {}

    @Override
    protected BookMetadataFormatter createFormatter() {
        BookMetadataFormatter formatter = new JSONBookMetadataFormatter();
        return formatter;
    }
}
