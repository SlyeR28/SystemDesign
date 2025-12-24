package StructureDesign.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {

    private List<YouTubeSubscriber> subscribers = new ArrayList<>();

    public void addSubscriber(YouTubeSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void uploadVideo(String video) {
        notifySubscribers(video);

    }

    private void notifySubscribers(String video) {
        for (YouTubeSubscriber subscriber : subscribers) {
            subscriber.update(video);
        }
    }
}
