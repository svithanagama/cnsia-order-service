package me.sanjayav.polarbookshop.orderservice.order.event;

public record OrderAcceptedMessage(
    Long orderId
) { }
