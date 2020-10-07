$(function() {
	// get all colleges
	var getAllSDT = '/cs539project/university/sectiondaystime/listallsectiondaystimes';
	// show all colleges to html
	showSearchData();
	
	function showSearchData() {
		var url = getAllSDT;
		$
				.getJSON(
						url,
						function(data) {
							if (data.success) {
								var gradeList = data.allSectionDaysTimes;
								var html = '';
								// 遍历商品列表，生成可以点击搜索相应商品类别下的商品的a标签
								gradeList
										.map(function(item, index) {
											html += '<tr>' 
													+ '<td>' + item.sect_id + '</td>'
													+ '<td>' + item.days_time + '</td>'
													+ '<td>' + item.startTime + '</td>'
													+ '<td>' + item.endTime + '</td>'
													+ '</tr>';
										});
								// 将商品类别a标签绑定到相应的HTML组件中
								console.log(html)
								$('tbody').html(html);
							}
						});
	}
	
});
