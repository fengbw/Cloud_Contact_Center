$(function() {
	// get all colleges
	var getAllGrade = '/cs539project/university/grade/listallgrades';
	// show all colleges to html
	showSearchData();
	
	function showSearchData() {
		var url = getAllGrade;
		$
				.getJSON(
						url,
						function(data) {
							if (data.success) {
								var gradeList = data.allGrades;
								var html = '';
								// 遍历商品列表，生成可以点击搜索相应商品类别下的商品的a标签
								gradeList
										.map(function(item, index) {
											html += '<tr>' 
													+ '<td>' + item.grade + '</td>'
													+ '<td>' + item.student_id + '</td>'
													+ '<td>' + item.student_name + '</td>'
													+ '<td>' + item.sec_year + '</td>'
													+ '<td>' + item.sec_sem + '</td>'
													+ '<td>' + item.sec_id + '</td>'
													+ '<td>' + item.sec_no + '</td>'
													+ '</tr>';
										});
								// 将商品类别a标签绑定到相应的HTML组件中
								console.log(html)
								$('tbody').html(html);
							}
						});
	}
	
});
