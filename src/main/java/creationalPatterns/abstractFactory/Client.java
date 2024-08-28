package creationalPatterns.abstractFactory;
//uses factory without knowing their concrete object
public class Client {
    private Chair clientChair;
    private Table clientTable;

    public Client(FournitureFactory fournitureFactory) {
        this.clientChair = fournitureFactory.createChair();
        this.clientTable = fournitureFactory.createTable();
    }

    public String getClientChair() {
        return "clientChair";
    }
    public String getClientTable() {

        return "clientTable";
    }
//fourniture type is defined in main
    public static void main(String[] args) {
        FournitureFactory fournitureFactory = new modernFournitureFactory();
        Client myClient = new Client(fournitureFactory);
        System.out.println(myClient.getClientChair());
        System.out.println(myClient.getClientTable());
    }
}
