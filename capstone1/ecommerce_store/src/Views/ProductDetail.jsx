import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import { useLocation } from "react-router-dom";

export default function ProductDetail(props) {
  const location = useLocation();
  let book = location.state.product;
  const { onAdd } = props;

  return (
    <div>
      <div className="detail-item">
        <h2 className="book-title">{book.title}</h2>
        <img className="book-cover" src={book.cover} alt="book cover" />
      </div>
      <div className="detail-content">
        <p className="price">{book.price}</p>
        <p className="details">Book Details</p>
        <p>Authored in: {book.year}</p>
        <p>ISBN: {book.isbn}</p>
        <p>{book.tags && `Common tags: ${book.tags}`}</p>
        <Button variant="primary" onClick={() => onAdd(book)}>
          ADD TO CART
        </Button>
      </div>
    </div>
  );
}
