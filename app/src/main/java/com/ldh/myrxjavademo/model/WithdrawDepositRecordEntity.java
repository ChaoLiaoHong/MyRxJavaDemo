package com.ldh.myrxjavademo.model;

import java.util.List;

/**
 * Created by LiaoDuanHong  on 2017/10/23
 */

public class WithdrawDepositRecordEntity {
    private boolean asc;
    private int current;
    private int limit;
    private int offset;
    private int offsetCurrent;
    private boolean openSort;
    private boolean optimizeCount;
    private String orderByField;
    private int pages;
    private boolean searchCount;
    private int size;
    private int total;
    private List<RecordsBean> records;

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffsetCurrent() {
        return offsetCurrent;
    }

    public void setOffsetCurrent(int offsetCurrent) {
        this.offsetCurrent = offsetCurrent;
    }

    public boolean isOpenSort() {
        return openSort;
    }

    public void setOpenSort(boolean openSort) {
        this.openSort = openSort;
    }

    public boolean isOptimizeCount() {
        return optimizeCount;
    }

    public void setOptimizeCount(boolean optimizeCount) {
        this.optimizeCount = optimizeCount;
    }

    public String getOrderByField() {
        return orderByField;
    }

    public void setOrderByField(String orderByField) {
        this.orderByField = orderByField;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class RecordsBean {
        /**
         * amount : 1000
         * createTime : 1508297807000
         * memberId : 10004
         * payWithdrawalRecordId : 28806493575168
         * poundage : 120
         * state : 1
         * transferAmount : 880
         * type : 1
         * withdrawalWay : 1
         * updateTime : 1508228350000
         */

        private int amount;
        private long createTime;
        private long memberId;
        private long payWithdrawalRecordId;
        private int poundage;
        private int state;
        private int transferAmount;
        private int type;
        private int withdrawalWay;
        private long updateTime;

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public long getMemberId() {
            return memberId;
        }

        public void setMemberId(long memberId) {
            this.memberId = memberId;
        }

        public long getPayWithdrawalRecordId() {
            return payWithdrawalRecordId;
        }

        public void setPayWithdrawalRecordId(long payWithdrawalRecordId) {
            this.payWithdrawalRecordId = payWithdrawalRecordId;
        }

        public int getPoundage() {
            return poundage;
        }

        public void setPoundage(int poundage) {
            this.poundage = poundage;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getTransferAmount() {
            return transferAmount;
        }

        public void setTransferAmount(int transferAmount) {
            this.transferAmount = transferAmount;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getWithdrawalWay() {
            return withdrawalWay;
        }

        public void setWithdrawalWay(int withdrawalWay) {
            this.withdrawalWay = withdrawalWay;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }
    }

}
