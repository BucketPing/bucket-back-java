CREATE TABLE user_bookmarks
(
    userId     INT,
    bookmarkId INT, -- 예를 들어, 'bucket' 테이블의 id일 수도 있습니다
    PRIMARY KEY (userId, bookmarkId),
    FOREIGN KEY (userId) REFERENCES user (userId) ON DELETE CASCADE
);