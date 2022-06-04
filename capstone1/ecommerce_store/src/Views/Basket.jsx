import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import CartItem from "../Components/CartItem";

export default function Basket(props) {
  const { products, cartItems } = props;
  console.log(cartItems);

  return (
    <div>
      <h2> Cart Items </h2>
      {products.map((product) => {
        return (
          <div key={product.id}>
            <CartItem product={product} />
          </div>
        );
      })}
      <Button variant="primary">UPDATE CART</Button>
      <Button variant="dark">CHECKOUT</Button>
    </div>
  );
}
