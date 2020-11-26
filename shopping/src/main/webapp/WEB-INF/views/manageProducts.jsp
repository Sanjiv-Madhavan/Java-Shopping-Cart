<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="container">
	<div class="row">
		<div class="col-md-8 offset-md-2">
			<div class="card-primary">
				<div class="card-header">
					<h4>Product Management</h4>
				</div>
				<div class="card-body">
					<sf:form class="form-horizontal" modelAttribute="Product">

						<div class="form-group">

							<label class="control-label col-md-16" for="name">Enter
								Product Name : </label>

							<div class="col-md-16">

								<sf:input type="text" path="name" id="name"
									placeholder="Product Name" class="form-control" />

								<em class="help-block">Please enter Product name</em>

							</div>

						</div>
						<div class="form-group">

							<label class="control-label col-md-16" for="brand">Enter
								Brand Name : </label>

							<div class="col-md-16">

								<sf:input type="text" path="brand" id="brand"
									placeholder="Brand Name" class="form-control" />

								<em class="help-block">Please enter Brand name</em>

							</div>

						</div>

						<div class="form-group">

							<label class="control-label col-md-16" for="description">Enter
								Description : </label>

							<div class="col-md-16">

								<sf:textarea path="description" id="description" rows="4"
									placeholder="Description" class="form-control" />


								<em class="help-block">Please enter Description</em>

							</div>

						</div>

						<div class="form-group">

							<label class="control-label col-md-16" for="unitPrice">Enter
								Unit Price : </label>

							<div class="col-md-16">

								<sf:input type="number" path="unitPrice" id="unitPrice"
									placeholder="Unit Price in &#x20B9" class="form-control" />


							</div>

						</div>

						<div class="form-group">

							<label class="control-label col-md-16" for="quantity">Quantitty
								Available : </label>

							<div class="col-md-16">

								<sf:input type="number" path="quantity" id="quantity"
									placeholder="Quanitity" class="form-control" />


							</div>

						</div>

						<div class="form-group">

							<label class="control-label col-md-16" for="categoryId">Category
								: </label>

							<div class="col-md-16">

								<sf:select path="categoryId" id="categoryId"
									class="form-control" items="${categories}" itemLabel="name"
									itemValue="id" />


							</div>

						</div>

						<div class="form-group">

							<div class="col-md-2">

								<input type="submit" name="submit" id="submit" value="submit"
									class="form-control" class="btn btn-primary">

								<sf:hidden path="id" />
								<sf:hidden path="code" />
								<sf:hidden path="supplierId" />
								<sf:hidden path="purchases" />
								<sf:hidden path="views" />
							</div>
						</div>
						
					</sf:form>
				</div>
			</div>
		</div>
	</div>
</div>