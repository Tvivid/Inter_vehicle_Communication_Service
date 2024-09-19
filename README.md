# 프로젝트명(팀명:______)
    
    ### DriveSmile : 차량 간 소통 독려 서비스 (네잎클로버)
    
# 서비스소개
    - 운전자의 페인포인트인 “차량 간 소통 문제”를 해결하기 위한 “차량 간 소통 독려 서비스”입니다.
    - 차량 앞뒤 유리에 디스플레이를 설치한 뒤 메세지,이모티콘,이미지를 송출합니다.
    - 송출된 디스플레이 화면을 통해 앞뒤 차량과 소통할 수 있습니다.
    - 어플리케이션과 인포테인먼트를 연동하여 원하는 기능을 설정할 수 있습니다.
    - 인포테인먼트와 디스플레이를 연결하여 송출하고자 하는 메세지,이모티콘,이모지를 선택할 수 있습니다.


![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/fcef9ffa-31f3-4c45-8936-e5a8fcbdd843/c86fae26-8d57-4c01-8190-7466c1612757/image.png)

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/fcef9ffa-31f3-4c45-8936-e5a8fcbdd843/848f2338-31a7-4dd8-ad70-1a9e9e8a2059/image.png)

# 프로젝트기간
    
    전체 프로젝트 기간 : 2024.09.05 ~ 2024.09.13
    
    개발 기간 : 2024.09.09 ~ 2024.09.13
    
    UI 구현 : 2024.09.05 ~ 2024.09.06
    
# 주요기능
    
    1) 아이콘 설정 값 커스터마이징
    
    2) 인포테인먼트에 설정 값 반영
    
    3) 인포테인먼트 화면에서 차량 디스플레이로 메세지 송출
    

# 기술스택
    
    HTML/CSS, JavaScript, Java, Oracle, C#
    
<img src="https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=html5&logoColor=white">
<img src="https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white">

<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">

<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white"/> 

<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"/> 

<img src=”https://img.shields.io/badge/-C%23-000000?logo=Csharp&style=flat”/>

<img src="https://img.shields.io/badge/Oracle 11g-F80000?style=for-the-badge&logo=Oracle&logoColor=white"/>

<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"/>

<img src="https://img.shields.io/badge/Oracle 11g-F80000?style=for-the-badge&logo=Oracle&logoColor=white"/> 

# 시스템 아키텍처


# 유스케이스
    
    
| **유스케이스 이름** | 로그인 |
| --- | --- |
| **우선순위** | 하 |
| **이벤트 흐름** | • 사용자가 홈 화면 오른쪽 상단에 있는 로그인 버튼을 클릭할 시 로그인 페이지로 이동한다. |
|  | • 로그인 정보(아이디, 비밀번호)를 모두 유효하게 기입 했을 경우, 홈 화면으로 돌아간다. |
| | • 로그인 정보가 유효하지 않을 경우, 올바른 정보를 입력해달라는 문구가 제시된다. |
| **종료조건** | 브라우저 종료, 로그인 완료 시 |

| **유스케이스 이름** | 회원가입 |
| --- | --- |
| **우선순위** | 하 |
| **이벤트 흐름** | • 사용자가 로그인 페이지에서 회원가입 버튼을 클릭할 시, 회원가입 페이지로 이동한다. |
|  | • 회원가입 정보를 모두 유효하게 기입 했을 경우, 회원가입이 완료되고 로그인 창으로 이동한다. |
|  | • 회원가입 정보가 유효하지 않을 경우, 회원가입이 되지 않으며 올바른 정보를 입력해달라는 문구가 제시된다. |
| **종료조건** | 브라우저 종료, 회원가입 완료 시, 로그인 버튼 클릭 시 |

| **유스케이스 이름** | 감정 아이콘 값 변경 |
| --- | --- |
| **우선순위** | 상 |
| **이벤트 흐름** | • 사용자가 대표 아이콘의 편집 버튼을 클릭할 시, 편집 팝업 페이지가 뜬다. |
|  | • 추천 문구들이 출력이 되고, 그 중에 한가지만 선택을 할 수 있다. |
|  | • 편집 완료 버튼을 클릭할 시, 대표 아이콘의 문구가 변경이 되고 설정 값 변경 페이지로 이동한다. |
|  | • 하나도 선택이 되지 않은 상태로 편집 완료 버튼 클릭 시, 변경사항이 없이 설정 값 변경 페이지로 이동한다. |
| **종료조건** | 편집 완료 버튼 클릭 시, 뒤로가기 버튼 클릭 시 |

