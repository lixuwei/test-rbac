/**
 * 将页面上的事件都封装在该对象中
 * @type 
 */
var login = {
	smbtn:null,
	rebtn:null,
	loginName:null,
	password:null,
	loginMsg:null,
	pageform:null,
	/**
	 * 初始化该方法
	 */
	initEvent:function(){
		this.smbtn = $("#smbtn");
		this.rebtn = $("#rebtn");
		this.loginName = $("input[name='loginName']");
		this.password = $("input[name='password']");
		this.pageform = $("#forward");
		
		this.smbtn.bind("click",this.submit);
		this.rebtn.bind("click",this.reset);
	},
	/**
	 * 登录事件
	 */
	submit:function(){
		$.post("user/user_login.action",{loginName:login.loginName.val(),password:login.password.val()},login.postHandler);
	},
	/**
	 *  表达内容重置
	 */
	reset:function(){
		login.loginName.val("");
		login.password.val("");
	},
	/**
	 * 处理回调函数
	 */
	postHandler:function(data){
		console.info(data);
		if(data.loginMsg.indexOf("success")==-1){
			/**
			 * 用户提示
			 */
			alert(data.loginMsg);
		}else{
			/**
			 * 跳转页面
			 */
			login.pageform.submit();
		}
	}
};

$().ready(function(){
	/**
	 * 初始化页面上的事件
	 */
	login.initEvent();
});