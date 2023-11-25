package hello.payment.service;

import com.siot.IamportRestClient.response.IamportResponse;
import com.siot.IamportRestClient.response.Payment;
import hello.payment.dto.PaymentCallbackRequest;
import hello.payment.dto.RequestPayDto;

public interface PaymentService {
    // 결제 요청 데이터 조회
    RequestPayDto findRequestDto(String orderUid);
    // 결제 검증(콜백)
    IamportResponse<Payment> paymentByCallback(PaymentCallbackRequest request);
}
