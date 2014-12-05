modules = {
    application {
        resource url:'js/application.js'
    }
	
	superfish {
		resource url:'js/superfish.js',disposition:'head' , bundle:'app'
	}

	jquery {
		resource url:'js/jquery.min.js',disposition:'head' , bundle:'app'
	}
	
	jqplot {
		resource url:'js/jquery.jqplot.min.js',disposition:'head' , bundle:'app'
		resource url:'js/plugins/jqplot.dateAxisRenderer.js',disposition:'head' , bundle:'app'
		resource url:'js/plugins/jqplot.bubbleRenderer.min.js',disposition:'head' , bundle:'app'
		resource url:'js/plugins/jqplot.cursor.min.js',disposition:'head' , bundle:'app'
		resource url:'js/plugins/jqplot.highlighter.min.js',disposition:'head' , bundle:'app'
		resource url:'js/plugins/jqplot.barRenderer.min.js',disposition:'head' , bundle:'app'
		resource url:'js/plugins/jqplot.pointLabels.min.js',disposition:'head' , bundle:'app'
	}
	
}