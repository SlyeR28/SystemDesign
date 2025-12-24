package StructureDesign.ObserverPattern;

public class YouTubeSubscriber {
    private String name;

    public YouTubeSubscriber(String name) {
        this.name = name;
    }

    public void update(String video) {
        System.out.println(name + " received notification: New video -> " + video);
    }
}
