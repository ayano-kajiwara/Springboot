-- insert users
INSERT INTO
    users(name, email, created_at, updated_at)
VALUES
(
        '鈴木一郎',
        'suzuki@example.com',
        '2022-06-01 09:00:00',
        '2022-06-01 09:00:00'
    );

INSERT INTO
    users(name, email, created_at, updated_at)
VALUES
(
        '佐藤二郎',
        'satou@example.com',
        '2022-06-10 10:00:00',
        '2022-06-10 10:00:00'
    );

INSERT INTO
    users(name, email, created_at, updated_at)
VALUES
(
        '田中三郎',
        'tanaka@example.com',
        '2022-06-20 11:00:00',
        '2022-06-20 11:00:00'
    );

-- insert boards
INSERT INTO
    boards(title, content, created_at, updated_at)
VALUES
(
        '初投稿！',
        'はじめまして！日常をつぶやきます。',
        '2022-06-01 09:00:00',
        '2022-06-01 09:00:00'
    );

INSERT INTO
    boards(title, content, created_at, updated_at)
VALUES
(
        'おはよう',
        '早起きをした。眠いけど清々しい気分だから、今日も一日頑張る。',
        '2022-06-10 10:00:00',
        '2022-06-10 10:00:00'
    );

INSERT INTO
    boards(title, content, created_at, updated_at)
VALUES
(
        'おやすみ',
        '今日も一日仕事を頑張った。明日に備えて早めに寝ます。',
        '2022-06-20 11:00:00',
        '2022-06-20 11:00:00'
    );