package com.kau.ganzi.service;

import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class STTService {

    // application.yml에서 값 가져오기
    @Value("${naver.client-id}")
    private String clientId;

    @Value("${naver.client-secret}")
    private String clientSecret;

    private static final String CLOVA_STT_URL =
            "https://naveropenapi.apigw.ntruss.com/recog/v1/stt?lang=Kor";

    public String recognize(MultipartFile file) {
        try {
            // 파일을 byte 배열로 변환 (바이너리 그대로 전송하기 위함)
            byte[] audioBytes = file.getBytes();

            // 요청 헤더 설정
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM); // binary 전송
            // headers.set("X-NCP-APIGW-API-KEY", clientSecret);    // 네이버 API Secret

            // HTTP 요청 객체 생성 (본문 = byte[], 헤더 포함)
            HttpEntity<byte[]> requestEntity = new HttpEntity<>(audioBytes, headers);

            // HTTP 클라이언트 생성
            RestTemplate restTemplate = new RestTemplate();

            // 실제 요청 전송 (POST 방식)
            ResponseEntity<String> response = restTemplate.postForEntity(
                    CLOVA_STT_URL, requestEntity, String.class);

            // 응답 예시: {"text": "안녕하세요"}
            JSONObject json = new JSONObject(response.getBody());
            return json.getString("text"); // 텍스트만 추출

        } catch (IOException e) {
            throw new RuntimeException("음성 파일을 처리할 수 없습니다", e);
        } catch (Exception e) {
            throw new RuntimeException("Clova API 요청 실패", e);
        }
    }
}