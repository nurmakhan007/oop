package part1;

public class Channel {
    private String nameOfChannel;
    private Program[] programs;
    private int countOfPrograms;

    public Channel() {
    }

    public Channel(String nameOfChannel) {
        this.nameOfChannel = nameOfChannel;
        this.programs = new Program[3];
        countOfPrograms=0;
    }

    void addProgram(Program program){
        if (this.countOfPrograms == this.programs.length) {
            System.out.println("Автобус переполнен!");
            return;
        }
        this.programs[countOfPrograms] = program;
        this.countOfPrograms++;
    }

    public String getNameOfChannel() {
        return nameOfChannel;
    }

    public void setNameOfChannel(String nameOfChannel) {
        this.nameOfChannel = nameOfChannel;
    }

    public Program[] getPrograms() {
        return programs;
    }

    public void setPrograms(Program[] programs) {
        this.programs = programs;
    }
}
