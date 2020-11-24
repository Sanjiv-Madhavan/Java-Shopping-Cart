<div class="container">
	<div class="row">
		<div class="col-md-8 offset-md-2">
			<div class="card-primary">
				<div class="card-header">
				<h4>Product Management</h4>
				</div>
				<div class="card-body">
				<form class="form-horizontal">
				
					<div class="form-group">
						
						<label class="control-label col-md-16" for="name">Enter Product Name : </label>
						
						<div class="col-md-16">
						
							<input type="text" name="name" id="name" placeholder="Product Name" class="form-control">
							
							<em class="help-block">Please enter Product name</em>
						
						</div>
						
					</div>
					<div class="form-group">
						
						<label class="control-label col-md-16" for="brand">Enter Brand Name : </label>
						
						<div class="col-md-16">
						
							<input type="text" name="brand" id="brand" placeholder="Brand Name" class="form-control">
							
							<em class="help-block">Please enter Brand name</em>
						
						</div>
						
					</div>
					
					<div class="form-group">
						
						<label class="control-label col-md-16" for="description">Enter Description : </label>
						
						<div class="col-md-16">
						
							<textarea type="text" name="description" id="description" rows="4" placeholder="Description" class="form-control">
							</textarea>
							
							<em class="help-block">Please enter Description</em>
						
						</div>
						
					</div>
					
					<div class="form-group">
						
						<label class="control-label col-md-16" for="unitPrice">Enter Unit Price : </label>
						
						<div class="col-md-16">
						
							<input type="number" name="unitPrice" id="unitPrice" placeholder="Unit Price in &#x20B9" class="form-control">

						
						</div>
						
					</div>
					
					<div class="form-group">
						
						<label class="control-label col-md-16" for="quantity">Quantitty Available : </label>
						
						<div class="col-md-16">
						
							<input type="number" name="quantity" id="quantity" placeholder="Quanitity" class="form-control">

						
						</div>
						
					</div>
					
					<div class="form-group">
						
						<label class="control-label col-md-16" for="categoryId">Category : </label>
						
						<div class="col-md-16">
						
							<select name = "categoryId" id="categoryId" class="form-control">
								<option value="1">Category1</option>
								<option value="2">Category2</option>
							</select>	
						
						</div>
						
					</div>
					
					<div class="form-group">
												
						<div class="col-md-2">
						
							<input type="submit" name="submit" id="submit" value="submit" class="form-control" class = "btn btn-primary">
						
						</div>
						
					</div>
				
				</form>
				</div>
			</div>
		</div>
	</div>
</div>