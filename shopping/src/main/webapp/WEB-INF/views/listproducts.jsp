<div class="container">

	<div class="row">

		<div class="col-md-3">

			<%@ include file="./shared/sidebar.jsp"%>

		</div>

		<div class="col-md-9">
			<div class="row">

				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true}">
						
						<script>
							window.categoryId = '';
							/* console.log('All'); */
						</script>
						
						<ol class="breadcrumb">

							<li><a href="${ctxtroot}/home"> Home </a></li>
							<li class="breadcrumb-item" aria-current="page">/ All
								Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">
					
						<script>
							window.categoryId = '${category.id}';
							/* console.log('Category'); */
						</script>
						
						<ol class="breadcrumb">

							<li><a href="${ctxtroot}/home"> Home /</a></li>
							<li class="breadcrumb-item" aria-current="page">
								Category</li>
							<li class="breadcrumb-item" aria-current="page">
								${category.name}</li>
						</ol>
					</c:if>
				</div>

				<div class="col-xs-12">

					<table id="productListTable"
						class="table table-striped table-borderd">

						<thead>

							<tr>
								<th></th>
								<th>NAME</th>
								<th>BRAND</th>
								<th>Price</th>
								<th>Quantity Available</th>
								<th></th>
								<th></th>
							</tr>

						</thead>

					</table>

				</div>

			</div>

		</div>

	</div>

</div>