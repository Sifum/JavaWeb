<!DOCTYPE html>
<html>
<head>
    <title>持卡人门户网站</title>
</head>
<body>
<div class="layout_div">
    <div class="layout_head_div">
        <@tiles.insertAttribute name="header"/>
    </div>
    <div class="layout_content_div">
	    <div><@tiles.insertAttribute name="menu"/></div>
	    <div style="border: 5px solid #f00"><@tiles.insertAttribute name="body"/></div>
	    <div style="clear:both;"></div>
    </div>
    <div style="clear:both;"></div>
    <div class="layout_foot_div">
        <@tiles.insertAttribute name="footer"/>
    </div> 
    <div style="clear:both;"></div>   
</div>
</body>
</html>
