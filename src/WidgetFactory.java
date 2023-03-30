/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.security.PublicKey;

public class WidgetFactory {

    private final int HOURLY_PRODUCTION = 10;
    private final int SHIFTS = 2;
    private final int SHIFT_HOURS = 8;

    private int quantity;

    public WidgetFactory(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getHOURLY_PRODUCTION() {
        return HOURLY_PRODUCTION;
    }

    public int getSHIFTS() {
        return SHIFTS;
    }

    public int getSHIFT_HOURS() {
        return SHIFT_HOURS;
    }

    public int getNeededQuantity(int quantityWidget) {
        return quantityWidget;
    }

    public double getDaysOfManufacturing() {
        return (double) getQuantity() / (HOURLY_PRODUCTION * SHIFTS * SHIFT_HOURS);
    }
}
