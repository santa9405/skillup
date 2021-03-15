# ⭐️Portfolio - Skill Up


<!-- contents -->
<details open="open">
  <summary>Contents</summary>
  <ol>
    <li>
      <a href="#개요">개요</a>
    </li>
    <li>
      <a href="#내용">내용</a>
    </li>
    <li><a href="#구현-기능">구현 기능</a>
      <ul>
        <li><a href="#전문가-등록-신청-목록-조회">전문가 등록 신청 목록 조회</a></li>
        <li><a href="#전문가-등록-신청-상세-조회">전문가 등록 신청 상세 조회</a></li>
        <li><a href="#전문가-마이페이지-수정">전문가 마이페이지 수정</a></li>
        <li><a href="#전문가-정보-상세-조회">전문가 정보 상세 조회</a></li>
        <li><a href="#수강-리뷰-작성">수강 리뷰 작성</a></li>
      </ul>
    </li>
  </ol>
</details>

------------

# 📝개요

* 프로젝트 명 : Skill Up

* 일정 : 2020년 12월 02일~2021년 01월 25일

* 개발 목적 : 사람들의 능력을 쉽게 나누며 돈도 벌 수 있도록 도와주는<br> 4차 산업혁명 시대에 맞는 플랫폼 제작

* 개발 환경
  - O/S : Windows 10
  - Server : Apache-tomcat-8.5.61
  - Java EE IDE : Eclipse ( version 2020-06 (4.16.0) )
  - Database : Oracle SQL Developer ( version 20.2.0 )
  - Programming Language : JAVA, HTML, CSS, JavaScript, JSP, SQL
  - Client Framework : jQuery 3.5.1, Bootstrap v4.6.x
  - API : JAVA Mail, import
  - Version management : Git

------------

# 📝내용

* 팀원별 역할
  - 공통 : 기획, 요구사항 정의, 와이어 프레임, DB설계
  - 강수정 : 전문가 신청, 전문가 마이페이지, 전문가 조회, 리뷰
  - 김정민 : 게시판, 쪽지
  - 김태우 : 수강 목록, 결제
  - 조유림 : 회원가입, 로그인, 마이페이지, 수업 목록, 좋아요

* 구현 기능
  - 전문가 등록 신청(저장, 신청)
  - 전문가 신청 목록 조회, 검색
  - 전문가 신청 상세 조회, 승인
  - 전문가 마이페이지 수정
  - 전문가 정보 상세 조회
  - 리뷰(조회, 작성, 삭제, 신고)

* 설계의 주안점
  - 전문가의 전문성을 확인하고 승인할 수 있도록 할 것.
  - 다양한 분야의 서비스(카테고리)를 제공할 수 있도록 할 것.
  - 전문가 on/off 기능으로 타 전문가의 수업을 수강할 수 있도록 할 것.
  - 각 수업에 대한 결제 시스템 제공할 수 있도록 할 것.
  - 다양한 옵션으로 검색 가능하게 할 것.

