package behavioral1;

public class NewsReader extends NewsSubscriber {
    private String reader;

    NewsReader(String reader) {
        super();
        this.reader = reader;
    }

    @Override
    public void onNext(News item) {
        System.out.print(String.format("%s: ", this.reader));
        super.onNext(item);
    }
}
