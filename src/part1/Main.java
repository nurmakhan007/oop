package part1;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Samsung");
        Channel channel1 = new Channel("Первый");
        Channel channel2 = new Channel("НТК");
        Program p1 = new Program("Давай поженимся");
        Program p2 = new Program("Малахов+");
        Program p3 = new Program("Пусть говорят");
        Program p4 = new Program("Калаулым");
        Program p5 = new Program("Айтуга онай");
        Program p6 = new Program("Жаналыктар");

        Controller controller = new Controller(tv);

        tv.addChannel(channel1);
        tv.addChannel(channel2);
        channel1.addProgram(p1);
        channel1.addProgram(p2);
        channel1.addProgram(p3);
        channel2.addProgram(p4);
        channel2.addProgram(p5);
        channel2.addProgram(p6);

        controller.on(2);

    }
}
