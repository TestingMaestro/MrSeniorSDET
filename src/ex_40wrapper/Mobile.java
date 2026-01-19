package ex_40wrapper;

public class Mobile extends OldPhone {
    private String phoneName;
    private Double price;
    private Integer phoneNo;

    Mobile(Integer phoneNo, String phoneName, Double price) {
        this.phoneNo = phoneNo;
        this.phoneName = phoneName;
        this.price = price;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    void calling() {
        System.out.println("Touch Screen");
    }
}
