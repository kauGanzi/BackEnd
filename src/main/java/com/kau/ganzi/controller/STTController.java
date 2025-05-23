package com.kau.ganzi.controller;

import com.kau.ganzi.model.Message;
import com.kau.ganzi.service.STTService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/naver/stt")
public class STTController {
    private final STTService sttService;

    @PostMapping("/stt")
    public ResponseEntity<Message> stt(@RequestBody MultipartFile file) {
        String resultText = sttService.recognize(file);

        return ResponseEntity.ok(new Message(resultText));
    }
}
