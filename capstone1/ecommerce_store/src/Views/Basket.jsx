import React from "react";
import Button from "react-bootstrap/esm/Button";

export default function Basket({ cartItems }) {
  return (
    <div>
      <h2> Cart Items </h2>
      <div>
        {cartItems.length == 0 ? (
          <div>Cart is Empty</div>
        ) : (
          <div>Map Cart Items</div>
        )}
      </div>
      <Button variant="success">UPDATE CART</Button>
      <Button variant="dark">CHECKOUT</Button>
    </div>
  );
}
