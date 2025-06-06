package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//POJO class
//Kholiwe Faith Mafenuka
//221686584

@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    private String orderItemId;
    private int quantity;
    private double priceAtPurchase;

    public OrderItem() {

    }

    public OrderItem(Builder builder) {
        this.orderItemId = builder.orderItemId;
        this.quantity = builder.quantity;
        this.priceAtPurchase = builder.priceAtPurchase;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPriceAtPurchase() {
        return priceAtPurchase;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId='" + orderItemId + '\'' +
                ", quantity=" + quantity +
                ", priceAtPurchase=" + priceAtPurchase +
                '}';
    }

    public static class Builder {
        private String orderItemId;
        private int quantity;
        private double priceAtPurchase;

        public Builder setOrderItemId(String orderItemId) {
            this.orderItemId = orderItemId;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder setPriceAtPurchase(double priceAtPurchase) {
            this.priceAtPurchase = priceAtPurchase;
            return this;
        }

        public Builder copy(OrderItem orderItem){
            this.orderItemId = orderItemId;
            this.quantity = quantity;
            this.priceAtPurchase = priceAtPurchase;
            return this;
        }
        public OrderItem build() {
            return new OrderItem(this);
        }

    }

    public double getSubtotal() {
        return priceAtPurchase * quantity;
    }
}
