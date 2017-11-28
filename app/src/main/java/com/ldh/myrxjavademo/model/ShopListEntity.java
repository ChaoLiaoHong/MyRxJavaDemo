package com.ldh.myrxjavademo.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiaoDuanHong  on 2017/10/25
 */

public class ShopListEntity implements Parcelable {
    private int status;
    private int total;
    private int size;
    private List<ContentsBean> contents;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<ContentsBean> getContents() {
        return contents;
    }

    public void setContents(List<ContentsBean> contents) {
        this.contents = contents;
    }

    public static class ContentsBean implements Serializable {
        /**
         * state : 2
         * class_id : 7
         * class_pid : 1
         * uid : 2298147491
         * province : 四川省
         * geotable_id : 174608
         * modify_time : 1503988910
         * district : 绵竹市
         * create_time : 1503643238
         * shop_signage : {"imgid":"47021235944","big":"http://b.imgsrc.baidu.com/lbsapi/pic/item/8cb1cb1349540923354af9bc9858d109b2de49d5.jpg","mid":"http://b.imgsrc.baidu.com/lbsapi/wh%3D160%2C160/sign=395d02b9db1373f0f56a679e923f67ca/8cb1cb1349540923354af9bc9858d109b2de49d5.jpg","sml":"http://b.imgsrc.baidu.com/lbsapi/wh%3D16%2C16/sign=7dd47e3aad86c91708565a38ff1141f9/8cb1cb1349540923354af9bc9858d109b2de49d5.jpg"}
         * city : 德阳市
         * location : [104.04532,31.691448]
         * shopName : 厕所串串香
         * address : 1234
         * title : 厕所串串香
         * coord_type : 3
         * direction : 附近
         * type : 0
         * distance : 0
         * weight : 0
         * shopId :
         * shopServices :
         * businessStartTime : 00:00
         * businessStopTime : 23:59
         * shopPhone :
         * avgSpend : 0
         * shopRemark :
         * shopCommentNum : 0
         * shopStartLevel : 0
         * shopCollectionNum : 0
         * shopCommentStart : 0
         * shopDiscount
         */

        private int state;
        private long class_id;
        private long class_pid;
        private long uid;
        private String province;
        private int geotable_id;
        private int modify_time;
        private String district;
        private int create_time;
        private ShopSignageBean shop_signage;
        private String city;
        private String shopName;
        private String address;
        private String title;
        private int coord_type;
        private String direction;
        private int type;
        private int distance;
        private int weight;
        private String shopId;
        private String shopServices;
        private String businessStartTime;
        private String businessStopTime;
        private String shopPhone;
        private double avgSpend;
        private String shopRemark;
        private int shopCommentNum;
        private int shopStartLevel;
        private int shopCollectionNum;
        private double shopCommentStart;
        private List<Double> location;
        private int shopDiscount;
        private int rebateIntegralMember;

        public int getShopDiscount() {
            return shopDiscount;
        }

        public void setShopDiscount(int shopDiscount) {
            this.shopDiscount = shopDiscount;
        }

        public int getRebateIntegralMember() {
            return rebateIntegralMember;
        }

