var domeContent={
		
		zTree_Menu:null,
		curMenu:null,
		curDemo:null,
		demoIframe:null,
		/**
		 * 这个对象的init方法
		 */
		_init:function(){
			
			this.demoIframe = $("demoIframe");
			/**
			 * 设置树的参数
			 */
			var setting = {
					view:{
						showIcon:this.showIcon,
						showLine:false,
						selectedMulti:false,
						dblClickExpand:false
					},
					data:{
						simpleData:{
							enable:true,
							rootPId:""
						}
					},
					callback:{
						onNodeCreated:this.onNodeCreated,
						beforeClick:this.beforeClick,
						onClick:this.onClick
					}
			};
			/**
			 * 初始化树
			 */
			demoContent.zTree_Menu = $.fn.zTree.init($("#menuTree"),$.fn.zTree._z.tools.clone(setting),menu_nodes);
			
			this.bindEvent();
			demoContent.showContent();
		},
		bindEvent:function(){
			this.demoIframe.bind("load",demoContent.onload);
		},
		showIcon:function(treeid,treeNode){
			return treeNode.iconSkin;
		},
		/**
		 * 这个方法是打开第一节点的第一个子节点，先为他添加个src，然后打开
		 * @param a
		 */
		showContent:function(a){
			
		},
		
};