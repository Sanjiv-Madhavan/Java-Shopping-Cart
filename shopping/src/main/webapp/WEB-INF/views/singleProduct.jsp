<div class="container">
	<!-- BreadCrumb -->
	<div class="row">

		<div class="col-xs-12">

			<ol class="breadcrumb">
				<li><a href="${ctxtroot}/home">Home/</a></li>
				<li><a href="${ctxtroot}/show/all/products">Products/</a></li>
				<li>${product.name}</li>
			</ol>

		</div>

	</div>

	<div class="row">
		<!-- Pdt Image -->
		<div class="col-xs-12 col-sm-4">
			<div class="thumbnail">
				<img alt="Pic" src="${images}/${product.code}.jpg"
					class="img-thumbnail"/>
			</div>
		</div>
		<!-- Pdt Desc -->
		<div class="col-xs-12 col-sm-8">
			<h3>${product.name}</h3>
			<hr />
			<p>${product.description}</p>
			<hr />
			<h4>
				Price:<strong> &#x20B9; ${product.unitPrice} /-</strong>
			</h4>
			<hr />
			
			
			<c:choose>
			<c:when test="${product.quantity < 1}">
			<h6><span style="color:red">Out of Stock!</span></h6>
			<a href="${ctxtroot}/cart/add/${product.id}/product"
				class="btn btn-success disabled"><strike>Add to Cart</strike></a>
			</c:when>
			<c:otherwise>
			<h6>Quantity Available: ${product.quantity}</h6>
			<a href="${ctxtroot}/cart/add/${product.id}/product"
				class="btn btn-success">Add to Cart</a>
			</c:otherwise>
			</c:choose>
			
			
			
				
				 <a
				href="${ctxtroot}/show/all/products" class="btn btn-success">Back</a>

		</div>
	</div>

</div>