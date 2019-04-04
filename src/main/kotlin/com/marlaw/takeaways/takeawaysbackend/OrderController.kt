package com.marlaw.takeaways.takeawaysbackend

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/orders")
@CrossOrigin
class OrderController(private val orderDAO: OrderDAO, private val orderNotifier: OrderNotifier) {
    @RequestMapping(method = [RequestMethod.GET])
    fun listOrders() = orderDAO.listOrders()

    @RequestMapping(method = [RequestMethod.POST])
    fun createOrder(@RequestBody items: List<String>): Order {

        val order = orderDAO.createNewOrder(items)
        orderNotifier.notify(order)

        return order
    }

    @RequestMapping(value = ["/{order}/status"], method = [RequestMethod.PUT])
    fun updateOrderStatus(@PathVariable("order") orderId: String,
                          @RequestBody newStatus: OrderStatus): Order {
        val order = orderDAO.getOrderIdBy(orderId)
        order.status = newStatus

        if (order.status == OrderStatus.DELIVERED) {
            orderDAO.removeOrder(orderId)
        }
        orderNotifier.notify(order)

        return order
    }
    @RequestMapping(value = ["/{order}/items/{item}/status"], method = [RequestMethod.PUT])
    fun updateOrderItemStatus(@PathVariable("order") orderId: String,
                              @PathVariable("item") itemId: String,
                              @RequestBody newStatus: OrderItemStatus): Order {
        val order = orderDAO.getOrderIdBy(orderId)
        order.items.first { item -> item.id == itemId }
                .status = newStatus

        if (order.items.all { item -> item.status == OrderItemStatus.FINISHED }) {
            order.status = OrderStatus.COOKED
        } else if (order.items.any { item -> item.status != OrderItemStatus.PENDING }) {
            order.status = OrderStatus.STARTED
        }
        orderNotifier.notify(order)

        return order
    }

}