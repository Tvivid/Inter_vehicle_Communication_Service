


GRANT connect,resource,dba TO c##lab4dx;



CREATE TABLE c##lab4dx.Member (
                       member_id VARCHAR(15) PRIMARY KEY ,  -- 사용자 고유 ID
                       password VARCHAR(15) NOT NULL ,
                       username VARCHAR(10) NOT NULL,  -- 사용자 이름
                       phone_number VARCHAR(13) NOT NULL UNIQUE  -- 이메일 주소 (중복 방지)
);

CREATE TABLE c##lab4dx.Emoji (
                        emoji_id VARCHAR(15) PRIMARY KEY   -- 이모지 고유 ID
);



CREATE TABLE c##lab4dx.Customizing_Setting (
                                               customizing_id VARCHAR(15) NOT NULL,
                                               member_id VARCHAR(15) NOT NULL,
                                               emoji_id VARCHAR(15) NOT NULL,
                                               message VARCHAR(100),
                                               image_path VARCHAR(255),
                                               emoji_color VARCHAR(7) NOT NULL,
                                               PRIMARY KEY (customizing_id, member_id),
                                               FOREIGN KEY (member_id) REFERENCES c##lab4dx.Member(member_id),
                                               FOREIGN KEY (emoji_id) REFERENCES c##lab4dx.Emoji(emoji_id)
);




CREATE TABLE c##lab4dx.Default_Text(
    text_id VARCHAR(15) NOT NULL ,
    sentiment VARCHAR(10) NOT NULL ,
    text VARCHAR(100),
    primary key (text_id, sentiment)
);


CREATE TABLE c##lab4dx.Default_Setting(
    text_id VARCHAR(15) NOT NULL ,
    member_id VARCHAR(15) NOT NULL ,
    sentiment VARCHAR(10) NOT NULL ,
    PRIMARY KEY (member_id, sentiment),
    FOREIGN KEY (text_id, sentiment) REFERENCES c##lab4dx.Default_Text(text_id, sentiment),
    FOREIGN KEY (member_id) REFERENCES c##lab4dx.Member(member_id)
)