| **유스케이스 이름** | CM 값 변경 |
| --- | --- |
| **우선순위** | 상 |
| **이벤트 흐름** | 1. 커스텀 가능 아이콘 (또는 메세지)를 클릭하면 CM 팝업페이지가 뜬다. |
|  |2. 팝업페이지의 상단에서 선정 할 문구를 작성할 수 있다. 이때 이모지 등 특수문자를 첨부할 수 있다. |
| |3. 이미지를 넣고싶다면 이미지 첨부하기 버튼을 눌러 원하는 이미지를 선택하고 첨부하기 버튼을 누른다.|
|  |4. 변경 사항이 없는 경우, 뒤로가기 버튼을 누르면 기존 값을 유지하고 설정값 변경 페이지로 이동한다. |
| **종료조건** | CM 페이지 종료, 변경 완료 시, 뒤로가기 버튼 클릭 시 |

| **유스케이스 이름** | CM 아이콘- 이미지 첨부 |
| --- | --- |
| **우선순위** | 중 |
| **이벤트 흐름** | CM 페이지 내부 이미지 첨부하기 버튼을 눌러 원하는 이미지를 선택하고 첨부하기 버튼을 누른다. |
| **종료조건** | 이미지 첨부의 경우 첨부하기 or x 버튼 클릭 |

| **유스케이스 이름** | CM 아이콘 변경 |
| --- | --- |
| **우선순위** | 중 |
| **이벤트 흐름** | • CM 변경 버튼 클릭할 시, CM 변경 페이지로 이동한다. |
|  | • CM 아이콘 변경 배너에서 사용자가 원하는 값을 입력한 경우 변경되었다는 팝업을 띄운다. |
|  | • CM 변경 페이지에서 변경된 아이콘을 확인할 수 있다. |
|  | • CM 변경 완료 버튼을 클릭 시 변경 완료 팝업 안내 후 설정값 변경 페이지로 이동한다. |
|  | • 변경사항이 없는 경우 기존 값을 유지하고 설정값 변경 페이지로 이동한다. |
| **종료조건** | CM 페이지 종료, 변경 완료 시, 뒤로가기 버튼 클릭 시 |

| **유스케이스 이름** | 메세지 송출 |
| --- | --- |
| **우선순위** | 하 |
| **이벤트 흐름** | • CM 변경 페이지의 미리보기 버튼 클릭 시 해당 값이 디스플레이에 송출되는 모습이 화면에 5초간 송출된다. |
|  | • 미리보기 화면이 끝나면 CM 변경 페이지로 돌아온다. |
|  | • 뒤로가기 버튼 클릭 시 CM 변경 페이지로 돌아온다. |
| **종료조건** | 미리 보기 5초 송출 후, 뒤로가기 버튼 클릭 시, |

| **유스케이스 이름** | 메세지 송출 |
| --- | --- |
| **우선순위** | 상 |
| **이벤트 흐름** | • 인포테인먼트 화면에서 아이콘을 클릭한다. |
|  | • 아이콘에 저장되어 있는 메세지(이모지,이미지)가 차량용 통신을 통해 디스플레이에 전송된다. |
|  | • 전송된 메세지(이모지,이미지)가 디스플레이 화면에 송출된다. |
| **종료조건** | 디스플레이에 메세지 송출 화면 5초 유지 후, 자동 종료한다. |
    
# 서비스 흐름도
    
![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/fcef9ffa-31f3-4c45-8936-e5a8fcbdd843/cd45cd3e-a9e1-4ed1-afa1-e06cda1b0e0d/image.png)
    
# ERD 다이어그램

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/fcef9ffa-31f3-4c45-8936-e5a8fcbdd843/d439d8f7-e3cb-4305-9f13-d1ff14d43e5d/image.png)

# 화면구성
    
![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/fcef9ffa-31f3-4c45-8936-e5a8fcbdd843/66689afb-625e-45c0-b4e4-71cfefb76c89/image.png)

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/fcef9ffa-31f3-4c45-8936-e5a8fcbdd843/2c858c06-4962-495d-b0a7-e62aa01b19a4/image.png)

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/fcef9ffa-31f3-4c45-8936-e5a8fcbdd843/753c5d7a-6cff-487f-8eae-147ee1ef5bae/image.png)

# 최종 ppt
file:///C:/Users/trainee128/Downloads/%EC%B5%9C%EC%A2%85_CX_4%ED%8C%80%EB%84%A4%EC%9E%8E%ED%81%B4%EB%A1%9C%EB%B2%84_%EB%B0%9C%ED%91%9C.pdf 
    
# 팀원역할
    
    이지연(팀장, 유니티 제작, 디자인, ppt 제작)
    진선명(백엔드 개발, ppt 제작)
    이예진(프론트 개발, ppt 제작)
    김서현(프론트 개발, ppt 제작)
    송정민(백엔드 개발, ppt 제작)
