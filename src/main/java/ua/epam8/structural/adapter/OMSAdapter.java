package ua.epam8.structural.adapter;

public class OMSAdapter {
    private NewOMS newOMS;

    public OMSAdapter() {
        newOMS = new NewOMS();
    }

    public void addItem(Item item) {
        convertXmlToJson(item);
        newOMS.addToBasket(item);
    }

    public void makePayment(Payment p) {
        convertXmlToJson(p);
        newOMS.pay(p);
    }

    private void convertXmlToJson(Object o) {
        System.out.println("Converted from XML to JSON");
    }
}
