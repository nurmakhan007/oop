package part1;

public class Controller {
    TV tv;
    int number;

    public Controller(TV tv) {
        this.tv = tv;
        this.number = (int)(Math.random()*3);
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    void on(int i){
        if(i>0) {
            i--;
            System.out.println(this.tv.getChannels()[i].getPrograms()[number].getNameofProgram());
        }
    }
}
