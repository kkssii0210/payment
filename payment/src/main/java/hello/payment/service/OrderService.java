package hello.payment.service;

import hello.payment.entity.Member;
import hello.payment.entity.Order;

public interface OrderService {
    Order autoOrder(Member member);
}
