# Category Service 과제입니다.

## API List

### 카테고리 조회 API

* 모든 카테고리 조회
    * [GET] 127.0.0.1:8080/user/categories
* 특정 카테고리의 하위 카테고리 조회
    * [GET] 127.0.0.1:8080/user/categories/{categoryId}
        * Event 가 발생한 HTML 에는 CategoryId 정보가 존재한다고 가정합니다.
* 모든 하위 카테고리 조회
    * [GET] 127.0.0.1:8080/user/categories/all

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