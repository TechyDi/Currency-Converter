# Currency Coverter-Java Mini Project

## Overview

Welcome to the Currency Converter project! This Java application allows users to convert amounts between four major currencies: Indian Rupees (INR), US Dollars (USD), Japanese Yen (JPY), and Euros (EUR). The program provides a simple console-based interface for currency conversion based on user input.

## Features

- **Convert from USD to INR, JPY, and EUR**
- **Convert from INR to USD, JPY, and EUR**
- **Convert from JPY to USD, INR, and EUR**
- **Convert from EUR to USD, INR, and JPY**

## How It Works

The Currency Converter program uses basic arithmetic to convert between currencies based on fixed conversion rates. The conversion rates used in the program are:
- 1 USD = 84.02 INR
- 1 USD = 143.75 JPY
- 1 USD = 0.91 EUR
- 1 INR = 0.012 USD
- 1 INR = 1.71 JPY
- 1 INR = 0.011 EUR
- 1 JPY = 0.007 USD
- 1 JPY = 0.58 INR
- 1 JPY = 0.0063 EUR
- 1 EUR = 1.10 USD
- 1 EUR = 92.06 INR
- 1 EUR = 157.58 JPY

## Code Explanation

### Classes and Methods

- **`currency` Class**: Contains all the methods and the main function for currency conversion.

#### Methods

1. **`public static void cal(double dlr)`**:
   - **Purpose**: Converts an amount from US Dollars (USD) to Indian Rupees (INR), Japanese Yen (JPY), and Euros (EUR).
   - **Parameters**: `dlr` - The amount in USD.
   - **Output**: Prints the converted amounts in INR, JPY, and EUR.

2. **`public static void cal1(double rup)`**:
   - **Purpose**: Converts an amount from Indian Rupees (INR) to USD, JPY, and EUR.
   - **Parameters**: `rup` - The amount in INR.
   - **Output**: Prints the converted amounts in USD, JPY, and EUR.

3. **`public static void cal2(double yen)`**:
   - **Purpose**: Converts an amount from Japanese Yen (JPY) to USD, INR, and EUR.
   - **Parameters**: `yen` - The amount in JPY.
   - **Output**: Prints the converted amounts in USD, INR, and EUR.

4. **`public static void cal3(double eur)`**:
   - **Purpose**: Converts an amount from Euros (EUR) to USD, INR, and JPY.
   - **Parameters**: `eur` - The amount in EUR.
   - **Output**: Prints the converted amounts in USD, INR, and JPY.

#### Main Method

- **`public static void main(String[] args)`**:
   - **Purpose**: Provides a menu for users to choose the currency they want to convert from and then prompts for the amount. Based on user input, it calls the appropriate conversion method.
   - **Functionality**:
     - Prompts the user to choose a currency type.
     - Takes user input for the amount in the chosen currency.
     - Calls the corresponding method to perform the conversion.
     - Closes the scanner object after use to prevent resource leaks.

## How to Use

1. Run the program in a Java environment.
2. Choose the currency you want to convert from by entering the corresponding number (1 for USD, 2 for INR, 3 for JPY, 4 for EUR).
3. Enter the amount you want to convert.
4. View the results displayed on the console.

## Contributing

Feel free to fork this repository and submit pull requests. Contributions are welcome to improve the application, add new features, or fix bugs.
