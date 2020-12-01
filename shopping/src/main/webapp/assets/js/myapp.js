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
			case 'Manage Products':
			$("#manageProducts").addClass('active');
			break;
			/*case category.name:
			$("#listProducts").addClass('active');
			break;*/
			default:
			//$("#home").addClass('active');
			break;
		}
		
		var products = [
			['1', 'ABC', 1234, 1],
			['2', 'CVB', 1234, 1],
			['3', 'SBC', 1234, 1],
			['4', 'FDA', 1234, 1],
			['5', 'WEH', 1234, 1],
			['6', 'WAP', 1234, 1],
			['7', 'SAP', 1234, 1],
			['8', 'UID', 1234, 1],
			['9', 'LAP', 1234, 1]
		];
		
		var $table = $('#productListTable');
		if($table.length)
		{
			
			var jsonUrl  = '';
			/*console.log(window.categoryId);*/
			
			if(window.categoryId == '')
			{
				jsonUrl = window.contextroot + '/json/data/all/products';
			}
			else{
				jsonUrl = window.contextroot + '/json/data/category/' + window.categoryId + '/products';
			}
			/*console.log(jsonUrl);*/
			//console.log('Inside Table \n');
			$table.DataTable({
				lengthMenu:[[3, 5, 10, -1],['3 Records', '5 Records', '10 Records', 'All Records']],
				pageLength:5,
				/*data:products*/
				ajax: {
					url : jsonUrl,
					dataSrc : ''
				},
				columns: [
					{
						data:'code',
						mRender: function(data, type, row) {
							return '<img src = "' + window.contextroot + '/resources/Images/' + data + '.jpg" class="dataTableImg"/>';		
						}
					},
					{
						data:'name'
					},
					{
						data:'brand'
					},
					{
						data:'unitPrice',
						mRender: function(data, type, row) {
							return '&#x20B9; ' + data
						}
					},
					{
						data:'quantity',
						mRender: function(data, type, row) {
							if(data < 1){
								return '<span style="{color:red}">Out of Stock!</span>';
								}
								return data;
							}			
					},
					{
						data:'id',
						bSortable:false,
						mRender: function(data, type, row) {
							var str = '';
							str += '<a href = "' + window.contextroot + '/show/' + data + '/product" class = "btn btn-primary"><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" aria-hidden="true" focusable="false" width="1em" height="1em" style="-ms-transform: rotate(360deg); -webkit-transform: rotate(360deg); transform: rotate(360deg);" preserveAspectRatio="xMidYMid meet" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M1.679 7.932c.412-.621 1.242-1.75 2.366-2.717C5.175 4.242 6.527 3.5 8 3.5c1.473 0 2.824.742 3.955 1.715c1.124.967 1.954 2.096 2.366 2.717a.119.119 0 0 1 0 .136c-.412.621-1.242 1.75-2.366 2.717C10.825 11.758 9.473 12.5 8 12.5c-1.473 0-2.824-.742-3.955-1.715C2.92 9.818 2.09 8.69 1.679 8.068a.119.119 0 0 1 0-.136zM8 2c-1.981 0-3.67.992-4.933 2.078C1.797 5.169.88 6.423.43 7.1a1.619 1.619 0 0 0 0 1.798c.45.678 1.367 1.932 2.637 3.024C4.329 13.008 6.019 14 8 14c1.981 0 3.67-.992 4.933-2.078c1.27-1.091 2.187-2.345 2.637-3.023a1.619 1.619 0 0 0 0-1.798c-.45-.678-1.367-1.932-2.637-3.023C11.671 2.992 9.981 2 8 2zm0 8a2 2 0 1 0 0-4a2 2 0 0 0 0 4z" fill="white"/></svg></a>';
							
							return str;     
						}
					},
					{
						data:'id',
						bSortable:false,
						mRender: function(data, type, row) {
							var str = '';
							if(row.quantity < 1)
							str += '<a href = "javascript:void(0)" class = "btn btn-success disabled">Cart</a>';
							else
							str += '<a href = "' + window.contextroot + '/cart/add/' + data + '/product" class = "btn btn-success">Cart</a>';
							return str;     
						}
					}
				]
			});
		}
		
		
		//closing alert
		var $alert = $('.alert');
		if(alert.length)
		{
			
			setTimeout(function(){
				$alert.fadeOut('slow');
			}, 3000);
			
		}
	});