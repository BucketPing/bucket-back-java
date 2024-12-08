
CREATE TABLE Bucket_Category (
                                 categoryId INT AUTO_INCREMENT PRIMARY KEY, -- 고유 ID
                                bucketId INT NOT NULL,             -- Bucket 테이블의 ID 참조
                                categoryCode TINYINT NOT NULL,     -- 카테고리 코드
                                FOREIGN KEY (bucketId) REFERENCES Bucket(bucketId) ON DELETE CASCADE
);