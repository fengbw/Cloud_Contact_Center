$(function() {
	// get all colleges
	var getAllSections = '/cs539project/university/section/listallsections';
	// show all colleges to html
	showSearchData();
	
	function showSearchData() {
		var url = getAllSections;
		$
				.getJSON(
						url,
						function(data) {
							if (data.success) {
								var sectionList = data.allSections;
								var html = '';
								// 遍历商品列表，生成可以点击搜索相应商品类别下的商品的a标签
								sectionList
										.map(function(item, index) {
											html += '<tr>' 
													+ '<td>' + item.secNo + '</td>'
													+ '<td>' + item.sem + '</td>'
													+ '<td>' + item.year + '</td>'
													+ '<td>' + item.roomNo + '</td>'
													+ '<td>' + item.course_name + '</td>'
													+ '<td>' + item.credits + '</td>'
													+ '<td>' + item.teacher_name + '</td>'
													+ '</tr>';
										});
								// 将商品类别a标签绑定到相应的HTML组件中
								console.log(html)
								$('tbody').html(html);
							}
						});
	}
	
});
