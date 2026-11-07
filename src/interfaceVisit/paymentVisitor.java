package interfaceVisit;

import concreteElem.MastercardPayment;
import concreteElem.PaypalPayment;
import concreteElem.VisaPayment;

public interface paymentVisitor {
    void visit(PaypalPayment paypal);
    void visit(VisaPayment visa);
    void visit(MastercardPayment master);
}
