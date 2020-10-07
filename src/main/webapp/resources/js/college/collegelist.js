$(function() {
	// get all colleges
	var getAllColleges = '/cs539project/university/colleges/listallcolleges';
	// show all colleges to html
	showSearchData();
	
	function showSearchData() {
		var url = getAllColleges;
		$
				.getJSON(
						url,
						function(data) {
							if (data.success) {
								var collegeList = data.allColleges;
								var html = '';
								// 遍历商品列表，生成可以点击搜索相应商品类别下的商品的a标签
								collegeList
										.map(function(item, index) {
											dean =  item.instructor
											html += '<tr>' 
													+ '<td>' + item.cName + '</td>'
													+ '<td>' + item.cPhone + '</td>'
													+ '<td>' + item.cOffice + '</td>'
													+ '<td>' + dean.iName + '</td>'
													+ '</tr>';
										});
								// 将商品类别a标签绑定到相应的HTML组件中
								console.log(html)
								$('tbody').html(html);
							}
						});
	}
	
});
