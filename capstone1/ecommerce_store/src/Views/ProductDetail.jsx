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
        <p className="price">${book.price}</p>
        <p className="details">Book Details</p>
        <p>Published in: {book.year}</p>
        <p>{book.isbn !== 22 && `ISBN: ${book.isbn}`}</p>
        {/*All books without found isbn have 22 in data*/}
        <p>{book.tags && `Common tags: ${book.tags}`}</p>
        <p>Number in Stock: {book.inventory}</p>
        <Button
          variant="primary"
          onClick={() => {
            alert(`${book.title} has been added to cart!`);
            onAdd(book);
          }}
        >
          ADD TO CART
        </Button>
      </div>
    </div>
  );
}
