$(function() {
	// get all colleges
	var getAllDepartments = '/cs539project/university/department/listalldepartments';
	// show all colleges to html
	showSearchData();
	
	function showSearchData() {
		var url = getAllDepartments;
		$
				.getJSON(
						url,
						function(data) {
							if (data.success) {
								var studentList = data.allDepartment;
								var html = '';
								// 遍历商品列表，生成可以点击搜索相应商品类别下的商品的a标签
								studentList
										.map(function(item, index) {
											chair =  item.chair
											college = item.college
											html += '<tr>' 
													+ '<td>' + item.dName + '</td>'
													+ '<td>' + item.dPhone + '</td>'
													+ '<td>' + item.dOffice + '</td>'
													+ '<td>' + chair.iName + '</td>'
													+ '<td>' + item.cStartDate + '</td>'
													+ '<td>' + college.cName + '</td>'
													+ '</tr>';
										});
								// 将商品类别a标签绑定到相应的HTML组件中
								console.log(html)
								$('tbody').html(html);
							}
						});
	}
	
});
