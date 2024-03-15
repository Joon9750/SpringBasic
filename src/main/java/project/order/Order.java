package project.order;

public class Order {
    
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;
    
    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }
    
    public int calculatePrice() {
        return itemPrice - discountPrice;
    }
    
    /**
     * @return the memberId
     */
    public Long getMemberId() {
	    return memberId;
    }
    
    /**
     * @return the itemName
     */
    public String getItemName() {
	    return itemName;
    }
    
    /**
     * @return the itemPrice
     */
    public int getItemPrice() {
	    return itemPrice;
    }
    
    /**
     * @return the discountPrice
     */
    public int getDiscountPrice() {
	    return discountPrice;
    }
    
    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName=" + itemName +'\'' +
                ", itemPrice= " + itemPrice + 
                ", discountPrice=" + discountPrice +
                '}';
    }
}