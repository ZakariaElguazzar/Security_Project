package org.elguazzar.commandeservice.enums;

public enum CommandeStatus {
    PENDING,       // The order has been created but not yet processed
    PROCESSING,    // The order is being processed (stock check, validation)
    CONFIRMED,     // The order has been confirmed and is ready for shipment
    SHIPPED,       // The order has been shipped
    DELIVERED,     // The order has been delivered to the customer
    CANCELLED,     // The order was cancelled (by customer or admin)
    RETURNED
}
