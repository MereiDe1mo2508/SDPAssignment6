package concreteElem;

import interfaceElem.Payment;
import interfaceVisit.paymentVisitor;

public class VisaPayment implements Payment {
    @Override
    public void accept(paymentVisitor visitor) {
        visitor.visit(this);
    }
    int visaBalance = 2560;
    double visaBill = 109.35;
    public int getVisaBalance() {
        return visaBalance;
    }
    public void setVisaBalance(int visaBalance) {
        this.visaBalance = visaBalance;
    }
    public double getVisaBill() {
        return visaBill;
    }
    public void setVisaBill(double visaBill) {
        this.visaBill = visaBill;
    }
}
