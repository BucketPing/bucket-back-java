
CREATE TABLE Bucket_Participant (
                                   id INT AUTO_INCREMENT PRIMARY KEY, -- 고유 ID
                                   bucketId INT NOT NULL,             -- Bucket 테이블의 ID 참조
                                   participantId INT NOT NULL,        -- 참가자 ID
                                   FOREIGN KEY (bucketId) REFERENCES Bucket(bucketId) ON DELETE CASCADE
);