package com.BucketPing.domain;

import java.util.List;
public class User {
    private int userId;
    private String nickname;
    private String profile;
    private String email;
    private String createdAt;
    private List<Integer> bookmarkList; // user_bookmarks 테이블에서 참조된 bookmarkId 리스트

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<Integer> getBookmarkList() {
        return bookmarkList;
    }

    public void setBookmarkList(List<Integer> bookmarkList) {
        this.bookmarkList = bookmarkList;
    }
}
