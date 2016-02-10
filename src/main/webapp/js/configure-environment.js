$( document ).ready(function() {
	// Loop over file of third party widgets.
	readTextFile('file:///C:/your/path/to/file.txt');

	// Append iframe for each widget.
	$('#third-party-widgets').append();
});

function readTextFile(file)
{
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", file, false);
    rawFile.onreadystatechange = function ()
    {
        if(rawFile.readyState === 4)
        {
            if(rawFile.status === 200 || rawFile.status == 0)
            {
                var allText = rawFile.responseText;
                alert(allText);
            }
        }
    }
    rawFile.send(null);
}