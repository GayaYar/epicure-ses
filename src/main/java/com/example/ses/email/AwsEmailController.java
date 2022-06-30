package com.example.ses.email;

import com.example.ses.model.Email;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("email")
@AllArgsConstructor
@NoArgsConstructor
public class AwsEmailController {
    private AwsEmailSender service;

    @PostMapping("/admin")
    public ResponseEntity<Email> messageAdmin(@RequestBody Email email) {
        service.messageAdmin(email.getSubject(), email.getBody());
        return ResponseEntity.ok(email);
    }

}
