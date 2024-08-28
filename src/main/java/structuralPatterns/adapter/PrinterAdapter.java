package structuralPatterns.adapter;

public class PrinterAdapter implements PrintService{
    OldPrinter  oldPrinter;
    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }
    @Override
    public void print() {
        this.oldPrinter.printDocument();
        System.out.println("Printing using new printer");
    }
}
