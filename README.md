# HappyCleaner
happily blessing

2016-1-10
---------- R
Requested API all ready to use now.
现在login的username，是admin的email。 如果需要我可以更改。
register的password和confirm password应该前端validate，通过了才发送API request

p.s.:我API的servlet name 都会是这种格式：
		Get____By____Servlet
		LoginAdminServlet
		Update_____Servlet 之类的，不懂可以问我

多增加的API：(以后这里下面是我感觉你可能会要，而多写的API，你不一定用)
GetEmployeeByPassNoServlet


---------- J
需要如下几个API
/login
ajax get
username,password

/register
ajax post
username,password,confirmpassword

/select_employee
ajax get
/add_employee
ajax post
/delete_employee
ajax post
/update_employee
ajax post

---------- J
把hibernate弄好后，记得在这里把数据表的基本信息记录在这里