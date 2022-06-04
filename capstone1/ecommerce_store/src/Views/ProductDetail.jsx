import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import { useLocation } from "react-router-dom";

export default function ProductDetail(props) {
  const location = useLocation();
  let book = location.state.product;

  const { onAdd } = props;

  const onClick = () => {};

  return (
    <div>
      <div className="detail-item">
        <h2 className="book-title">{book.title}</h2>
        <img className="book-cover" src="/" alt="book cover" />
      </div>
      <div className="detail-content">
        <p>{book.price}</p>
        <p>Book Description</p>
        <Button variant="primary" onClick={() => onAdd(book)}>
          ADD TO CART
        </Button>
        <Button variant="success">BUY NOW</Button>
      </div>
      {/* <HomeBar /> */} {/* might remove */}
    </div>
  );
}
