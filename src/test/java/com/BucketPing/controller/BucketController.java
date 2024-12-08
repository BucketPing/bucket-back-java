package com.BucketPing.controller;

import com.BucketPing.domain.Bucket;
import com.BucketPing.service.BucketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value="/bucket")
public class BucketController {
    private static final Logger logger = LoggerFactory.getLogger(BucketController.class);

    private BucketService bucketService;

    public BucketController(BucketService bucketService) { this.bucketService = bucketService; }

    @PostMapping(value="/create")
    public String add(Bucket bucket)
            throws Exception{
        bucketService.insertBucket(bucket); //저장 메서드 호출
        logger.info(bucket.toString());// Bucket 값 확인
        return "redirect: /bucket/list";
    }

}
