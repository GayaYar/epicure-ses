package com.example.ses.email;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("email")
@AllArgsConstructor
@NoArgsConstructor
public class AwsEmailController {
    private AwsEmailSender service;

    @PostMapping("/admin")
    public ResponseEntity<Void> messageAdmin(@RequestParam String subject,@RequestParam String body) {
        service.messageAdmin(subject, body);
        return ResponseEntity.ok().build();
    }

}
