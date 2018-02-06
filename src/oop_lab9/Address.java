package oop_lab9;

public class Address {
    private String homeNo;
    private String province;
    private String postcode;

    public Address(String homeNo, String province, String postcode) {
        this.homeNo = homeNo;
        this.province = province;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homeNo='" + homeNo + '\'' +
                ", province='" + province + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
