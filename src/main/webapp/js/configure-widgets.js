$( document ).ready(function() {

	// Iterate over all third party widgets.
	$.each(ThirdPartyWidgets, function(i, widget) {

		// Append iframe for each widget.
		$('#third-party-widgets').append(
			"<iframe src='" + widget.location + "' scrolling='no' seamless='seamless' width='" + widget.width + "' height='" + widget.height + "' style='border:none'></iframe>"
		);

	});

});