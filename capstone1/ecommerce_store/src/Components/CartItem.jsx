import React from "react";
import Button from "react-bootstrap/esm/Button";
import CloseButton from "react-bootstrap/esm/CloseButton";

export default function CartItem({ book }) {
  // console.log(book);

  return (
    <div>
      <div className="cart-item">
        <CloseButton className="close-btn" />
        <div className="cart-content">
          <img className="book-cover" src="/" alt="book cover" />
          <span className="cart-text">
            <h2 className="book-title">{book.title}</h2>
            <h5> {book.price} </h5>
            <h5> QTY: {book.qty} </h5>
          </span>
        </div>
      </div>
    </div>
  );
}
