package com.BucketPing.domain;

import java.util.List;

public class Bucket {
    private int bucketId;                // 버킷 고유 ID
    private int ownerId;           // 소유자 ID
    private String category;       // 카테고리
    private String title;          // 버킷 제목
    private String description;    // 버킷 설명
    private int maxCapacity;       // 최대 인원수
    private String progressStatus; // 진행 상태 ('모집중', '진행중', '완료')
    private String startDate;      // 시작 날짜
    private String endDate;        // 종료 날짜
    private String createdAt;      // 생성 날짜


    // BucketCategory를 리스트로 포함
    private List<Integer> categories; // categoryCode 목록

    public int getBucketId() {
        return bucketId;
    }

    public void setBucketId(int bucketId) {
        this.bucketId = bucketId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getProgressStatus() {
        return progressStatus;
    }

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

}
