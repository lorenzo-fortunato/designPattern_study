package domain;

public class CPU {
    public void freeze() {
        System.out.println("CPU: Freezing...");
    }

    public void execute() {
        System.out.println("CPU: Executing...");
    }

    public void jump(long position) {
        System.out.println("CPU: Jumping to position " + position);
    }

    public void stop() {
        System.out.println("CPU: stop");
    }
}

