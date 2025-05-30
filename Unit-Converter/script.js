// Convert Celsius to Fahrenheit
function convertTemperature() {
  const celsius = parseFloat(document.getElementById('celsius').value); // Get user input
  const fahrenheit = (celsius * 9/5) + 32; // Convert to Fahrenheit
  document.getElementById('fahrenheitResult').textContent = `${fahrenheit.toFixed(2)} °F`; // Show result
}

// Convert Kilograms to Pounds
function convertWeight() {
  const kilograms = parseFloat(document.getElementById('kilograms').value); // Get user input
  const pounds = kilograms * 2.20462; // Convert to pounds
  document.getElementById('poundsResult').textContent = `${pounds.toFixed(2)} lbs`; // Show result
}

// Convert Kilometers to Miles
function convertDistance() {
  const kilometers = parseFloat(document.getElementById('kilometers').value); // Get user input
  const miles = kilometers * 0.621371; // Convert to miles
  document.getElementById('milesResult').textContent = `${miles.toFixed(2)} mi`; // Show result
}