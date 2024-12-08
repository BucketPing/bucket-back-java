package com.BucketPing.mybatis.mapper;

import com.BucketPing.domain.Bucket;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BucketMapper {
    void insertBucket(Bucket bucket);

    void insertBucketCategories(int bucketId, List<Integer> categories);

    void updateBucket(Bucket bucket);

    void updateBucketCategories(int bucketId, List<Integer> categories);
}
