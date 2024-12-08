package com.BucketPing.service;
import com.BucketPing.domain.Bucket;
import com.BucketPing.mybatis.mapper.BucketMapper;
import org.springframework.stereotype.Service;

@Service
public class BucketServiceImpl implements BucketService {
    private BucketMapper dao;

    @Override
    public void insertBucket(Bucket bucket) {
        dao.insertBucket(bucket);
        if(bucket.getCategories() != null && !bucket.getCategories().isEmpty()) {
            dao.insertBucketCategories(bucket.getBucketId(), bucket.getCategories());
        }
    }

    @Override
    public void updateBucket(Bucket bucket) {
        dao.updateBucket(bucket);
        if(bucket.getCategories() != null && !bucket.getCategories().isEmpty()) {
            dao.updateBucketCategories(bucket.getBucketId(), bucket.getCategories());
        }
    }
}
