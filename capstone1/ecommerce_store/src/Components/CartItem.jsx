import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import CloseButton from "react-bootstrap/esm/CloseButton";
import CartTotal from "./CartTotal";
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
          <span className="cart-text">
            <h2 className="book-title">{product.title}</h2>
            <h5> {product.price} </h5>
            <h5> QTY: {product.qty} </h5>
            <ModifyQty
              maxQty={product.qty}
              onDelete={onDelete}
              product={product}
              cartItems={cartItems}
            />
            <CartTotal />
          </span>
        </div>
      </div>
    </div>
  );
}
