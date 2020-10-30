/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author vaish
 */
public class BillReport {
    private String invoiceNum;

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getProdct() {
        return prodct;
    }

    public void setProdct(String prodct) {
        this.prodct = prodct;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(String finalCost) {
        this.finalCost = finalCost;
    }
    private String date;
    private String contact;
    private String itemCode;
    private String prodct;
    private String qty;
    private String price;
    private String finalCost;
     
    BillReport(String invoiceNum,String date,String contact,String itemCode,String prodct,String qty,String price,String finalCost){
        super();
        this.invoiceNum = invoiceNum;
        this.date = date;
        this.contact = contact;
        this.itemCode = itemCode;
        this.prodct = prodct;
        this.qty = qty;
        this.price = price;
        this.finalCost = finalCost;
        
    }
 
}
