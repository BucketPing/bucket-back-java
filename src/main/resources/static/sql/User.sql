CREATE TABLE user
(
    userId    INT AUTO_INCREMENT PRIMARY KEY,
    nickname  VARCHAR(100)        NOT NULL,
    profile   VARCHAR(255), -- 프로필은 선택적이므로 NULL 가능
    email     VARCHAR(255) UNIQUE NOT NULL,
    createdAt DATETIME DEFAULT CURRENT_TIMESTAMP
);