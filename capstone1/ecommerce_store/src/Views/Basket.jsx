import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import CartItem from "../Components/CartItem";

export default function Basket(props) {
  const { products, cartItems, onDelete } = props;

  return (
    <div>
      <h2 className="text-center"> Cart Items </h2>
      <div className="cart">
        {cartItems.map((item) => {
          return (
            <div key={item.id}>
              <CartItem product={item} onDelete={onDelete} />
            </div>
          );
        })}
        <div className="cart-btns">
          <Button variant="primary" className="cart-upd-btn">
            UPDATE CART
          </Button>
          <Button variant="dark" className="cart-checkout-btn">
            CHECKOUT
          </Button>
        </div>
      </div>
    </div>
  );
}
