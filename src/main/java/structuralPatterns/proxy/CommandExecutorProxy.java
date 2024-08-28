package structuralPatterns.proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private Service service;
    private String userRole;

    public CommandExecutorProxy(Service Service,String userRole) {
        this.service= Service;
        this.userRole = userRole;
    }

    @Override
    public void runCommand() {
        if (checkAccess()) {
            service.runCommand();
        } else {
            System.out.println("Access denied, Only non previleged commands are run");
        }
    }

    public boolean checkAccess() {
        return userRole.equalsIgnoreCase("ADMIN");
    }
}
