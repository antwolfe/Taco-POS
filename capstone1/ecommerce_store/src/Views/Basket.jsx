import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import CartItem from "../Components/CartItem";

export default function Basket(props) {
  const { products, cartItems, onDelete } = props;

  return (
    <div>
      <div className="cart">
        <h2 className="text-center"> Cart Items </h2>
        {cartItems.map((item) => {
          return (
            <div key={item.id}>
              <CartItem product={item} onDelete={onDelete} />
            </div>
          );
        })}
        <Button variant="primary">UPDATE CART</Button>
        <Button variant="dark">CHECKOUT</Button>
      </div>
    </div>
  );
}
