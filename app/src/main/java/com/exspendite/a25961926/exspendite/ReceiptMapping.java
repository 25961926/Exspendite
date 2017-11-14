package com.exspendite.a25961926.exspendite;

/**
 * Created by Muller on 2017/11/14.
 */

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;

@DynamoDBTable(tableName = "Receipts")
public class ReceiptMapping {
    private String merchant;
    private String itemDesc;
    private int price;

    @DynamoDBIndexRangeKey(attributeName = "merchant")
    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    @DynamoDBIndexHashKey(attributeName = "itemDesc")
    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    @DynamoDBAttribute(attributeName = "itemDesc")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