* DB 설계
![SKILLUP](https://user-images.githubusercontent.com/72387870/111019674-3773be80-8404-11eb-8338-5241ac19ef11.png)

------------

# 📝구현 기능

### 전문가 등록 신청
  * 화면 설명 : 회원이 전문가로의 활동을 원하는 경우 관리자에게 승인 요청을 보낼 내용을 작성하는 페이지입니다.
   ![1_전문가_등록_작성](https://user-images.githubusercontent.com/72387870/111020482-938d1180-8409-11eb-8eb1-f2d4afa47175.png)

  * 구현 기능 설명
     - 페이지 로딩 완료 시 Session에 있는 회원의 이름과 이메일이 출력됩니다.
     - 카테고리는 select box를 이용하여 선택할 수 있습니다.
     - 전문가 활동 시 사용할 프로필 사진을 선택하여 첨부할 수 있습니다.(jpg, png만 업로드 가능)
     - 소개, 경력은 글자 수 제한이 있기 때문에 Javascript를 이용하여 입력한 글자 수를 확인할 수 있도록 했습니다.
     - 전문가 인증 시 관리자가 확인할 수 있는 전문가 인증 파일(경력, 수상내역 등)을 첨부할 수 있습니다.
     - 초기화 버튼 클릭 시 작성, 첨부된 모든 요소가 초기화 됩니다.
     - 저장 버튼 클릭 시 작성, 첨부된 모든 요소가 저장됩니다.
      ![1_전문가_등록_인증_파일_다운로드](https://user-images.githubusercontent.com/72387870/111021741-e074e600-8411-11eb-80d2-8eee997ba187.png)
     - 저장 후 추후 전문가 신청 작성 시 저장된 모든 요소가 불러와지며 첨부했던 인증 파일은 다운로드해 확인할 수 있습니다.
     - 인증 파일은 새로 업로드할 수 있습니다.

------------

### 전문가 등록 신청 목록 조회

  * 화면 설명 : 관리자가 전문가 승인 신청 목록을 조회하는 페이지입니다.
   ![2_전문가_승인_목록](https://user-images.githubusercontent.com/72387870/111021750-fa162d80-8411-11eb-9c76-5dc228bd129e.png)
  
  * 구현 기능 설명
     - 페이지 로딩 완료 시 신청 번호, 전문가 번호, 이름, 카테고리, 승인 여부가 출력됩니다.
     - 한 페이지당 10개의 목록이 출력되며 그 이상은 페이징 바를 이용하여 볼 수 있습니다.
       ![2_전문가_승인_검색목록](https://user-images.githubusercontent.com/72387870/111022009-6e050580-8413-11eb-8754-1570c6a97cbe.png)
     - 전문가 번호, 작성자, 승인 여부로 검색할 수 있습니다.
     - 조회하고 싶은 신청을 클릭하면 상세 보기 페이지로 이동됩니다.

------------

### 전문가 등록 신청 상세 조회
  * 화면 설명 : 전문가 승인 목록을 상세 조회하는 페이지로, 전문가로 승인할 수 있습니다.
     ![2_전문가_승인_상세조회](https://user-images.githubusercontent.com/72387870/111032420-7aa74f00-844f-11eb-8069-da18bd6c8f81.png)
     - 페이지 로딩 완료 시 전문가 등록을 신청한 회원의 사진, 전문가 번호, 이름, 카테고리, 소개, 경력, 인증 파일이 출력됩니다.
     ![2_전문가_승인_상세조회_인증파일_다운로드](https://user-images.githubusercontent.com/72387870/111032502-e5588a80-844f-11eb-8026-408ab19e4aea.png)
     - 인증 파일은 다운로드해 확인할 수 있습니다.
     - 승인하기 버튼을 누르면 DB의 승인 여부 컬럼이 'N'에서 'Y'로 변경됩니다.

------------

### 전문가 마이페이지 수정
  * 화면 설명 : 전문가 정보를 수정하고 수업에 남겨진 리뷰를 조회하고 신고할 수 있는 페이지입니다.
     ![4_전문가_마이페이지_수정](https://user-images.githubusercontent.com/72387870/111032853-a3c8df00-8451-11eb-97c0-6cc6c2626a97.png)
     - 페이지 로딩 완료 시 전문가 프로필 사진, 강사 번호, 이름, 카테고리, 소개, 경력이 출력됩니다.
     - 파일 선택하기 버튼을 통해 프로필 사진을 수정할 수 있습니다.<br>
     - 카테고리, 소개, 경력 수정이 가능하고 소개와 경력은 전문가 신청 때와 마찬가지로<br> Javascript를 이용하여 입력한 글자 수를 확인할 수 있도록 했습니다.
     - 수업 리뷰는 수업명, 만족도, 수강생 아이디, 작성일, 내용이 출력되며 신고 버튼을 통해 신고할 수 있습니다.
     - 신고 종류 카테고리 선택 후 제목과 내용을 입력하여 신고하기 버튼을 클릭하면 신고가 접수됩니다.
     ![5_리뷰_신고](https://user-images.githubusercontent.com/72387870/111173263-da396200-85e9-11eb-8234-195a9cf5e145.png)
    
------------    
    
### 전문가 정보 상세 조회
  * 화면 설명 : 수강생이 전문가의 정보를 조회하는 페이지입니다.
     ![3_전문가_상세보기1](https://user-images.githubusercontent.com/72387870/111033414-6fa2ed80-8454-11eb-84c6-c8d2915493f1.png)
     ![3_전문가_상세보기2](https://user-images.githubusercontent.com/72387870/111033462-aaa52100-8454-11eb-9370-5ece0e9b134f.png)
     ![3_전문가_상세보기3_수정](https://user-images.githubusercontent.com/72387870/111170661-86c61480-85e7-11eb-8183-f2759983cb4d.png)
     - 페이지 딩 완료 시 프로필 사진, 카테고리, 리뷰 개수, 리뷰 평균 만족도, 소개, 경력, 진행 중인 수업, 수강 리뷰가 출력됩니다.
     - 진행 중인 수업은 10개가 조회되고 그 이상은 페이징 바를 이용하여 볼 수 있습니다.

------------

### 수강 리뷰 작성
  * 화면 설명 : 해당 전문가의 수강 리뷰를 작성할 수 있는 화면입니다.
    ![3_전문가_상세보기_리뷰쓰기](https://user-images.githubusercontent.com/72387870/111057163-85ea9100-84c8-11eb-8661-ae92083a4207.png)
    - 전문가 상세 조회 시 리뷰 쓰기 버튼을 클릭하여 작성할 수 있습니다.<br>
    ![3_전문가_상세보기_리뷰쓰기2](https://user-images.githubusercontent.com/72387870/111105822-24452800-8597-11eb-8eef-ea42de722006.png)
    - 해당 전문가의 수강완료된 수업 명을 select box로 선택할 수 있습니다.
    - 만족도는 range bar를 이용하였으며 0% ~ 100%로 선택할 수 있습니다.
    - 후기 입력 후 등록하기 버튼을 누르면 리뷰가 등록됩니다.
    ![image](https://user-images.githubusercontent.com/72387870/111106296-2fe51e80-8598-11eb-9013-5fff4ed978e3.png)
    - 자신이 작성한 리뷰일 때만 수정, 삭제 버튼이 출력되며 버튼을 통해 수정, 삭제가 가능합니다.

------------

<p align="center">
감사합니다😄
</p>
