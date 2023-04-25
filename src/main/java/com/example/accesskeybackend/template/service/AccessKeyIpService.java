package com.example.accesskeybackend.template.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.net.*;

@Service
@AllArgsConstructor
@Log4j2
public class AccessKeyIpService {
    public Boolean checkForIpv6Support(String url) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName(getHostFromUrlString(url));
        return inetAddress instanceof Inet6Address;
    }

    private String getHostFromUrlString(String url) {
        try {
            return new URL(url).getHost();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}