package concreteVisit;

import concreteElem.MastercardPayment;
import concreteElem.PaypalPayment;
import concreteElem.VisaPayment;
import interfaceVisit.paymentVisitor;

public class balanceVisitor implements paymentVisitor {
    @Override
    public void visit(PaypalPayment paypal) {
        System.out.println("Paypal Balance: " + paypal.getPaypalBalance());
    }
    @Override
    public void visit(VisaPayment visa) {
        System.out.println("Visa Balance: " + visa.getVisaBalance());
    }
    @Override
    public void visit(MastercardPayment master) {
        System.out.println("MasterCard Balance: " + master.getBill());
    }
}
