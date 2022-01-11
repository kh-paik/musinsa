# Category Service 과제입니다.

## 환경 구축

### (1) JDK 설치

* JDK 11 설치해야 합니다.

### (2) Git Clone

* Home 디렉토리에서 클론 받습니다.

### (3) H2 Database 설치 & 실행

* https://www.h2database.com/html/main.html 접속합니다.
* Download -> All Platforms 다운로드합니다.
* zip 파일을 압축 해제합니다.
* 압축 해제된 디렉토리 h2/bin/ 으로 이동합니다.
* h2.sh 실행합니다.
    * $ sh h2.sh
* 브라우저 H2 콘솔 창에서 다음과 같이 설정합니다.
    * 저장한 설정: Generic H2 (Embedded)
    * JDBC URL: jdbc:h2:~/musinsa/database
    * 사용자명: sa
    * 비밀전호: 없음

### (4) 빌드 & 실행

* Clone 받은 디렉토리로 이동합니다.
* 빌드한 파일을 실행합니다.
    * $ ./gradlew bootRun

## 데이터 셋

* 무신사 상단 10개의 카테고리에 해당하는 하위 카테고리 데이터로 DB를 자동 초기화합니다.
* 이후 아래의 API를 통해 카테고리 혹은 하위 카테고리를 추가/삽입/삭제 할 수 있습니다.

## API List

### 카테고리 조회 API

* 모든 카테고리 조회
    * [GET] 127.0.0.1:8080/user/categories
    * 카테고리명이 배열 형태로 반환됩니다.
* 특정 카테고리의 하위 카테고리 조회
    * [GET] 127.0.0.1:8080/user/categories/{categoryId}
        * Event 가 발생한 HTML 에는 CategoryId 정보가 존재한다고 가정합니다.
    * 하위 카테고리명이 배열 형태로 반환됩니다.
* 모든 하위 카테고리 조회
    * [GET] 127.0.0.1:8080/user/categories/all
    * 모든 하위 카테고리명이 배열 형태로 반환됩니다.

### 카테고리 생성 API

* 특정 카테고리 생성
    * [POST] 127.0.0.1:8080/admin/categories
        * RequestBody: {"categoryName": "무신사 스탠다드"}
    * 기존에 존재하는 카테고리가 존재하면 상태코드 400과 함께 -1이 반환됩니다.
    * 정상적으로 카테고리가 생성되면 삽입된 카테고리 ID가 반환됩니다.
* 특정 하위 카테고리 생성
    * [POST] 127.0.0.1:8080/admin/categories/{categoryId}
        * RequestBody: {"subCategoryName": "와이드 슬랙스"}
    * 상위 카테고리가 생성되어야 추가될 수 있습니다.
    * 기존에 존재하는 하위 카테고리가 존재하면 상태코드 400과 함께 -1이 반환됩니다.
    * 정상적으로 하위 카테고리가 생성되면 삽입된 하위 카테고리 ID가 반환됩니다.

### 카테고리 수정 API

* 특정 카테고리명 수정
    * [PUT] 127.0.0.1:8080/admin/categories
        * RequestBody: {"categoryId": 1, "categoryName": "Toy"}
    * 변경 성공시, 변경된 카테고리명이 반환됩니다.
* 특정 하위 카테고리명 수정
    * [PUT] 127.0.0.1:8080/admin/categories/{categoryId}
        * RequestBody: {"subCategoryId": 1, "subCategoryName": "Lego"}
    * 변경 성공시, 변경된 하위 카테고리명이 반환됩니다.

### 카테고리 삭제 API

* 특정 카테고리 삭제
    * [DELETE] 127.0.0.1:8080/admin/categories/{categoryId}
    * 삭제 성공시, 삭제된 카테고리 ID가 반환됩니다.
* 특정 하위 카테고리 삭제
    * [DELETE] 127.0.0.1:8080/admin/categories/{categoryId}/{subCategoryId}
    * 삭제 성공시, 삭제된 하위 카테고리 ID가 반환됩니다.  