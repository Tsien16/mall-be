<html>
<body>
<h2>Hello World!</h2>
<div>SpringMVC上传文件</div>
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data>">
    <input type="file" name="upload_file">
    <input type="submit" value="upload">
</form>

<div>富文本上传文件</div>
<form name="form1" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data>">
    <input type="file" name="upload_file">
    <input type="submit" value="upload">
</form>
</body>
</html>
