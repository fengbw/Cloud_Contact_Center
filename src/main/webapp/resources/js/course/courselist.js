$(function() {
	// get all colleges
	var getAllCourses = '/cs539project/university/course/listallcourses';
	// show all colleges to html
	showSearchData();
	
	function showSearchData() {
		var url = getAllCourses;
		$
				.getJSON(
						url,
						function(data) {
							if (data.success) {
								var coursetList = data.allCourses;
								var html = '';
								// 遍历商品列表，生成可以点击搜索相应商品类别下的商品的a标签
								coursetList
										.map(function(item, index) {
											department =  item.department
											html += '<tr>' 
													+ '<td>' + item.cCode + '</td>'
													+ '<td>' + item.coName + '</td>'
													+ '<td>' + item.credits + '</td>'
													+ '<td>' + item.level + '</td>'
													+ '<td>' + department.dName + '</td>'
													+ '</tr>';
										});
								// 将商品类别a标签绑定到相应的HTML组件中
								console.log(html)
								$('tbody').html(html);
							}
						});
	}
	
});
