package StructureDesign.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel  =  new YouTubeChannel();
        YouTubeSubscriber s1 = new YouTubeSubscriber("Rishabh");
        YouTubeSubscriber s2 = new YouTubeSubscriber("Amit");

        channel.addSubscriber(s1);
        channel.addSubscriber(s2);

        channel.uploadVideo("Observer Pattern Explained");
    }
}
