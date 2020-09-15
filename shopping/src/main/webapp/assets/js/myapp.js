$(function(){

	
	switch(menu){
		case 'About Us':
		$("#about").addClass('active');
		break;
		case 'Contact Us':
		$("#contact").addClass('active');
		break;
		case 'All Products':
		$("#listProducts").addClass('active');
		break;
		/*case category.name:
		$("#listProducts").addClass('active');
		break;*/
		default:
		//$("#home").addClass('active');
		break;
	}
	
	var products = [
		['1', 'ABC'],
		['2', 'CVB'],
		['3', 'SBC'],
		['4', 'FDA'],
		['5', 'WEH'],
		['6', 'WAP'],
		['7', 'SAP'],
		['8', 'UID'],
		['9', 'LAP']
	];
	
	var $table = $('#productListTable');
	if($table.length)
	{
		//console.log('Inside Table \n');
		$table.DataTable({
			lengthMenu:[[3, 5, 10, -1],['3 Records', '5 Records', '10 Records', 'All Records']],
			pageLength:5,
			data:products
		});
	}
	
});