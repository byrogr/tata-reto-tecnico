TATA Technical Challenge

## Overview

This API REST based in Java with Spring Boot for the Tata technical challenge

---

## Getting Started

1. Clone this repository.
2. Run `mvn clean install` to install the project dependencies.

---
## Services

### Exchange Rates

- Description: Get list of exchange rates
- Path: `/api/exchangeRates`
- HTTP Verb: GET
- Body: none
- Response:

```json
[
  {
    "amount": 100.0,
    "amountExchangeRate": 376.01,
    "originCurrency": "USD",
    "destinationCurrency": "PEN",
    "rate": 3.76
  }
]
```

- Title: Create Exchange Rates
- Path: `/api/exchangeRates`
- HTTP Verb: POST
- Body:
```json
{
  "amount": 100,
  "originCurrency": "USD",
  "destinationCurrency": "PEN"
}
```
- Response:
```json
{
  "amount": 100.0,
  "amountExchangeRate": 376.0116,
  "originCurrency": "USD",
  "destinationCurrency": "PEN",
  "rate": 3.760116
}
```