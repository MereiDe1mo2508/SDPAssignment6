package interfaceElem;

import interfaceVisit.paymentVisitor;

public interface Payment {
    void accept(paymentVisitor visitor);
}
