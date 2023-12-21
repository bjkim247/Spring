<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>회원 가입 정보 입력</title>
  <!-- 부트스트랩 CSS -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/style.css" type="text/css" rel="stylesheet" />
</head>
<body class="text-primary">
  <div class="container mt-5">
    <form method="post" action="member.mdo?cmd=regProc" name="regForm">
      <div class="card">
        <div class="card-header text-center">
          <h4>회원 가입 정보 입력</h4>
        </div>
        <div class="card-body">
          <div class="form-group row">
            <label class="col-sm-2 col-form-label text-right">아이디 :</label>
            <div class="col-sm-10">
              <div class="input-group">
                <input type="text" class="form-control" name="id" placeholder="아이디를 입력하세요" />
                <div class="input-group-append">
                  <button class="btn btn-outline-secondary" type="button" onclick="idCheck(this.form.id.value)">중복확인</button>
                </div>
              </div>
            </div>
          </div>
          <div class="form-group row">
            <label class="col-sm-2 col-form-label text-right">패스워드 :</label>
            <div class="col-sm-10">
              <input type="password" class="form-control" name="pass" />
            </div>
          </div>
          <!-- 다른 폼 요소들도 유사한 방식으로 변경 가능 -->
          	<form method="post" action="member.mdo?cmd=regProc" name="regForm">
		<table border="1">
			<tr>
				<td colspan="2" align="center">회원 가입 정보 입력</td>
			</tr>
			<tr>
				<td align="right">아이디 :</td>
				<td><input type="text" name="id" size="20" />&nbsp; <input
					type="button" value="중복확인" onClick="idCheck(this.form.id.value)" /></td>
			</tr>
			<tr>
				<td align="right">패스워드 :</td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td align="right">패스워드 확인 :</td>
				<td><input type="password" name="repass" /></td>
			</tr>
			<tr>
				<td align="right">이름 :</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td align="right">전화번호 :</td>
				<td><select name="phone1">
						<option value="02">02</option>
						<option value="011">011</option>
				</select>&nbsp;-&nbsp; <input type="text" name="phone2" size="5" />
					&nbsp;-&nbsp; <input type="text" name="phone3" size="5" /></td>
			</tr>
			<tr>
				<td align="right">이메일 :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td align="right">우편번호 :</td>
				<td><input type="text" name="zipcode" size="20" />&nbsp; <input
					type="button" value="찾기" onClick="zipCheck()" /></td>
			</tr>
			<tr>
				<td align="right">주소1 :</td>
				<td><input type="text" name="address1" size="50" /></td>
			</tr>
			<tr>
				<td align="right">주소2 :</td>
				<td><input type="text" name="address2" size="30" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button"
					value="회원가입" onClick="inputCheck()" />&nbsp;&nbsp;
					<input type="submit"
					value="submit" onClick="inputCheck()" />&nbsp;&nbsp;
					 <input
					type="reset" value="다시입력" /></td>
			</tr>
		</table>
	</form>
          <div class="form-group row">
            <div class="col-sm-12 text-center">
              <button type="button" class="btn btn-primary" onclick="inputCheck()">회원가입</button>
              <button type="submit" class="btn btn-primary" onclick="inputCheck()">제출</button>
              <button type="reset" class="btn btn-primary">다시입력</button>
            </div>
          </div>
        </div>
      </div>
    </form>
  </div>

  <!-- 부트스트랩 JS 및 jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

  <script type="text/javascript" src="script.js"></script>
</body>
</html>
