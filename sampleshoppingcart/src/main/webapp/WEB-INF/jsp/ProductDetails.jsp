<!DOCTYPE html>
<html>
<head>
<style>
* {
    box-sizing: border-box;
}

.column {
    float: left;
    width: 33.33%;
    padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
    content: "";
    clear: both;
    display: table;
}
</style>
</head>
<body>

<h2>Images Side by Side</h2>
<p>How to create side-by-side images with the CSS float property:</p>

<div class="row">
  <div class="column">
    <img src="product1.jpg"  style="width:100%"> 
  </div>
  <div class="column">
    <img src="product2.jpg" style="width:100%"> 
  </div>
  <div class="column">
   <img src="product3.jpg" style="width:100%"> 
  </div>
</div>

</body>
</html>