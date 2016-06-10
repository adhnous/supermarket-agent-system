package com.davidflex.supermarket.ontologies.ecommerce.elements;

import jade.content.Predicate;

/**
 * Error while purchase process.
 */
public class PurchaseError implements Predicate {
    private String message;

    public PurchaseError(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}