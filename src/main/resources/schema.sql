-- usersテーブル作成
CREATE TABLE users
(
   id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   email VARCHAR(100) NOT NULL,
   created_at DATETIME NOT NULL,
   updated_at DATETIME NOT NULL,
   PRIMARY KEY(id)
);

-- boardsテーブル作成
CREATE TABLE boards (
   id INT NOT NULL AUTO_INCREMENT,
   title VARCHAR(20) NOT NULL,
   content VARCHAR(140) NOT NULL,
   created_at DATETIME NOT NULL,
   updated_at DATETIME NOT NULL,
   PRIMARY KEY(id)
);