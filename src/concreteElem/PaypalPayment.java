package concreteElem;

import interfaceElem.Payment;
import interfaceVisit.paymentVisitor;

public class PaypalPayment implements Payment {
    @Override
    public void accept(paymentVisitor visitor) {
        visitor.visit(this);
    }
    int paypalBalance = 10000;
    double monthlyBill = 131.90;
    public int getPaypalBalance() {
        return paypalBalance;
    }
    public void setPaypalBalance(int balance) {
        this.paypalBalance = paypalBalance;
    }
    public double getMonthlyBill() {
        return monthlyBill;
    }
    public void setMonthlyBill(double monthlyBill) {
        this.monthlyBill = monthlyBill;
    }
}
