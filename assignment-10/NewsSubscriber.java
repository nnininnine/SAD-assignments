package behavioral1;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {

    @Override
    public void onSubscribe(Subscription subscription) {
    }

    @Override
    public void onNext(News item) {
        System.out.println(item.getTopic() + " -> " + item.getContent());
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("complete");
    }
}

