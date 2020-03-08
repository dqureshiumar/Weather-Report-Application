$(document).ready(function() {

	var getIP = 'http://ip-api.com/json/',
		openWeatherMap = 'http://api.openweathermap.org/data/2.5/weather',
		APPID = '0489e5201e46f6ccaa371bbf2389dedf';

	$.getJSON(getIP).done(function(location) {

	$.getJSON(openWeatherMap, {
			lat: location.lat,
			lon: location.lon,
			APPID: APPID
		})
		.done(function(weather) {

			var celsius = weather.main.temp - 273.15;
			var fahrenheit = celsius * 1.8 + 32;

			$('.currentLocation').text('Hello! Your current location is ' + location.city + ', ' + location.region + ', ' + location.country);

			
			$(document).ready(function() {
				var cel = location.city;
				console.log(cel);
				$('#location').html(cel);
			});
			
			
			$(document).ready(function() {
				var cel = celsius.toFixed(0) ;
				console.log(cel);
				$('#celcius').html(cel+"<sup>o</sup> C");
			});
			
			console.log("working");

			$('.btn-fahrenheit').on('click', function() {
				$('.currentTemperature').text('The current temperature in ' + location.city + ' is ' + fahrenheit.toFixed(0) + ' degrees Fahrenheit.');
			});
		});
	});
});