INSERT INTO book_basic_info
(bbi_seq, bbi_title, bbi_author, bbi_reg_dt, bdi_publisher, bbi_price, bbi_image, bbi_category)
VALUES( 39,'나는 사이보그가 되기로 했다', '피터 스콧', '2022-11-28', '김영사', 19800, '39.jpg', '과학');

INSERT INTO book_detail_info
(bdi_seq, bdi_subtitle, bdi_discount, bdi_translater, bdi_overview, bdi_soldout, bdi_point, bdi_bdi_seq)
VALUES(39, '피터에서 피터 2.0으로', 0.1, '김명주', '불치병에 맞서 사이보그로 진화한 어느 로봇공학자의 특별한 도전
자기 몸을 AI와 융합한 최초의 인간 ‘피터 2.0’이 직접 써내려간 감동 실화
인간이란 무엇인가? 과학은 무엇을 해낼 수 있는가?', 1, 1100, 39);

INSERT INTO book_basic_info
(bbi_seq, bbi_title, bbi_author, bbi_reg_dt, bdi_publisher, bbi_price, bbi_image, bbi_category)
VALUES(40, '동물들처럼', '스티븐 어스태드 저자', '2022-11-30', '월북', 17820, '과학');

INSERT INTO book_basic_info
(bbi_seq, bbi_title, bbi_author, bbi_reg_dt, bdi_publisher, bbi_price, bbi_image, bbi_category)
VALUES(41, '사피엔스의 깊은 역사', '송만호 , 안중호 저자', '2022-9-29', '바다출판사', 16200, '과학');

INSERT INTO book_detail_info
(bdi_subtitle, bdi_discount, bdi_translater, bdi_overview, bdi_soldout, bdi_point, bdi_bbi_seq)
VALUES('과학이 들려주는 138억 년 이야기', 0.1, ,
'태초의 우주에서 현재의 ‘나’로 이어지는 138억 년 우주와 인간의 깊은 역사'
,
 1, 990, 41);


INSERT INTO book_detail_info
(bdi_seq, bdi_subtitle, bdi_discount, bdi_translater, bdi_overview, bdi_soldout, bdi_point, bdi_bdi_seq)
VALUES(40, '진화생물학으로 밝혀내는 늙지 않음의 과학', 0.1, '김성훈', '진화생물학을 기반으로 노화 연구를 해온 세계적 석학 스티븐 어스태드 교수(1946년생)의 책이다. 육지, 바다, 하늘에 사는 장수 동물들의 라이프스타일을 하나하나 들려준다.
고양이만 한 주머니쥐가 불과 석 달 만에 늙어가는 모습을 관찰한 교수는 ‘왜 어떤 종은 빨리 늙고, 왜 어떤 종은 늦게 늙는지’ 궁극적인 의문을 품는다. 그로부터 40년간 자연에서, 연구실에서, 강의실에서 동물 연구에 매진하면서 알게 된 진실을 풀어놓는다.',
1, 990, 40);

INSERT INTO book_detail_info
(bdi_subtitle, bdi_discount, bdi_translater, bdi_overview, bdi_soldout, bdi_point, bdi_bbi_seq)
VALUES('진화생물학으로 밝혀내는 늙지 않음의 과학', 0.1, '김성훈',
'진화생물학을 기반으로 노화 연구를 해온 세계적 석학 스티븐 어스태드 교수(1946년생)의 책이다. 육지, 바다, 하늘에 사는 장수 동물들의 라이프스타일을 하나하나 들려준다.
고양이만 한 주머니쥐가 불과 석 달 만에 늙어가는 모습을 관찰한 교수는 ‘왜 어떤 종은 빨리 늙고, 왜 어떤 종은 늦게 늙는지’ 궁극적인 의문을 품는다. 그로부터 40년간 자연에서, 연구실에서, 강의실에서 동물 연구에 매진하면서 알게 된 진실을 풀어놓는다.'
,
 1, 990, 40);



 INSERT INTO book_basic_info
(bbi_seq, bbi_title, bbi_author, bbi_reg_dt, bbi_publisher, bbi_price, bbi_image, bbi_category)
VALUES(42, '우리에게 보통의 용기가 있다면
', '세스 고딘', '2022-12-10', '책세상', 22500, '42.jpg', '과학');

INSERT INTO book_detail_info
(bdi_subtitle, bdi_discount, bdi_translater, bdi_overview, bdi_soldout, bdi_point, bdi_bbi_seq)
VALUES('기후 위기, 아직 늦지 않았다', 0.1, '성원',
'세스 고딘(Seth Godin)이 2022년 프로젝트로 조직한 비영리단체 ‘탄소 연감 네트워크(The Carbon Almanac Network)’에서 출간한 책 “THE CARBON ALMANAC”의 한국어판이다. ‘전 세계 마케터의 구루’라는 별명을 가진 세스 고딘이 펼치는 ‘선한 영향력’의 일환이기도 한 이 책은 전 세계 300여 명의 자원봉사자가 힘을 모아 만들어졌다. 기후변화와 관련한 200여 편의 글이 간결하게 담겨 누구나 쉽게 접할 수 있고, 모든 글에서 자료의 출처를 제공해 ‘팩트’의 엄밀성을 더했다. 큰 판형으로 제작되어 인포그래픽, 만화, 그림, 표, 그래프 등 시각 자료를 풍부하게 담은 것이 특장점이다. 기후변화 문제에 처음 관심을 가지는 독자, ESG를 고려해야 하는 기획자나 마케터, 거시적 흐름을 읽으려는 투자자, 새로운 정보를 얻으려 하는 환경 운동가나 정책 입안가, 기후변화 관련 교육을 준비하는 교사를 막론하고 두루 읽힐 수 있는 책이다.
',
 1, 1250, 42);


  INSERT INTO book_basic_info
(bbi_seq, bbi_title, bbi_author, bbi_reg_dt, bbi_publisher, bbi_price, bbi_image, bbi_category)
VALUES(43, '나는 연구하고 실험하고 개발하는 과학자입니다', 
'정종수', '2022-11-29', '플루토', 15120, '43.jpg', '과학');


INSERT INTO book_detail_info
(bdi_discount, bdi_overview, bdi_soldout, bdi_point, bdi_bbi_seq)
VALUES( 0.1, 
'세스 고딘(Seth Godin)이 2022년 프로젝트로 조직한 비영리단체 ‘탄소 연감 네트워크(The Carbon Almanac Network)’에서 출간한 책 “THE CARBON ALMANAC”의 한국어판이다. ‘전 세계 마케터의 구루’라는 별명을 가진 세스 고딘이 펼치는 ‘선한 영향력’의 일환이기도 한 이 책은 전 세계 300여 명의 자원봉사자가 힘을 모아 만들어졌다. 기후변화와 관련한 200여 편의 글이 간결하게 담겨 누구나 쉽게 접할 수 있고, 모든 글에서 자료의 출처를 제공해 ‘팩트’의 엄밀성을 더했다. 큰 판형으로 제작되어 인포그래픽, 만화, 그림, 표, 그래프 등 시각 자료를 풍부하게 담은 것이 특장점이다. 기후변화 문제에 처음 관심을 가지는 독자, ESG를 고려해야 하는 기획자나 마케터, 거시적 흐름을 읽으려는 투자자, 새로운 정보를 얻으려 하는 환경 운동가나 정책 입안가, 기후변화 관련 교육을 준비하는 교사를 막론하고 두루 읽힐 수 있는 책이다.
',
 1, 840, 43);

 
  INSERT INTO book_basic_info
(bbi_seq, bbi_title, bbi_author, bbi_reg_dt, bbi_publisher, bbi_price, bbi_image, bbi_category)
VALUES(44, '나는 연구하고 실험하고 개발하는 과학자입니다', 
'정종수', '2022-11-29', '플루토', 15120, '43.jpg', '과학');