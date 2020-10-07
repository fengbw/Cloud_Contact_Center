$(function() {
	// get all colleges
	var getAllInstructors = '/cs539project/university/instructor/listallinstructors';
	// show all colleges to html
	showSearchData();
	
	function showSearchData() {
		var url = getAllInstructors;
		$
				.getJSON(
						url,
						function(data) {
							if (data.success) {
								var studentList = data.allInstructors;
								var html = '';
								// 遍历商品列表，生成可以点击搜索相应商品类别下的商品的a标签
								studentList
										.map(function(item, index) {
											department =  item.department
											html += '<tr>' 
													+ '<td>' + item.iName + '</td>'
													+ '<td>' + item.rank + '</td>'
													+ '<td>' + item.iPhone + '</td>'
													+ '<td>' + item.iOffice + '</td>'
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
