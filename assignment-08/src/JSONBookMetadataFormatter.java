import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        this.jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        final JSONObject jsonObject = new JSONObject();
        String authors = String.join("|", b.getAuthors());
        jsonObject.put("isbn", b.getISBN());
        jsonObject.put("title", b.getTitle());
        jsonObject.put("publisher", b.getPublisher());
        jsonObject.put("authors", authors);
        jsonArray.add(jsonObject);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return jsonArray.toJSONString();
    }
}