        public void setRebateIntegralMember(int rebateIntegralMember) {
            this.rebateIntegralMember = rebateIntegralMember;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public long getClass_id() {
            return class_id;
        }

        public void setClass_id(long class_id) {
            this.class_id = class_id;
        }

        public long getClass_pid() {
            return class_pid;
        }

        public void setClass_pid(long class_pid) {
            this.class_pid = class_pid;
        }

        public long getUid() {
            return uid;
        }

        public void setUid(long uid) {
            this.uid = uid;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public int getGeotable_id() {
            return geotable_id;
        }

        public void setGeotable_id(int geotable_id) {
            this.geotable_id = geotable_id;
        }

        public int getModify_time() {
            return modify_time;
        }

        public void setModify_time(int modify_time) {
            this.modify_time = modify_time;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public ShopSignageBean getShop_signage() {
            return shop_signage;
        }

        public void setShop_signage(ShopSignageBean shop_signage) {
            this.shop_signage = shop_signage;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCoord_type() {
            return coord_type;
        }

        public void setCoord_type(int coord_type) {
            this.coord_type = coord_type;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getShopId() {
            return shopId;
        }

        public void setShopId(String shopId) {
            this.shopId = shopId;
        }

        public String getShopServices() {
            return shopServices;
        }

        public void setShopServices(String shopServices) {
            this.shopServices = shopServices;
        }

        public String getBusinessStartTime() {
            return businessStartTime;
        }

        public void setBusinessStartTime(String businessStartTime) {
            this.businessStartTime = businessStartTime;
        }

        public String getBusinessStopTime() {
            return businessStopTime;
        }

        public void setBusinessStopTime(String businessStopTime) {
            this.businessStopTime = businessStopTime;
        }

        public String getShopPhone() {
            return shopPhone;
        }

        public void setShopPhone(String shopPhone) {
            this.shopPhone = shopPhone;
        }

        public double getAvgSpend() {
            return avgSpend;
        }

        public void setAvgSpend(double avgSpend) {
            this.avgSpend = avgSpend;
        }

        public String getShopRemark() {
            return shopRemark;
        }

        public void setShopRemark(String shopRemark) {
            this.shopRemark = shopRemark;
        }

        public int getShopCommentNum() {
            return shopCommentNum;
        }

        public void setShopCommentNum(int shopCommentNum) {
            this.shopCommentNum = shopCommentNum;
        }

        public int getShopStartLevel() {
            return shopStartLevel;
        }

        public void setShopStartLevel(int shopStartLevel) {
            this.shopStartLevel = shopStartLevel;
        }

        public int getShopCollectionNum() {
            return shopCollectionNum;
        }

        public void setShopCollectionNum(int shopCollectionNum) {
            this.shopCollectionNum = shopCollectionNum;
        }

        public double getShopCommentStart() {
            return shopCommentStart;
        }

        public void setShopCommentStart(double shopCommentStart) {
            this.shopCommentStart = shopCommentStart;
        }

        public List<Double> getLocation() {
            return location;
        }

        public void setLocation(List<Double> location) {
            this.location = location;
        }

        public static class ShopSignageBean  {
            /**
             * imgid : 47021235944
             * big : http://b.imgsrc.baidu.com/lbsapi/pic/item/8cb1cb1349540923354af9bc9858d109b2de49d5.jpg
             * mid : http://b.imgsrc.baidu.com/lbsapi/wh%3D160%2C160/sign=395d02b9db1373f0f56a679e923f67ca/8cb1cb1349540923354af9bc9858d109b2de49d5.jpg
             * sml : http://b.imgsrc.baidu.com/lbsapi/wh%3D16%2C16/sign=7dd47e3aad86c91708565a38ff1141f9/8cb1cb1349540923354af9bc9858d109b2de49d5.jpg
             */

            private String imgid;
            private String big;
            private String mid;
            private String sml;

            public String getImgid() {
                return imgid;
            }

            public void setImgid(String imgid) {
                this.imgid = imgid;
            }

            public String getBig() {
                return big;
            }

            public void setBig(String big) {
                this.big = big;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public String getSml() {
                return sml;
            }

            public void setSml(String sml) {
                this.sml = sml;
            }
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.status);
        dest.writeInt(this.total);
        dest.writeInt(this.size);
        dest.writeList(this.contents);
    }

    public ShopListEntity() {
    }

    protected ShopListEntity(Parcel in) {
        this.status = in.readInt();
        this.total = in.readInt();
        this.size = in.readInt();
        this.contents = new ArrayList<ContentsBean>();
        in.readList(this.contents, ContentsBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<ShopListEntity> CREATOR = new Parcelable.Creator<ShopListEntity>() {
        @Override
        public ShopListEntity createFromParcel(Parcel source) {
            return new ShopListEntity(source);
        }

        @Override
        public ShopListEntity[] newArray(int size) {
            return new ShopListEntity[size];
        }
    };
}
