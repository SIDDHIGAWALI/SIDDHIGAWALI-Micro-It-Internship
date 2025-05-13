<!DOCTYPE html>
<html>
<head>
 <title>Currency Converter</title>
 <style>
 body {
 font-family: Arial, sans-serif;
 background-color: #f0f0f0;
 }
 .container {
 max-width: 400px;
 margin: 0 auto;
 padding: 20px;
 background-color: #fff;
 border-radius: 5px;
 box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
 }

 h1 {
 text-align: center;
 }

 .form-group {
 margin-bottom: 15px;
 }

 label {
 display: block;
 }

 select, input {
 width: 95%;
 padding: 10px;
 border: 1px solid #ccc;
 border-radius: 3px;
 }
button {
 display: block;
 width: 50%;
 padding: 10px;
 background-color: #007bff;
 color: #fff;
 border: none;
 border-radius: 3px;
 cursor: pointer;
 }

 #result {
 margin-top: 15px;
 text-align: center;
 font-weight: bold;
 }
 </style>
</head>
<body>
 <div class="container">
 <h1>Currency Converter</h1>
 <div class="form-group">
 <label for="amount">Amount:</label>
 <input type="number" id="amount" name="amount" required>
 </div>

 <div class="form-group">
 <label for="fromCurrency">From Currency:</label>
 <select id="fromCurrency" name="fromCurrency" required>
 <option value="INR">Indian Rupee</option>
 <option value="USD">US Dollar (USD)</option>
 <option value="EUR">Euro (EUR)</option>
 <option value="GBP">British Pound (GBP)</option>
 </select>
 </div>
 <div class="form-group">
 <label for="toCurrency">To Currency:</label>
  <select id="toCurrency" name="toCurrency" required>
 <option value="INR">Indian Rupee</option>
 <option value="USD">US Dollar (USD)</option>
 <option value="EUR">Euro (EUR)</option>
 <option value="GBP">British Pound (GBP)</option>
 </select>
 </div>

 <button type="button" onclick="convertCurrency()">Convert</button>
 <div id="result"></div>
  </div>

 <script>
function convertCurrency() {
 const fromCurrency = document.getElementById('fromCurrency').value;
 const toCurrency = document.getElementById('toCurrency').value;
 const amount = parseFloat(document.getElementById('amount').value);
 const exchangeRates = {
 INR: 1,
 USD: 0.012,
 EUR: 0.011,
 GBP: 0.0099
 }; 

const convertedAmount = (amount / exchangeRates[fromCurrency]) * 
exchangeRates[toCurrency];
 document.getElementById('result').innerText=`${amount} 
${fromCurrency} = ${convertedAmount.toFixed(2)} ${toCurrency}`;
 }
 </script>
</body>
</html>
