import concreteElem.MastercardPayment;
import concreteElem.PaypalPayment;
import concreteElem.VisaPayment;
import concreteVisit.balanceVisitor;
import concreteVisit.billVisitor;
import interfaceElem.Payment;
import interfaceVisit.paymentVisitor;

public class Main {
    public static void main(String[] args) {
        Payment paypal = new PaypalPayment();
        Payment visa = new VisaPayment();
        Payment master = new MastercardPayment();
        Payment[] payments = {paypal, visa, master};
        paymentVisitor balanceVisitor = new balanceVisitor();
        paymentVisitor billVisitor = new billVisitor();
        for (Payment payment : payments) {
            payment.accept(balanceVisitor);
            payment.accept(billVisitor);
        }
    }
}