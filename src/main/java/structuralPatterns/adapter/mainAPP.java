package structuralPatterns.adapter;

public class mainAPP {
    public static void main(String args[]){
        OldPrinter oldPrinter = new OldPrinter();
        PrinterAdapter printer = new PrinterAdapter(oldPrinter);
        printer.print();
    }
}
