package concreteElem;

import interfaceElem.Payment;
import interfaceVisit.paymentVisitor;

public class MastercardPayment implements Payment {
    @Override
    public void accept(paymentVisitor visitor) {
        visitor.visit(this);
    }
    int masterBalance = 8500;
    double masterBill = 250.9;
    public double getBill() {
        return masterBill;
    }
    public void setBill(double masterBill) {
        this.masterBill = masterBill;
    }
}
