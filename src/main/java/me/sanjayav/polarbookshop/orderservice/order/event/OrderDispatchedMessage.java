package me.sanjayav.polarbookshop.orderservice.order.event;

public record OrderDispatchedMessage(
    Long orderId
) { }
