package com.BucketPing.controller;

import com.BucketPing.domain.Bucket;
import com.BucketPing.service.BucketService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    @PostMapping(value="/update")
    public String update(Bucket bucket) throws Exception{
        bucketService.updateBucket(bucket);
        logger.info(bucket.toString());
        return "redirect: /bucket/list";
    }
}
