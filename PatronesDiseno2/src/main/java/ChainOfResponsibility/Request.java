/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class Request {
    private String productName;
    private double price;
    private String issueType;

    public Request(String productName, double price, String issueType) {
        this.productName = productName;
        this.price = price;
        this.issueType = issueType;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getIssueType() {
        return issueType;
    }
}
