import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
import CartItem from "../Components/CartItem";

export default function Basket(props) {
  const { products } = props;

  console.log(products);
  return (
    <div>
      <h2> Cart Items </h2>
      {products.map((product) => {
        console.log(product);
        <div>
          <CartItem key={product.id} product={product} />
        </div>;
      })}
      <Button variant="primary">UPDATE CART</Button>
      <Button variant="dark">CHECKOUT</Button>
    </div>
  );
}
