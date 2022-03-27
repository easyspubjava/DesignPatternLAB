package proxy;

public class PrinterProxy implements Printable {
    private String name;            // 이름
    private Printer real;           // "본인"
    public PrinterProxy() {
    }
    public PrinterProxy(String name) {      // 생성자
        this.name = name;
    }
    public synchronized void setPrinterName(String name) {  // 이름의 설정
        if (real != null) {
            real.setPrinterName(name);  // "본인"에게도 설정한다.
        }
        System.out.println("proxy : setPrinterName()");
        this.name = name;
    }
    public String getPrinterName() {    // 이름의 취득
    	System.out.println("proxy : getPrinterName()");
    	return name;
    }
    public void print(String string) {  // 표시
        realize();
        real.print(string);
    }
    private synchronized void realize() {   // "본인"을 생성
        if (real == null) {
            real = new Printer(name);
        }
    }
}
