import React, { useState } from "react";

import CloseButton from "react-bootstrap/esm/CloseButton";

import ModifyQty from "./ModifyQty";

export default function CartItem(props) {
  const { product, onDelete, cartItems } = props;

  return (
    <div>
      <div className="cart-item">
        <CloseButton
          variant="white"
          onClick={() => onDelete(product)}
          className="close-btn"
        />
        <div className="cart-content">
          <img className="book-cover" src="/" alt="book cover" />
          <div className="cart-text">
            <h2 className="book-title">{product.title}</h2>
            <h5> {product.price} </h5>
            <h5> QTY: {product.qty} </h5>
            <ModifyQty
              maxQty={product.qty}
              onDelete={onDelete}
              product={product}
              cartItems={cartItems}
            />
          </div>
        </div>
      </div>
    </div>
  );
}
