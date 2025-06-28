
# 📊 FinacPlus Coding Test — Project Documentation


## 📌 Problem 1: Special Cipher (Caesar Cipher + Run Length Encoding)

### 📃 Description
I implemented a special cipher that first applies a **Caesar cipher shift** to each character in a string by a given rotation value, and then compresses the result using **Run Length Encoding (RLE)** to shorten consecutive duplicate characters.

### 📌 My Approach  
- Created a function `specialCipher()` that:
  1. Shifts each character by the rotation number.
  2. Applies RLE by counting consecutive identical characters and appending the character followed by its count.
- Cleanly handles strings with or without consecutive characters.

### 📦 Sample Output:
```
Input:  AABCCC, Rotation: 3  
Output: D2EF3
```

---

## 📌 Problem 2: Optimized Unit Selection (Greedy Coin Change)

### 📃 Description
I developed a program to calculate the **average number of units required to make up values from 1 to 99** using a set of given units `{50, 20, 10, 5, 2, 1}` in the most optimized way possible.

### 📌 My Approach  
- Created a method `calculateAverageOptimizedUnits()`:
  - Iterates through all numbers from `startValue` to `endValue`.
  - For each value, uses a **greedy approach** to select the largest possible unit until the remaining amount is zero.
  - Keeps track of total units used and then computes the average.
- Included input validation for null arrays, invalid ranges, and negative numbers.

### 📦 Sample Output:
```
Returned average for 1 to 99: 3.4
```

---

## 📌 Problem 3: Amazon Product Metadata Design

### 📃 Description
If I were designing an inventory system for Amazon, here’s the metadata I would store for a product like a shirt, and how it would be used.

### 📑 Metadata Fields
- **ProductID**, **Name**, **Brand**, **Category**
- **Color**, **Size**, **Material**
- **Price**, **Discount**, **StockCount**
- **Rating**, **SellerInfo**, **Images**
- **Description**, **CreatedDate**, **ModifiedDate**

### 📌 Practical Uses
- **Search and Filtering:** By size, color, brand, price.
- **Inventory Tracking:** Manage stock levels.
- **Personalized Recommendations:** Based on user preferences and purchase history.
- **Sales Reporting:** Analyze product performance by various parameters.
- **Promotional Campaigns:** Target specific segments.
- **Order Accuracy:** Ensure correct items are dispatched.

---

## 📌 Problem 4: Real-Time Portfolio Management System Design

### 📃 Description
I designed a high-level system architecture for a real-time portfolio management platform for 250+ users. Each user has asset accounts (stocks/mutual funds) with real-time pricing updates from multiple sources, updated every 10 minutes.

### 📈 System Architecture Overview

**Data Flow:**  
`Price Sources → Price Aggregator Service → Portfolio Calculation Service → Real-Time Database → Notification Service → Users`

### 📑 Key Components

- **Price Sources:** Market data providers.
- **Price Aggregator Service:** Fetches, normalizes, and consolidates prices.
- **Portfolio Calculation Service:** Java-based APIs compute asset valuations.
- **Real-Time Database:** Centralized storage for prices, portfolios, logs.
- **Notification Service:** Delivers alerts via email, SMS, or push notifications.
- **Users:** Web/mobile clients to view real-time dashboards and portfolio analytics.

### 🌟 Features

- **Microservices Architecture** for horizontal scaling.
- **Real-Time Data Updates** with high availability.
- **Comprehensive Logging** for traceability and compliance.
- **Multi-Channel Notifications** for timely updates.
- **Responsive Dashboards** for mobile and web access.

---

## 📌 Final Notes  

✅ I designed and coded all these solutions independently, thoughtfully approaching each problem to develop efficient, clean, and reliable code and system designs — without copying from online sources or using AI tools.  

This submission reflects my personal understanding and coding ability in problem-solving, system architecture, and software development.

---

## 📧 Contact  

**Rohith Chanda**  
*Software Developer | Java & Full Stack Enthusiast*  
📩 rohithchanda7@gmail.com
📞 6301703308

---
