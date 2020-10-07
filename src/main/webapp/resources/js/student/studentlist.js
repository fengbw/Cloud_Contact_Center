$(function() {
	// get all colleges
	var getAllStudents = '/cs539project/university/student/listallstudents';
	// show all colleges to html
	showSearchData();
	
	function showSearchData() {
		var url = getAllStudents;
		$
				.getJSON(
						url,
						function(data) {
							if (data.success) {
								var studentList = data.allColleges;
								var html = '';
								// 遍历商品列表，生成可以点击搜索相应商品类别下的商品的a标签
								studentList
										.map(function(item, index) {
											department =  item.department
											html += '<tr>' 
													+ '<td>' + item.sId + '</td>'
													+ '<td>' + item.dob + '</td>'
													+ '<td>' + item.fName + '</td>'
													+ '<td>' + item.mName + '</td>'
													+ '<td>' + item.lName + '</td>'
													+ '<td>' + item.addr + '</td>'
													+ '<td>' + item.phone + '</td>'
													+ '<td>' + item.major + '</td>'
													+ '<td>' + department + '</td>'
													+ '</tr>';
										});
								// 将商品类别a标签绑定到相应的HTML组件中
								console.log(html)
								$('tbody').html(html);
							}
						});
	}
	
});
