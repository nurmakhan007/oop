package part1;

public class TV {
    private String model;
    private Channel[] channels;
    private int countOfChannel;
    private Controller controller;

    public TV(String model) {
        this.model = model;
        this.channels = new Channel[3];
        countOfChannel = 0;
    }

    public TV() {
    }

    void addChannel(Channel channel){
        if (this.countOfChannel == this.channels.length) {
            System.out.println("Автобус переполнен!");
            return;
        }
        this.channels[countOfChannel] = channel;
        this.countOfChannel++;

    }


    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Channel[] getChannels() {
        return channels;
    }

    public String getModel() {
        return model;
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
