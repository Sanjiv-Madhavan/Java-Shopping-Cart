<div class="container">

	<div class="row">

		<div class="col-md-3">

			<%@ include file="./shared/sidebar.jsp"%>

		</div>

		<div class="col-md-9">
			<div class="row">

				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">

							<li><a href="${ctxtroot}/home"> Home </a></li>
							<li class="breadcrumb-item active" aria-current="page"> / All Products</li>
						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true}">
					
						<ol class="breadcrumb">

							<li><a href="${ctxtroot}/home"> Home /</a></li>
							<li class="breadcrumb-item active" aria-current="page"> Category </li>
							<li class="breadcrumb-item active" aria-current="page"> ${category.name} </li>
						</ol>
					</c:if>
				</div>


			</div>

		</div>

	</div>

</div>