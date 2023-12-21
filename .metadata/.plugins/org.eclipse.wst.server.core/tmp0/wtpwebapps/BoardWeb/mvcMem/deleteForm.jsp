<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>회원탈퇴</title>
  <!-- 부트스트랩 CSS -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card">
          <div class="card-header">
            <h3 class="text-center">회원탈퇴</h3>
          </div>
          <div class="card-body">
            <form action="member.mdo?cmd=deleteProc" name="myForm" method="post" onsubmit="return checkIt()">
              <div class="form-group">
                <label for="pass">비밀번호 입력</label>
                <input type="password" class="form-control" id="pass" name="pass" placeholder="비밀번호를 입력하세요">
              </div>
              <div class="text-center">
                <button type="submit" class="btn btn-danger">회원탈퇴</button>
                <a href="member.mdo?cmd=login" class="btn btn-secondary">취소</a>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <!-- 부트스트랩 JS 및 jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

  <script type="text/javascript">
    function checkIt() {
      if (!document.myForm.pass.value) {
        alert("비밀번호를 입력하지 않았습니다.");
        document.myForm.pass.focus();
        return false;
      }
      return true;
    }
  </script>
</body>
</html>
