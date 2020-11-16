package ru.datetime.timestamp.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.datetime.timestamp.GetTimeRequest;
import ru.datetime.timestamp.GetTimeResponse;
import ru.datetime.timestamp.service.TimeService;

@Endpoint
public class TimeEndpoint {
    private static final String NAMESPACE_URI = "http://datetime.ru/timestamp";

    @Autowired
    private TimeService timeService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTimeRequest")
    @ResponsePayload
    public GetTimeResponse getTime(@RequestPayload GetTimeRequest request) throws Exception{
        GetTimeResponse response = new GetTimeResponse();
        response.setDatetime(timeService.getCurrentTime());
        return response;
    }
}
