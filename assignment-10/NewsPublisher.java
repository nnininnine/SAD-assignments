package behavioral1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {
    private Set<Subscriber<News>> subscribers;

    NewsPublisher() {
        this.subscribers = new LinkedHashSet<Subscriber<News>>();
    }

    @Override
    public void subscribe(Subscriber<? super News> subscriber) {
        this.subscribers.add((Subscriber<News>) subscriber);
    }

    public void unsubscribe(Subscriber<? super News> subscriber) {
        this.subscribers.remove((Subscriber<News>) subscriber);
    }

    public void publish(News news) {
        for(Subscriber<News> reader: subscribers) {
            reader.onNext(news);
        }
    }
}
