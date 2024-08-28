package structuralPatterns.proxy;

public class mainAPP {
    public static void main(String[] args){
        Service service = new Service();
        CommandExecutorProxy executorProxy = new CommandExecutorProxy(service,"admin");

        executorProxy.runCommand();

    }
}
