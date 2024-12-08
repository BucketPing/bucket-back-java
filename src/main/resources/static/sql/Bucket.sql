# create user scott@'%' identified by '1234';
# grant all privileges on BucketPing.* to 'scott'@'%';
#
# flush privileges ;
#
# show grants for scott@'%';
CREATE TABLE Bucket (
                        bucketId INT AUTO_INCREMENT PRIMARY KEY, -- 고유 ID
                        ownerId INT NOT NULL,              -- 소유자 ID
                        title VARCHAR(255) NOT NULL,       -- 제목
                        description TEXT,                  -- 설명
                        maxCapacity INT NOT NULL,          -- 최대 수용 인원
                        progressStatus TINYINT NOT NULL,   -- 상태 (0: 모집중, 1: 진행중, 2: 완료)
                        startDate DATE NOT NULL,           -- 시작일
                        endDate DATE NOT NULL,             -- 종료일
                        createdAt DATETIME                 -- 생성일
);