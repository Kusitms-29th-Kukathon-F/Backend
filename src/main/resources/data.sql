INSERT INTO kukathonfrds.user (id, name)
VALUES
    (1,'소민'),
    (2,'민혜'),
    (3,'병진'),
    (4,'승은'),
    (5,'용현'),
    (6,'승희'),
    (7,'시연'),
    (8,'민영'),
    (9,'현정');
INSERT INTO kukathonfrds.running_time (id, user_id, running_time,app,date)
VALUES
    (1,1,3600000,'INSTAGRAM','2024-04-06'),
    (2,1,9000000,'YOUTUBE','2024-04-06'),
    (3,1,8800000,'TWITTER','2024-04-06'),
    (4,1,2000000,'INSTAGRAM','2024-04-05'),
    (5,1,5000000,'YOUTUBE','2024-04-04'),
    (6,1,4000000,'TWITTER','2024-04-03'),
    (7,1,7000000,'YOUTUBE','2024-04-01'),

    (8,2,7000000,'YOUTUBE','2024-04-06'),
    (9,3,7000000,'YOUTUBE','2024-04-06'),
    (10,4,7000000,'YOUTUBE','2024-04-06'),
    (11,5,7000000,'YOUTUBE','2024-04-06'),
    (12,6,7000000,'YOUTUBE','2024-04-06'),
    (13,7,7000000,'YOUTUBE','2024-04-06'),
    (14,8,7000000,'YOUTUBE','2024-04-06'),
    (15,9,7000000,'YOUTUBE','2024-04-06'),

    (16,2,9000000,'YOUTUBE','2024-04-05'),
    (17,3,5700000,'YOUTUBE','2024-04-05'),
    (18,4,2600000,'YOUTUBE','2024-04-05'),
    (19,5,3000000,'YOUTUBE','2024-04-05'),
    (20,6,5500000,'YOUTUBE','2024-04-05'),
    (21,7,6600000,'YOUTUBE','2024-04-05'),
    (22,8,2700000,'YOUTUBE','2024-04-05'),
    (23,9,1000000,'YOUTUBE','2024-04-05');

INSERT INTO kukathonfrds.dopamin_score (id, user_id, day_score, week_score)
VALUES
    (1,1,70,30),
    (2,2,80,20),
    (3,3,30,55),
    (4,4,40,70),
    (5,5,50,60),
    (6,6,60,80),
    (7,7,10,40),
    (8,8,55,45),
    (9,9,85,10);

INSERT INTO kukathonfrds.quest (id,user_id,app,running_time,message,is_success,ago,date)
VALUES
    (1,1,'YOUTUBE',7200000,'유튜브를 2시간 전으로 사용해보세요',false,0,'2024-04-07'),
    (2,1,'INSTAGRAM',1800000,'인스타그램을 30분 전으로 사용해보세요',true,1,'2024-04-06'),
    (3,1,'TWITTER',3300000,'X를 55분 전으로 사용해보세요',false,2,'2024-04-05'),
    (4,1,'YOUTUBE',5400000,'유튜브를 1시간 30분 전으로 사용해보세요',true,3,'2024-04-04'),
    (5,1,'TWITTER',1200000,'X를 20분 전으로 사용해보세요',true,4,'2024-04-03'),
    (6,1,'TWITTER',2400000,'X를 40분 전으로 사용해보세요',true,5,'2024-04-02'),
    (7,1,'INSTAGRAM',2400000,'인스타그램을 40분 전으로 사용해보세요',true,6,'2024-04-01');

INSERT INTO kukathonfrds.item (id, name, grade,is_open)
VALUES
    (1,'shovel','COMMON',false),
    (2,'shovel','NORMAL',false),
    (3,'shovel','RARE',true),

    (4,'hat','COMMON',false),
    (5,'hat','NORMAL',false),
    (6,'hat','RARE',true),

    (7,'glass','COMMON',true),
    (8,'glass','NORMAL',true),
    (9,'glass','RARE',false),

    (10,'tie','COMMON',false),
    (11,'tie','NORMAL',false),
    (12,'tie','RARE',false),

    (13,'shoes','COMMON',false),
    (14,'shoes','NORMAL',true),
    (15,'shoes','RARE',false);

INSERT INTO kukathonfrds.gift_box (id,item_id,user_id,is_open,period)
values
    (1,4,1,false,'day'),
    (2,13,1,false,'week');
