# customer-points
Calculate customer points on transaction amount

Clone/Download this project and update maven dependencies and run as spring boot thats it.

Call method by passing customer id below is the example -
Request :  
POST 
http://localhost:8080/getTransDetails
Request Body {"customerId":"cust1"} - application/json

Response :
[
    {
        "transactionId": "txn1",
        "transactionAmount": "120",
        "transactionDate": "01-01-2020",
        "customerId": "cust1",
        "customerName": "John Doe",
        "email": "johnd@cust.com",
        "points": "90"
    },
    {
        "transactionId": "txn2",
        "transactionAmount": "130",
        "transactionDate": "01-02-2020",
        "customerId": "cust1",
        "customerName": "John Doe",
        "email": "johnd@cust.com",
        "points": "110"
    },
    {
        "transactionId": "txn3",
        "transactionAmount": "140",
        "transactionDate": "01-03-2020",
        "customerId": "cust1",
        "customerName": "John Doe",
        "email": "johnd@cust.com",
        "points": "130"
    }
]
