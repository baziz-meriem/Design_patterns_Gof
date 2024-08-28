package structuralPatterns.proxy;

public class Service implements CommandExecutor {
    @Override
    public void runCommand() {
        System.out.println("The previleged access command is executed");
    }
}
