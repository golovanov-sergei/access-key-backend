package com.example.accesskeybackend.template.controller;

import com.example.accesskeybackend.template.service.AccessKeyIpService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;

@RestController
@RequestMapping("/api/web")
@AllArgsConstructor
public class AccessKeyWebController {
    private final AccessKeyIpService accessKeyIpService;
    @PostMapping("/checkIpv6Support")
    public ResponseEntity<Boolean> checkIpv6Support(
            @RequestParam(name = "siteUrl") String siteUrl) throws UnknownHostException{
        return ResponseEntity.ok().body(accessKeyIpService.checkForIpv6Support(siteUrl));
    }
}