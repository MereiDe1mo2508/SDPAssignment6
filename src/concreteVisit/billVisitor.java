package concreteVisit;

import concreteElem.MastercardPayment;
import concreteElem.PaypalPayment;
import concreteElem.VisaPayment;
import interfaceVisit.paymentVisitor;

public class billVisitor implements paymentVisitor {
    @Override
    public void visit(PaypalPayment paypal) {
        System.out.println("Paypal Monthly Bill: " + paypal.getMonthlyBill());
    }
    @Override
    public void visit(VisaPayment visa) {
        System.out.println("Visa Monthly Bill: " + visa.getVisaBalance());
    }
    @Override
    public void visit(MastercardPayment master) {
        System.out.println("MasterCard Monthly Bill: " + master.getBill());
    }
}
