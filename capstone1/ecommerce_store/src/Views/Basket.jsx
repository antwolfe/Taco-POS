import React, { useState } from "react";
import Button from "react-bootstrap/esm/Button";
export default function Basket() {
  return (
    <div>
      <h2> Cart Items </h2>
      <Button variant="primary">UPDATE CART</Button>
      <Button variant="dark">CHECKOUT</Button>
    </div>
  );
}
