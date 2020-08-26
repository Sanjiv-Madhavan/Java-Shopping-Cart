$(function(){
	window.alert(category);
	
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
		case category.name:
		$("#listProducts").addClass('active');
		break;
		default:
		$("#home").addClass('active');
		break;
	}
	
});