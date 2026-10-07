# API examples

## List books

GET `/api/books`

## Create a book

POST `/api/books`

```json
{
  "title": "The Pragmatic Programmer",
  "author": "Andrew Hunt",
  "price": 44.99
}
```

## Create an order

POST `/api/orders`

```json
{
  "customerEmail": "customer@example.com",
  "total": 89.98
}
```

## Error example

GET `/api/books/9999`

```json
{
  "error": "Book not found: 9999"
}
```
