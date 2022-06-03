import React from "react";
import Button from "react-bootstrap/esm/Button";
import CloseButton from "react-bootstrap/esm/CloseButton";

export default function CartItem() {
  return (
    <div>
      <div className="cart-item">
        <CloseButton className="close-btn" />
        <div className="cart-content">
          <img className="book-cover" src="/" alt="book cover" />
          <span className="cart-text">
            <h2 className="book-title">Book Title</h2>
            <h5> Book Price </h5>
            <h5> QTY: </h5>
          </span>
        </div>
      </div>
    </div>
  );
}
