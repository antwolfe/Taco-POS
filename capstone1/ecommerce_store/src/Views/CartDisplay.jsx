import React from "react";
import Button from "react-bootstrap/esm/Button";

export default function CartDisplay() {
  return (
    <div>
      {" "}
      <p> TOTAL: </p>
      <Button variant="success">UPDATE CART</Button>
      <Button variant="dark">CHECKOUT</Button>
    </div>
  );
}
